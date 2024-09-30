package com.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Blogs;

@Repository
public interface BlogsRepo extends CrudRepository<Blogs, Integer> {

}
