package com.service;

import java.util.List;

import org.springframework.stereotype.Component;

import com.model.Blogs;
import com.model.Owner;


public interface Appdao {

	public void saveOwner(Owner owner);
	public void addBlog(int ownerid);
	public void addOwandBlogs(Owner data);
	public Owner findOwnerBlogs(int ownerid);
	public Blogs findBlogs(int blogid);
	
}
