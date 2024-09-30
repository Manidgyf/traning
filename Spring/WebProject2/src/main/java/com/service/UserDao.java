package com.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.model.User;

public interface UserDao {

	boolean findUser(String uname,String password);
	String addUser(User usr);
	List<User> loadall();
	User findUname(String uname);
	void update(String id,User usr);
	boolean delete(String id);
}
