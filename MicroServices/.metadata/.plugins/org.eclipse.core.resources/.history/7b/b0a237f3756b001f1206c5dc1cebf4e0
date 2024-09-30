package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.entity.Blogs;
import com.entity.Comments;
import com.entity.Owner;
import com.repo.BlogRepository;
import com.repo.OwnerRepository;

@Service
public class AddAppImpl implements AppDAO{
	
	@Autowired
	private OwnerRepository repo;
	
	@Autowired
	private BlogRepository blogrepo;

	@Override
	public void addOwner(Owner owner) {
		repo.save(owner);
		
	}

	@Override
	public void addBlog(int owner_id) {
		Owner owner = repo.findById(owner_id).get();
		List<Blogs> blogsList = new ArrayList<Blogs>();
		
		Blogs blogs1 = new Blogs("Spring", "java", "useless info");
		blogs1.setOwner(owner);
		blogsList.add(blogs1);
		
		Blogs blogs2 = new Blogs("Hibernate", "java advanced", "useful info");
		blogs2.setOwner(owner);
		blogsList.add(blogs2);
		
		owner.setBlogList(blogsList);
		repo.save(owner);
	}
	
	

	@Override
	public void addOwnerAndBlogs(Owner ownerData) {
		// TODO Auto-generated method stub
		List<Blogs> blogs = new ArrayList<Blogs>();
		for(Blogs blogin: ownerData.getBlogList()) {
			Blogs blog = new Blogs(blogin.getTitle(), blogin.getCategory(), blogin.getContent());
			blog.setOwner(ownerData);
			blogs.add(blog);
		}
		ownerData.setBlogList(blogs);
		repo.save(ownerData);
		
	}

	@Override
	public String findOwnerName(int blogid) {

		return blogrepo.findById(blogid).get().getOwner().getName();
	}
	
	@Override
	public ArrayList<String> printComments(int ownerID) {
		ArrayList<String> answer = new ArrayList<String>();
		Owner o =repo.findById(ownerID).get();
		List<Blogs> blist = o.getBlogList();
		for(int i=0;i<blist.size();i++) {
			List<Comments> clist = blist.get(i).getCommentsList();
			for(int j=0; j<clist.size();j++) {
				answer.add(blist.get(i).getBlogId()+" : "+clist.get(j).getComment());
			}
		}
		return answer;
	}
	

	@Override
	public Blogs findBlogs(int blogid) {
		return blogrepo.findById(blogid).get();
	}

	@Override
	public void deleteOwner(int ownerID) {
		repo.deleteById(ownerID);
		
	}

	@Override
	public void addComment(int blog_id) {
		Blogs blog = blogrepo.findById(blog_id).get();
		List<Comments> comlist = new ArrayList<Comments>();
		Comments c1 = new Comments("dwight", "the office is not safe");
		Comments c2 = new Comments("Meredith", "Wanna join?");
		c1.setBlogs(blog);
		c2.setBlogs(blog);
		comlist.add(c1);
		comlist.add(c2);
		blog.setCommentsList(comlist);
		blogrepo.save(blog);
	}

	@Override
	public void deleteBlog(int blog_id) {
		blogrepo.deleteById(blog_id);
		
	}

	
	

}