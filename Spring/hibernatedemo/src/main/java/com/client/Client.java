package com.client;



import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.entity.Employee;
import com.factory.FactoryProvider;

public class Client {

	public static void main(String[] args) {
		
	
	Session ses = FactoryProvider.getsession();
	Session ses2 = FactoryProvider.getsession();
	Employee emp = new Employee();
	emp.setEmpcity("jharkhand");
	emp.setEmpname("swapnil");
	Transaction trans = ses.beginTransaction();
	ses.save(emp);
	trans.commit();
//	System.out.println("employee added");
	
	///LOAD
//	Query quer = ses.createQuery("from Employee");
//	List<Employee> data = quer.list();
//	for(Employee empl:data)
//	{
//		System.out.println(empl);
//	}
	
	Employee emp2 = ses.load(Employee.class, new Integer(1));
	System.out.println(emp2);
	
	Employee emp3 = ses2.load(Employee.class, new Integer(1));
	System.out.println(emp3);
	
	Employee emp4 = ses2.load(Employee.class, new Integer(1));
	System.out.println(emp4);
	
	}
	
}
