package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.User;
import com.service.UserDao;

@Controller
@RequestMapping("/subbu")
public class AppController {

	@Autowired
	UserDao usd;
	//@RequestMapping(value = "/register",method = RequestMethod.GET)
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	@RequestMapping(value = "/login",method = RequestMethod.GET)
	public String login()
	{
		return "login";
	}
	
	@GetMapping("/loadall")
	@ResponseBody
	public List<User> loadall()
	{
		return usd.loadall();
	}
	
	@GetMapping("/finduser/{uname}")
	@ResponseBody
	public Object find(@PathVariable String uname)
	{
		User us = usd.findUname(uname);
		if(us==null)
		{
			return "not found";
		}
		else
		{
			return us;
		}
	}
}
