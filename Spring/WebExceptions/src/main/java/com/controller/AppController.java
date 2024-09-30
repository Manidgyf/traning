package com.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.model.User;
import com.model.Users;
import com.service.UserService;

@RestController
@RequestMapping("/subbu")
public class AppController {

	@Autowired
	UserService usd;
	//@RequestMapping(value = "/register",method = RequestMethod.GET)
	@GetMapping("/loadall")
	public Users loading(@RequestHeader(name="x-post-persist",required=true)String hdata,@RequestHeader(name="x-pist",defaultValue="ASIA")String loc)
	{
		return usd.loadall();
	}
	
}
