package com.service;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.model.User;

@Component
public class UserDaoImpl implements UserDao {

	@Autowired
	private UserRepo ur; 


	@Override
	public String addUser(User usr) {
		// TODO Auto-generated method stub
		ur.save(usr);
		return "register";

	}


	@Override
	public List<User> loadall() {
	
		List<User> al = (ArrayList<User>)ur.findAll();
		
		return al;
	}


	@Override
	public void updateusr(User usr) {
		// TODO Auto-generated method stub
		ur.updateUser(usr.getUname(), usr.getUname());
		
	}

	
}
