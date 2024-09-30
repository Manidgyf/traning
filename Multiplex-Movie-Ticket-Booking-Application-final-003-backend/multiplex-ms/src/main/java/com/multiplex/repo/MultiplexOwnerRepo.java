package com.multiplex.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.multiplex.entity.Multiplex;
import com.multiplex.entity.MultiplexOwner;

@Repository
public interface MultiplexOwnerRepo extends JpaRepository<MultiplexOwner, Long>{
	@Query("select m.multiplexOwnerId from MultiplexOwner m where m.foreignUserId=?1")
	Long findOwnerIdByForeignUserId(Long foreignUserId);
}
