package com.delegate;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class BlogDelegate {


	@Autowired
	RestTemplate rs ;
	
	@Bean
	@LoadBalanced
	public RestTemplate template()
	{
		return new RestTemplate();
	}
	public String getOwner(int input)
	{
		 String response = rs.exchange("http://BLOGS-SERVICE/mainapp/OwnerName/{input}",
				 HttpMethod.GET,null,
				 new ParameterizedTypeReference<String>(){},input).getBody();
		 return response;
	}
	 public String commentsDelegate(int blogid)
	 {
		 String response = rs.exchange("http://BLOGS-SERVICE/mainapp/show_comments/{blogid}",
				 HttpMethod.GET,null,
				 new ParameterizedTypeReference<String>(){},blogid).getBody();
		 return response;
	 }
	
}
