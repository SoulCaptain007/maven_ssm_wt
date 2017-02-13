package com.yztc.serviceImpl;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.yztc.mapper.UserMapper;
import com.yztc.pojo.User;
import com.yztc.service.UserService;

@Service("userService")
public class UserServiceImpl implements UserService {
	@Autowired
	public UserMapper userMapper;
	
	@Override
	public List<User> findAll() {
		return userMapper.findAll();
	}
}
