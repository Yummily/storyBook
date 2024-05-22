package service;

import pojo.User;

public interface userService {
	
	public Boolean login(User user);
	public Boolean register(User user);

}
