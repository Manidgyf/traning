package com.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import com.entity.Owner;
import com.service.AppDAO;

@Controller
@RequestMapping("/mainapp")
public class RestApp {

	@Autowired
	private AppDAO dao;
	
	@PostMapping("/addowner")
	@ResponseBody
	public String addOwner(@RequestBody Owner o) {
		dao.addOwner(o);
		return "owner added";
	}
	
	@PostMapping("/addblog")
	@ResponseBody
	public String addOwner(@RequestParam(name = "id") int id) {
		dao.addBlog(id);
		return "blogs added";
	}
	
	@PostMapping("/addownerandblog")
	@ResponseBody
	public String addOwnerAndBlogs(@RequestBody Owner o) {
		dao.addOwnerAndBlogs(o);
		return "owner and blog added";
	}
	
	@GetMapping("/OwnerName/{id}")
	@ResponseBody
	public Object findOwnerName(@PathVariable int id) {
		return new Object[] {"Title: "+dao.findBlogs(id).getTitle(),
							"Content: "+dao.findBlogs(id).getContent(),
							"Owner Name: "+dao.findOwnerName(id)};
	}
	
	@PostMapping("/delete/{id}")
	@ResponseBody
	public String deleteOwner(@PathVariable int id) {
		dao.deleteOwner(id);
		return "Owner deleted";
	}

	@PostMapping("/new_comment")
	@ResponseBody
	public String newComment(@RequestParam(name = "id") int id) {
		dao.addComment(id);
		return "Comment added";
	}
	
	@PostMapping("/deleteblog/{id}")
	@ResponseBody
	public String deleteBlog(@PathVariable int id) {
		dao.deleteBlog(id);
		return "Blog deleted";
	}
	
	@GetMapping("/show_comments/{id}")
	@ResponseBody
	public ArrayList<String> showComments(@PathVariable int id){
		return dao.printComments(id);
	}
}
