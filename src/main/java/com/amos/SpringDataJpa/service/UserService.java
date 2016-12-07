package com.amos.SpringDataJpa.service;



import java.util.List;

import com.amos.SpringDataJpa.domain.User;

public interface UserService {
	public void addUser(User user);
	public List<User> findAllUsers();
	public User findById(Integer id);
}
