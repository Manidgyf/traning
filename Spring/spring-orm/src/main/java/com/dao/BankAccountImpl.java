package com.dao;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.support.JdbcDaoSupport;
import org.springframework.stereotype.Repository;

import com.model.BankAccount;

import jakarta.annotation.PostConstruct;

@Repository
public class BankAccountImpl extends JdbcDaoSupport implements BankDao {

	@Autowired
	private DataSource ds;
	
	@PostConstruct
	public void init()
	{
		setDataSource(ds);
	}
	
	@Override
	public void createAccount(BankAccount ba) {
		
		String qer = "insert into BankAccount values(?,?,?)";
		getJdbcTemplate().update(qer,new Object[]{ba.getEmpId(),ba.getEmpname(),ba.getOrgName()});
		System.out.println("account created");
		
	}

}
