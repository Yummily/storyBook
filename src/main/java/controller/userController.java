package controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;

import pojo.User;
import service.impl.userServiceImpl;
import util.baseSqlSession;

@RestController
@RequestMapping("/user")
public class userController {
	userServiceImpl serviceImpl;
	
	@PostMapping("/login")
	public String login(@RequestBody User user) {
		serviceImpl = new userServiceImpl();
		Boolean key = 	serviceImpl.login(user);
		baseSqlSession.closeSqlSession();
		if (key) {
			return "登录成功";
		}
		else
			return "登陆失败";
	}
	@PostMapping("/register")
	public String register(@RequestBody User user) {
		serviceImpl = new userServiceImpl();
		Boolean key = serviceImpl.register(user);
		baseSqlSession.commitSqlsession();
		baseSqlSession.closeSqlSession();
		if (key) {
			return "注册成功";
		}else {
			return "注册失败";
		}
		
	}

}
