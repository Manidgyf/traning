package com.repo;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.entity.Blogs;
@Repository
public interface BlogRepository extends CrudRepository<Blogs, Integer> {

}
