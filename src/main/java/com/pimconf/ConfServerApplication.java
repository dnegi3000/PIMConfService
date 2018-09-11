package com.pimconf;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.boot.SpringApplication;

@SpringBootApplication
@EnableConfigServer 
public class ConfServerApplication 	{
	
	 public static void main(String[] args) {
		 SpringApplication.run(ConfServerApplication.class, args);
		 }
	
	

}
