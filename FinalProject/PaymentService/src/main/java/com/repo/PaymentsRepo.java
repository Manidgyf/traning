package com.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.entity.Payments;

import jakarta.transaction.Transactional;

@Repository
public interface PaymentsRepo extends JpaRepository<Payments,Long>{

	
	@Query("select p from Payments p where p.ticketId=?1")
	@Transactional
	public List<Payments> findByTicketId(Long ticketId);
}
