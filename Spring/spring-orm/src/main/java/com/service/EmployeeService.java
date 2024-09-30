package com.service;

import com.model.BankAccount;
import com.model.Employee;
import com.model.Insurance;

public interface EmployeeService {

	//public void saveEmployeetoDB(Employee emp);
	public void saveEmployeetoOrg(Employee emp,Insurance ins,BankAccount bs);

	
}
