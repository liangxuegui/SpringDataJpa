package com.amos.SpringDataJpa.UserTest;


import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.amos.SpringDataJpa.domain.User;
import com.amos.SpringDataJpa.service.UserService;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations="classpath:spring-config.xml")
public class UserServiceTest {
	@Autowired
	private UserService userService;
	@Test
	public void testAddUser(){
		User user = new User();
		user.setName("amos");
		user.setAge(22);
		userService.addUser(user);
	}
	@Test
	public void testFindAll(){
		List<User> list = userService.findAllUsers();
		for (User user : list) {
			System.out.println(user);
		}
	}
	@Test
	public void testFindOne(){
		System.out.println(userService.findById(1));
	}
}
