package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.db.ConnectionTest;
import com.exception.DaoException;
import com.model.Employee;

public class EmployeeDaoImpl implements EmployeeDAO{

	private Connection cn;
	public String icode="INSERT INTO emp_det VALUES (?,?,?)";
	public String rcode = "SELECT * FROM emp_det";
	public String fcode = "SELECT * FROM emp_det WHERE name=?";
	public String ficode = "SELECT * FROM emp_det WHERE empid=?";
	public String dcode = "DELETE FROM emp_det WHERE name=?";
	public String ucode = "UPDATE emp_det SET name=? WHERE empid=? ";
	public EmployeeDaoImpl()
	{
		
		cn=ConnectionTest.getConnection();
		System.out.println(cn.hashCode());
	}
	@Override
	public void saveEmployee(Employee e) throws DaoException {
		
		
		try {
		PreparedStatement ps = cn.prepareStatement(icode);
		ps.setInt(1, e.getEmpid());
		ps.setString(2, e.getEmpname());
		ps.setString(3, e.getEmpCity());
		
		ps.executeUpdate();
		System.out.println("Employee created");
		}
		catch(Exception ex)
		{
			throw new DaoException("employee not created", ex);
		}
		
	}
	@Override
	public List<Employee> loadEmployee() throws DaoException {
		// TODO Auto-generated method stub
		List<Employee> a1 = new ArrayList<Employee>();
		
		
		Connection cn = ConnectionTest.getConnection();
		System.out.println(cn.hashCode());
		try {
		PreparedStatement pst = cn.prepareStatement(rcode);
		ResultSet rs = pst.executeQuery();
		while(rs.next())
		{
			Employee emp = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3));
			a1.add(emp);
		}
		}
		catch(Exception e)
		{
			throw new DaoException("employee data not found", e);
		}
		return a1;
	}
	@Override
	public Optional<Employee> findEmployee(String employee) {
		// TODO Auto-generated method stub
		cn = ConnectionTest.getConnection();
		try
		{
		PreparedStatement pst2 = cn.prepareStatement(fcode);
		pst2.setString(1, employee);
		ResultSet rs = pst2.executeQuery();
		while(rs.next())
		{
			Employee emp = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3));
			return Optional.of(emp);
		}
		}
		catch(Exception exc)
		{
			
		}
		return Optional.empty();
	}
	@Override
	public Optional<Employee> findEmpid(int employee) {
		// TODO Auto-generated method stub
		cn = ConnectionTest.getConnection();
		try
		{
		PreparedStatement pst2 = cn.prepareStatement(ficode);
		pst2.setInt(1, employee);
		ResultSet rs = pst2.executeQuery();
		while(rs.next())
		{
			Employee emp = new Employee(rs.getInt(1),rs.getString(2),rs.getString(3));
			return Optional.of(emp);
		}
		}
		catch(Exception exc)
		{
			
		}
		return Optional.empty();
	}
	@Override
	public void delEmployee(String employee) {
		// TODO Auto-generated method stub
		cn=ConnectionTest.getConnection();
		Optional<Employee> emp2 = this.findEmployee(employee);
		if(emp2.isEmpty())
		{
			System.out.println("employee is not availble");
		}
		else
		{
			try
			{
			PreparedStatement pst4 =  cn.prepareStatement(dcode);
			pst4.setString(1, employee);
			pst4.executeUpdate();
			System.out.println("deleted succesfully");
			}
			catch (Exception e) {
				// TODO: handle exception
			}
		}
		
		
	}
	@Override
	public void updateEmployee(int id, String name) {
		// TODO Auto-generated method stub
		if(this.findEmpid(id).isEmpty())
		{System.out.println("employee ledu ra hooka");}
		else {
			try {
				cn = ConnectionTest.getConnection();
				PreparedStatement pst5 = cn.prepareStatement(ucode);
				pst5.setString(1, name);
				pst5.setInt(2, id);
				
				pst5.executeUpdate();
			}
			catch(Exception exe)
			{
				
			}
		}
		
	}

}
