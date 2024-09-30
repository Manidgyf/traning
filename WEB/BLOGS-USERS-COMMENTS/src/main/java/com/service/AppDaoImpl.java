package com.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.model.Blogs;
import com.model.Comments;
import com.model.Owner;
import com.repo.BlogsRepo;
import com.repo.OwnerRepo;

import jakarta.transaction.Transactional;


@Component
@Transactional
public class AppDaoImpl implements Appdao {

	@Autowired
	private OwnerRepo or;
	@Autowired
	private BlogsRepo br;
	

	@Override
	public void saveOwner(Owner owner) {
		// TODO Auto-generated method stub
		or.save(owner);
		
	}

	public void addComments(int blogid)
	{
		Blogs bl = br.findById(blogid).get();
		Comments c1 = new Comments("hello ");
		c1.setBlogs(bl);
		List<Comments> cts = new ArrayList<Comments>();
		cts.add(c1);
		bl.setCommentslist(cts);
		br.save(bl);

	}
	@Override
	public void addBlog(int ownerid) {
		// TODO Auto-generated method stub
		Owner on = or.findById(ownerid).get();
		
		Blogs b1 = new Blogs("Subbu the waarior", "psycho thriller", "hshshsh");
		b1.setOwner(on);
		
		Blogs b2 = new Blogs("dandu the singer", "Crime thriller", "hshshsh");

		b2.setOwner(on);
		
		List<Blogs> bls = new ArrayList<Blogs>();
		bls.add(b1);
		bls.add(b2);
	//	System.out.println(b1);
		on.setBloglist(bls);
		or.save(on);
		addComments(253);
	//addComments();
		

	}

	public void mani()
	{
		
	}
	@Override
	public void addOwandBlogs(Owner data) {
		// TODO Auto-generated method stub
		
		List<Blogs> lst = new ArrayList<Blogs>();
		

		for(Blogs blogIn:data.getBloglist())
		{
			
			Blogs blog = new Blogs(blogIn.getTitle(),blogIn.getCategory(),blogIn.getContent());
			List<Comments> clist = new ArrayList<Comments>();
			for(Comments cts:blogIn.getCommentslist())
			{
				
				cts.setBlogs(blog);
				clist.add(cts);
			}
			blogIn.setCommentslist(clist);
			br.save(blogIn);
			
			blogIn.setOwner(data);
			lst.add(blogIn);
		}
		data.setBloglist(lst);
		or.save(data);
		
	}

	@Override
	public Owner findOwnerBlogs(int ownerid) {
		
		return or.findById(ownerid).get();
	}

	@Override
	public Blogs findBlogs(int blogid) {
		// TODO Auto-generated method stub
		
		return br.findById(blogid).get();
	}



}
