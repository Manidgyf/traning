package com.client;

import java.util.List;
import java.util.Optional;

import com.dao.EmployeeDaoImpl;
import com.exception.DaoException;
import com.model.Employee;

public class Client {

	public static void main(String[] args) {
		Employee  emp = new Employee(103,"subbu","sullurupeta");
		EmployeeDaoImpl edi = new EmployeeDaoImpl();
		try {
			//edi.saveEmployee(emp);
			//List<Employee> list1= edi.loadEmployee();
			//for(Employee e:list1)
			//	System.out.println(e);
			//Optional<Employee> emp1 = edi.findEmployee("har");
			//System.out.println(emp1);
			//edi.updateEmployee(101,"swaminarayanan");
			edi.delEmployee("hari");
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println(e.getMessage());
		}
		
				
	}
}
