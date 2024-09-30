package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dao.EmployeeDaoImpl;
import com.model.Employee;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeDaoImpl edi;
	
	public void saveEmployeetoOrg(Employee e)
	{
		edi.add(e);
	}
}
