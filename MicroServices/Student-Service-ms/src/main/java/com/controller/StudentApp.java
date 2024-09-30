package com.controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.model.Student;

@RestController
@RequestMapping("/students")
public class StudentApp {

	private static Map<String, List<Student>> stuDB;
	static
	{
		stuDB = new HashMap<String, List<Student>>();
		List<Student> lst = new ArrayList<Student>();
		lst.add(new Student("mani","nirmala","c","cesction"));
		lst.add(new Student("subbu","chaitanya","D","Dsection"));
		
		stuDB.put("BZA", lst);
		
		lst = new ArrayList<Student>();
		lst.add(new Student("dandu","nirmala","c","cesction"));
		lst.add(new Student("sathwik","chaitanya","D","Dsection"));
		stuDB.put("TPTY", lst);
	}
	@GetMapping("/list/{loc}")
	public List<Student> getDetails(@PathVariable("loc") String loc)
	{
		List<Student> sts = stuDB.get(loc);
		if(sts.isEmpty())
		{
			sts = new ArrayList<Student>();
			sts.add(new Student("na","na","na","na"));
			return sts;
		}
		return sts;
		
	}
}
