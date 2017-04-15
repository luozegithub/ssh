package com.chen.action;

import com.chen.entity.UsersEntity;
import com.chen.service.UserService;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;

import javax.annotation.Resource;
import java.util.List;
import java.util.Map;

/**
 * 用户类action
 * Created by chen on 2017/4/12.
 */
public class HomeAction extends ActionSupport {
    @Resource
    private UserService userService;
    private UsersEntity user;
    private String msg;

    public String doLogin() {
        if (user != null) {
            if (StringUtils.isNoneBlank(user.getUserEmail()) && StringUtils.isNoneBlank(user.getUserPwd())) {
                //根据用户的账号和密码查询用户
                List<UsersEntity> list = userService.findUserByIdAndPwd(user.getUserEmail(), user.getUserPwd());
                if (list != null && list.size() > 0) {//登陆成功
                    //将用户信息保存到session中
                    UsersEntity user = list.get(0);
                    Map<String, Object> map = ActionContext.getContext().getSession();
                    map.put("loginUser", user);
                    //登录成功跳转到主页
                    return "home";
                } else {//登陆失败
                    msg = "用户名或密码错误！";
                }
            }
        } else {
            msg = "请输入账号和密码！";
        }
        //登录失败重新登录
        return "login";
    }

    public String doRegist() {
        if (user != null) {
            if (StringUtils.isNoneBlank(user.getUserEmail()) && StringUtils.isNoneBlank(user.getUserPwd()) && StringUtils.isNoneBlank(user.getUserName())) {
                //查找是否存在该用户
                if (userService.findObjectById(user.getUserEmail()) == null) {//没有该用户可以注册
                    userService.save(user);
                    //注册成功
                    msg = "注册成功";
                    return "regist";
                } else {//登陆失败
                    msg = "该用户已经存在！";
                }
            }
        } else {
            msg = "请输入个人信息！";
        }
        //登录失败重新登录
        return "regist";
    }

    public UserService getUserService() {
        return userService;
    }

    public void setUserService(UserService userService) {
        this.userService = userService;
    }

    public UsersEntity getUser() {
        return user;
    }

    public void setUser(UsersEntity user) {
        this.user = user;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }
}
