package com.amos.SpringDataJpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.amos.SpringDataJpa.domain.User;
@Repository
public interface UserRepository extends JpaRepository<User, Integer> {
	/**
	 * 
	 */
	@Query("from User u where u.age>:age")
	public List<User> findUsersByAge(@Param("age")Integer age);
}
