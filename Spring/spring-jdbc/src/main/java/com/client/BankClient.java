package com.client;

import org.apache.catalina.core.ApplicationContext;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.model.BankAccount;
import com.model.Employee;
import com.model.Insurance;
import com.service.EmployeeService;

@SpringBootApplication
@ComponentScan("com")
@EntityScan("com")
@EnableJpaRepositories("com")
public class BankClient {

	@Autowired
	private EmployeeService service;
	public static void main(String[] args)
	{
			org.springframework.context.ApplicationContext ac = SpringApplication.run(BankClient.class,args);
			
			EmployeeService serv = ac.getBean(EmployeeService.class);
			Employee emp  = new Employee(101,"dandu","dandupalyam");
			serv.saveEmployeetoOrg(emp);
	}
}
