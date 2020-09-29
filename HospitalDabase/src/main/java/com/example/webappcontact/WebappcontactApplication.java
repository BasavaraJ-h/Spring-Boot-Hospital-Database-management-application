package com.example.webappcontact;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@SpringBootApplication
public class WebappcontactApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebappcontactApplication.class, args);
	}
	
	 @RequestMapping(value ="/index/a")
	 public ResponseEntity<Object> getData(){
		 
		 demo DEEMO = new demo();
		 DEEMO.setEmail("1");
		 DEEMO.setName("NAMOGN");
		 return new ResponseEntity<>(DEEMO, HttpStatus.OK);
		 
	 }

}
