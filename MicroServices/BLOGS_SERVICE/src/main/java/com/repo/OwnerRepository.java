package com.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Owner;

@Repository
public interface OwnerRepository extends CrudRepository<Owner, Integer> {

}
