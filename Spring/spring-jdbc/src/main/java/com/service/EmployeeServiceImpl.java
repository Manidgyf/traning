package com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.dao.BankDao;
import com.dao.EmployeeDao;
import com.dao.InsuranceDao;
import com.model.BankAccount;
import com.model.Employee;
import com.model.Insurance;

@Service
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	EmployeeDao ed;
	@Autowired
	InsuranceDao insu;
	@Autowired
	BankDao ba;
	
//	@Override
//	public void saveEmployeetoDB(Employee emp) {
//		
//		ed.saveEmployee(emp);
//	}
	@Override
	public void saveEmployeetoOrg(Employee emp) {
		// TODO Auto-generated method stub
		ed.saveEmployee(emp);
	
		
		
	}

}
