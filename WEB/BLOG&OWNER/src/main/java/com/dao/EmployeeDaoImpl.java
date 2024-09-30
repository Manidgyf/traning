package com.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Employee;
import com.model.Project;
import com.repo.EmployeeRepo;


@Component
public class EmployeeDaoImpl implements Employeedao {

	@Autowired
	private EmployeeRepo er;
	@Override
	public void add(Project p) {
		// TODO Auto-generated method stub

	
		
	}

}
