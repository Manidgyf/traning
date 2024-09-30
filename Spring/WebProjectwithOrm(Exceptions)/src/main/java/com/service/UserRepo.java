package com.service;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;


import com.model.User;

import jakarta.transaction.Transactional;

@Repository
public interface UserRepo extends CrudRepository<User, String> {

	@Query("update User set mail=?1 where uname=?2")
	@Modifying
	@Transactional
	public int updateUser(String email,String uname);
}
