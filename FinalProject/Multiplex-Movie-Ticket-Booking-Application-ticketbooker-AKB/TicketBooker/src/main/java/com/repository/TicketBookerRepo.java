package com.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.entity.TicketBooker;

@Repository
public interface TicketBookerRepo extends JpaRepository<TicketBooker, Long>{

	 @Query("select t from TicketBooker t where t.foreignUserId=?1")
		TicketBooker findTicketBookerByForeignUserId(Long foreignUserId);
}
