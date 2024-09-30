package com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.model.Blogs;
import com.model.Owner;
import com.service.Appdao;

@Controller
@RequestMapping("/subbu")
public class AppController {
	
	@Autowired
	Appdao ad;
	
	@PostMapping("/addOwner")
	@ResponseBody
	String add(@RequestBody Owner owner)
	{

		ad.saveOwner(owner);
		return "employee and project added succesfully";
	}
	
	@RequestMapping(value = "/addblogs",method=RequestMethod.POST)
	@ResponseBody
	String addB(@RequestParam(name="id") int ownerid)
	{

		ad.addBlog(ownerid);
		return "Oh my madam blogs added balle balle";
	}
	
	@PostMapping("/addBO")
	@ResponseBody
	String addOB(@RequestBody Owner own)
	{

		ad.addOwandBlogs(own);
		return "Oh my madam blogs added with owner balle balle";
	}
	
	@PostMapping("/findblogs/{id}")
	@ResponseBody
	Owner findOwner(@PathVariable("id") int id)
	{

		return ad.findOwnerBlogs(id);
	}
	
	@PostMapping("/findbyblogid/{id}")
	@ResponseBody
	Object findByBlogs(@PathVariable("id") int id)
	{

		Blogs b = ad.findBlogs(id);
		return b;
	}
}
