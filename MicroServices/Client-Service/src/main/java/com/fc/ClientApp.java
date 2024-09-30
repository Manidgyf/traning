package com.fc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.delegate.Delegate;

@RestController
@RequestMapping("/clientReq")
public class ClientApp {

	@Autowired
	Delegate appDelegate;
	@GetMapping("/studentslist/{loc}")
	public List<Object> getStudents(@PathVariable(name = "loc") String loc){
		return appDelegate.delegate(loc);
	}
	@GetMapping("/commentslist/{id}")
	public String getStudents(@PathVariable(name = "id") int id){
		return appDelegate.commentsDelegate(id);
	}
}
