package com.client;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.model.BankAccount;
import com.model.Employee;
import com.model.Insurance;
import com.service.EmployeeService;

@SpringBootApplication
@ComponentScan("com")
public class BankClient {

	@Autowired
	private EmployeeService service;
	public static void main(String[] args)
	{
			org.springframework.context.ApplicationContext ac = SpringApplication.run(BankClient.class,args);
			
			EmployeeService serv = ac.getBean(EmployeeService.class);
			Employee emp  = new Employee(101,"dandu","dandupalyam");
			Insurance ins = new Insurance(101,"dandu jeevitham",90000);
			BankAccount ban = new BankAccount(101,"dandu bank","VICKS");
			serv.saveEmployeetoOrg(emp, ins,ban);
	}
}
