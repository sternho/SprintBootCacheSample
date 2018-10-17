package com.test;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class TestCmd implements CommandLineRunner {
	
	@Autowired
	ForeignEndpointGateway geteway;

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Test CommandLineRunner...");
		
		Message msg;
		
		msg = geteway.findMessage(1);
		System.out.println(msg);
		msg = geteway.findMessage(2);
		System.out.println(msg);
		msg = geteway.findMessage(1);
		System.out.println(msg);
		msg = geteway.findMessage(2);
		System.out.println(msg);
		Thread.sleep(5000);

		msg = geteway.findMessage(1);
		System.out.println(msg);
		msg = geteway.findMessage(2);
		System.out.println(msg);
	}

}
