package com.delegate;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Delegate {

	@Autowired
 RestTemplate rs ;
	

	public RestTemplate template()
	{
		return new RestTemplate();
	}

 public List<Object> delegate(String input)
 {
	 List<Object> ls = rs.exchange("http://STUDENT-SERVICE-MS/students/list/{input}",
		 HttpMethod.GET,null,
		 new ParameterizedTypeReference<List<Object>>(){},input).getBody();
	 return ls;
}
 public String commentsDelegate(String blogid)
 {
	 String response = rs.exchange("http://localhost:8082/mainapp/show_comments/{blogid}",
			 HttpMethod.GET,null,
			 new ParameterizedTypeReference<String>(){},blogid).getBody();
	 return response;
 }
}
