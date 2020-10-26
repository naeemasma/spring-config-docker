package com.example;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
public class SpringbootApplication {
	public static void main(String[] args) {
		SpringApplication.run(SpringbootApplication.class, args);
	}
	
  @RefreshScope  
  @RestController 
  class MessageRestController {
  
	  @Value("${message:Example Application Home Page!}") 
	  private String message;
  
	  @RequestMapping("/welcome")
	  String getMessage() { 
		  return this.message; 
	  } 
  }
}
