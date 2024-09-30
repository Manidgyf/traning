package com.example.Spring_Rest;

 
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Employee;

@Controller
@RequestMapping(value = "/subbu")
public class RestApp {
	
	List<Employee> lst= new ArrayList<Employee>();
	
	@RequestMapping(value = "/register",method = RequestMethod.GET)
	public String register()
	{
		return "register";
	}
 	@RequestMapping(value = "/register",method = RequestMethod.POST)
	public String Register(@RequestParam("uname")String uname,@RequestParam("pass")String pass,@RequestParam("mail")String mail,@RequestParam("city")String city)
	{
		
		Employee e1 = new Employee(uname,pass,mail,city);
		lst.add(e1);
		
		return "User Registered";
	}
	
}
