package com.fc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delegate.BlogDelegate;


@RestController
@RequestMapping("/request")
public class BlogClient {

	@Autowired
	BlogDelegate appDelegate;
	@GetMapping("/ownerblogs/{id}")
	public String getStudents(@PathVariable(name = "id") int oid){
		return appDelegate.getOwner(oid);
	}
	@GetMapping("/commentslist/{id}")
	public String getComments(@PathVariable(name = "id") int bid){
		return appDelegate.commentsDelegate(bid);
	}
}
