package com.controller;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Comments;
import com.service.KafkaService;

@RestController
@RequestMapping("/subbu")
public class LocationController {

	@Autowired
	private KafkaService service;
	
	
	@GetMapping("/addcomment")
	public String addComment()
	{
		
			
			Comments cts = new Comments("hello");
		
			for(int i=0;i<10000;i++)
				this.service.notify(cts.getBody());
		service.addComment(cts);
		return "notified";
		
	}
}
