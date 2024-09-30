package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.User;
import com.model.Users;

@Service

public class UserService  {

	private static Users use = new Users(); 
	static
	{
		use.getUsers().add(new User("subbu","subbu","subbu","subbu"));
		use.getUsers().add(new User("mani","mani","mani","mani"));
	}
	public Users loadall()
	{
		return use;
	}
}
