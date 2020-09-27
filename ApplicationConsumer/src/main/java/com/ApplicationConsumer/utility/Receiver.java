package com.ApplicationConsumer.utility;

import java.util.concurrent.CountDownLatch;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.annotation.KafkaListener;


public class Receiver {
	
	private CountDownLatch cc=new CountDownLatch(1);
	
	public CountDownLatch getCc() {
		return cc;
	}
	
	
	
	@KafkaListener(topics = "mytopic1")
	public void receive(String m) {
		System.out.println(m);
		
		cc.countDown();
	}

}
