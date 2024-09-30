package com.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.Insurance;

import jakarta.annotation.PostConstruct;

@Repository
public class InsuranceDaoImpl extends JdbcDaoSupport implements InsuranceDao {

	@Autowired
	private DataSource ds;
	
	@PostConstruct
	void init() {
		setDataSource(ds);
	}
	@Override
	public void addInsurance(Insurance ins) {
		// TODO Auto-generated method stub
		String query =  "insert into Insurance values(?,?,?)";
		getJdbcTemplate().update(query,new Object[] {ins.getEmpId(),ins.getScheme(),ins.getAmount()});
		System.out.println("insurance added");
		

	}

}
