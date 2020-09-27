package com.ApplicationConsumer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

//@RestController
public class ApplicationConsumeController {

	//@RequestMapping("AppConsumer")
	public void getManager() {
		// TODO Auto-generated method stub
	/*	String output;
		
		RestTemplate client=new RestTemplate();
		ResponseEntity<String> result=null;
		result=client.exchange("http://localhost:6003/allproductjpa",HttpMethod.GET,createHeader(),String.class);
		//System.out.println("output="+result.getBody());
		output=result.getBody();
		result=client.exchange("http://localhost:6004/mgrdetails",HttpMethod.GET,createHeader(),String.class);
		output = output+ result.getBody();
		System.out.println("output="+output);
		*/
		
	}
	
	public static HttpEntity<?> createHeader(){
		HttpHeaders h=new HttpHeaders();
		h.set("Accept",MediaType.APPLICATION_JSON_VALUE);
		
		return new HttpEntity<>(h);
	}

}
