package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;


import com.model.Employee;
import com.model.Project;
import com.service.EmployeeService;

@Controller
@RequestMapping("/project-employee")
public class AppController {
	
	@Autowired
	EmployeeService es;
	@PostMapping("/add")
	@ResponseBody
	String add(@RequestBody Employee ep)
	{

		es.saveEmployeetoOrg(ep);
		return "employee and project added succesfully";
	}

}
