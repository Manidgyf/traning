package com.service;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.model.Comments;

@Repository
public interface CommentRepo extends CrudRepository<Comments, Integer> {

}
