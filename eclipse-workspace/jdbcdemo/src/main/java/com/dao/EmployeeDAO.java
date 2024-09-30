package com.dao;

import java.util.List;
import java.util.Optional;

import com.exception.DaoException;
import com.model.Employee;

public interface EmployeeDAO {

	void saveEmployee(Employee e) throws DaoException;
	
	List<Employee> loadEmployee() throws DaoException;
	Optional<Employee> findEmpid(int employee);
	Optional<Employee> findEmployee(String employee);
	
	void delEmployee(String employee);
	
	void updateEmployee(int id,String name);
}

