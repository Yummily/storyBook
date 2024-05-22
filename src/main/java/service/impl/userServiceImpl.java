package service.impl;


import mapper.UserMapper;
import pojo.User;
import service.userService;
import util.baseSqlSession;

public class userServiceImpl implements userService{
	
	UserMapper userMapper = baseSqlSession.getSqlSession().getMapper(UserMapper.class);

	@Override
	public Boolean login(User user) {
		User u = userMapper.selectUserByUserNameAndPassword(user);
		if (u != null) {
			return true;
		}
		else {
			return false;
		}
	}

	@Override
	public Boolean register(User user) {
		int i = userMapper.insert(user);
		if (i==1) {
			return true;
		}else {
			return false;
		}
	}

}
