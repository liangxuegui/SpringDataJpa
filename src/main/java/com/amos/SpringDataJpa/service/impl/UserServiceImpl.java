package com.amos.SpringDataJpa.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.amos.SpringDataJpa.domain.User;
import com.amos.SpringDataJpa.repository.UserRepository;
import com.amos.SpringDataJpa.service.UserService;

@Service("userService")
@Transactional
public class UserServiceImpl implements UserService{
	@Autowired
	private UserRepository responsity;
	//添加用户
	public void addUser(User user){
		responsity.save(user);
	}
	public List<User> findAllUsers() {
		return responsity.findAll();
	}
	public User findById(Integer id) {
		// TODO Auto-generated method stub
		return responsity.findOne(id);
	}
	public List<User> findAllUsersByage(Integer age) {
		return responsity.findUsersByAge(age);
	}
}
