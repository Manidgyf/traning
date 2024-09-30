package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.model.User;

@Service

public class UserDaoImpl implements UserDao {

	static List<User> lst= new ArrayList<User>();
	@Override
	public boolean findUser(String uname, String password) {
		// TODO Auto-generated method stub
		for(User us:lst)
			if(us.getUname().equals(uname)&&us.getPass().equals(password))
				return true;
				
		return false;	
	}
	@Override
	public User findUname(String uname) {
		// TODO Auto-generated method stub
		for(User us:lst)
			if(us.getUname().equals(uname))
				return us;
				
		return null;	
	}

	@Override
	public String addUser(User usr) {
		// TODO Auto-generated method stub
		lst.add(usr);
		return "register";

	}

	@Override
	public List<User> loadall() {
		// TODO Auto-generated method stub
		
		return lst;
	}
	
	@Override
	public void update(String id, User usr) {
		for(User us:lst)
			if(us.getId().equals(id))
			{	
				
			}	
		
	}
	@Override
	public boolean delete(String id) {
		lst.add(new User("101","subbu","subbu","subbu","subbu"));
		for(User us:lst)
		{
//			System.out.println(id.trim()+" - "+us);
			if(us.getId().equals(id))
			{	
//				System.out.println("In the delete block");
				lst.remove(us);
				return true;
			}
		}
		return false;
	}

}
