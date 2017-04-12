package com.chen.action;

import com.chen.entity.UsersEntity;
import com.chen.service.UserService;
import com.opensymphony.xwork2.ActionSupport;
import org.apache.commons.lang3.StringUtils;
import org.apache.commons.logging.LogFactory;
import org.apache.struts2.ServletActionContext;

import javax.annotation.Resource;
import java.util.List;

/**
 * 用户类action
 * Created by chen on 2017/4/12.
 */
public class LoginAction extends ActionSupport{
    @Resource
    private UserService userService;
    private UsersEntity user;
    private String loginResult;

    public String login() {
        if (user != null) {
            if (StringUtils.isNoneBlank(user.getUserEmail()))&&StringUtils.isNoneBlank(user.getUserPwd()) {
                loginResult = "请输入账号和密码不能为空！";
                //根据用户的账号和密码查询用户列表
                List<UsersEntity> list = userService.findUserByIdAndPwd(user.getUserEmail(),user.getUserPwd());
                if (list != null && list.size() > 0) {//登陆成功
                    //1,1将用户信息保存到session中
                    UsersEntity user = list.get(0);
                    //1.2根据用户id查找该用户的所有角色
                    ServletActionContext.getRequest().getSession().setAttribute(Constant.USER, user);

                    //1.3将用户登陆记录到日志文件
                    LogFactory.getLog(getClass()).info("用户名称为：" + user.getMemo() + "的用户登陆了系统");
                    //1.4重定向跳转到首页
                    return "home";
                } else {//登陆失败
                    loginResult = "用户名或密码错误！";
                }
            }
        }else {
            loginResult = "请输入账号和密码！";
        }
        return toLoginUI();
    }
}
