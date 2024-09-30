package com.example.spring_security;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class AppController {

	@GetMapping("/welcome")
	public String wel()
	{
		return "welcome";
	}
	
	@GetMapping("/admin")
	public String admin()
	{
		return "admin";
	}
	@GetMapping("/emp")
	public String emp()
	{
		return "emp";
	}
	@GetMapping("/manager")
	public String manage()
	{
		return "manager";
	}
	@GetMapping("/ad")
	public String ad()
	{
		return "ad";
	}
	@GetMapping("/common")
	public String cmn()
	{
		return "common";
	}
	@GetMapping("/home")
	public String home()
	{
		return "home";
	}
	@GetMapping("/qa")
	public String qa()
	{
		return "qa";
	}
}


