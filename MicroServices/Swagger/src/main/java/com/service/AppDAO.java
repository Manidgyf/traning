package com.service;

import java.util.ArrayList;

import com.entity.Blogs;
import com.entity.Owner;

public interface AppDAO {
	public void addOwner(Owner owner);
	public void addBlog(int owner_id);
	public void addOwnerAndBlogs(Owner owner);
	public String findOwnerName(int blogid);
	public Blogs findBlogs(int blogid);
	public void deleteOwner(int ownerID);
	
	public void addComment(int blog_id);
	public void deleteBlog(int blog_id);
	public ArrayList<String> printComments(int ownerID);
}
