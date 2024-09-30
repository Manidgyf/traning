package com.repo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Comments;

@Repository
public interface CommentsRepo extends CrudRepository<Comments, Integer> {

}
