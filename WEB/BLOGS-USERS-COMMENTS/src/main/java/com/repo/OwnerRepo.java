package com.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Owner;

@Repository
public interface OwnerRepo extends CrudRepository<Owner, Integer> {

}
