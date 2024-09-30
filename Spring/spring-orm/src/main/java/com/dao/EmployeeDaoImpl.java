package com.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.Employee;

import jakarta.annotation.PostConstruct;

@Repository
public class EmployeeDaoImpl extends JdbcDaoSupport implements EmployeeDao {

	@Autowired
	private DataSource ds;
	
	@PostConstruct
	private void init()
	{
		setDataSource(ds);
	}
	@Override
	public void saveEmployee(Employee employee) {
		// TODO Auto-generated method stub
		String query = "insert into emp_det values(?,?,?)";
		getJdbcTemplate().update(query,new Object[]{employee.getEmpid(),employee.getEmpname(),employee.getEmpCity()});
	System.out.println("employee added");
	}
	@Override
	public List<Employee> loadEmployees() {
		// TODO Auto-generated method stub
		String quer = "select*from emp_det";
		
		return getJdbcTemplate().query(quer, (rs,rownum)->new Employee(rs.getInt(1),rs.getString(2),rs.getString(3)));
		
		
	}
	@Override
	public Employee getEmp(int empid) {
		String sql = "select*from emp_det where empId=?";
		 getJdbcTemplate().queryForObject(sql, new Object[] {empid},new RowMapper<Employee>() {

			@Override
			public Employee mapRow(ResultSet rs, int rowNum) throws SQLException {
				Employee employ = new Employee(rs.getInt("empId"),rs.getString("empName"),rs.getString("empCity"));
				return employ;
			}});
	return null;
		
	}

	

}
