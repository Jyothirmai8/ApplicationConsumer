package com.ApplicationConsumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;

import com.ApplicationConsumer.controller.ApplicationConsumeController;



@SpringBootApplication
public class ApplicationConsumerApplication {

	public static void main(String[] args) {
		//SpringApplication.run(ApplicationConsumerApplication.class, args);
		ApplicationContext ctx = SpringApplication.run(ApplicationConsumerApplication.class, args);
		
		ApplicationConsumeController cc = ctx.getBean(ApplicationConsumeController.class);
		cc.getManager();
	}
	
	
	@Bean
	public ApplicationConsumeController genClass(){
		return new ApplicationConsumeController();
	}
	

}
