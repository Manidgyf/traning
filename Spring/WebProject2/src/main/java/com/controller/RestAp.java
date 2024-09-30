package com.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.service.UserDao;
import com.service.UserDaoImpl;


@RestController
@RequestMapping(value = "/subbu")
public class RestAp {
	
	@Autowired
	UserDaoImpl usd;
	

 	//@RequestMapping(value = "/register",method = RequestMethod.POST)
	//public String Register(@RequestParam("uname")String uname,@RequestParam("pass")String pass,@RequestParam("mail")String mail,@RequestParam("city")String city)
 	@PostMapping("/register")
	public String regpage(@ModelAttribute User usr)
 	//public String regpage(@RequestBody User usr)
 	{
		
		
		String str =  usd.addUser(usr);
		return str;
		
	}
 	

 	@RequestMapping(value = "/login",method = RequestMethod.POST)
	public String logpage(@RequestParam("uname")String uname,@RequestParam("pass")String pass)
	{
 		if(usd.findUser(uname, pass))
 		{
 			return "logsuccess";
 		}
 		
 			return "login";
	}
 	@DeleteMapping("/delete/{id}")
 	public String delete(@PathVariable("id") String id)
 	{
 		if(usd.delete(id))
 		{
 			return "deleted"+usd.loadall();
 		}
		return "not deleted"+usd.loadall();
 		
 	}
	
}