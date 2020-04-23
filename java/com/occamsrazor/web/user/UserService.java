package com.occamsrazor.web.user;


public interface UserService {
public void add(User user);

public int count(); //인공지능으로 public이 추가된다 신기하다

public User login(User user);
public User detail(String userid);

}
