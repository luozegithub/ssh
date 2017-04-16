create table users
(
  user_email varchar(20) not null primary key,
  user_name varchar(20) null,
  user_pwd varchar(20) null
);

CREATE TABLE schoolForum.comment
(
  comment_id INT PRIMARY KEY AUTO_INCREMENT,
  topic_id INT,
  user_name VARCHAR(20),
  comment_content VARCHAR(20)
)