package com.delegate;

import java.util.List;

import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpMethod;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class Delegate {

 RestTemplate rs = new RestTemplate();

 public List<Object> delegate(String input)
 {
	 List<Object> ls = rs.exchange("http://localhost:8081/students/list/{input}",
		 HttpMethod.GET,null,
		 new ParameterizedTypeReference<List<Object>>(){},input).getBody();
	 return ls;
}
 public String commentsDelegate(int blogid)
 {
	 String response = rs.exchange("http://localhost:8082/mainapp/show_comments/{blogid}",
			 HttpMethod.GET,null,
			 new ParameterizedTypeReference<String>(){},blogid).getBody();
	 return response;
 }
}
