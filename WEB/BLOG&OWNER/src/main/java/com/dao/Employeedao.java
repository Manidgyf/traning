package com.dao;

import org.springframework.stereotype.Component;

import com.model.Employee;
import com.model.Project;
import com.repo.EmployeeRepo;

public interface Employeedao {

	public void add(Project p);

}
