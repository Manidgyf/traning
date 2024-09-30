package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.User;
import com.service.UserDao;

@Controller
@RequestMapping(value = "/subbu")
public class AppController {

	@Autowired
	UserDao usd;
	//@RequestMapping(value = "/register",method = RequestMethod.GET)
	@GetMapping("/register")
	public String register()
	{
		return "register";
	}
	
	@GetMapping("/loadall")
	@ResponseBody
	public List<User> loadall() {
		return usd.loadall();
	}
}
