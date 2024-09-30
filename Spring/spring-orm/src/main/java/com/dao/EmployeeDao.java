package com.dao;

import java.util.List;

import com.model.Employee;

public interface EmployeeDao {

	public void saveEmployee(Employee employee);
	
	public List<Employee> loadEmployees();
	
	public Employee getEmp(int empid);
}
