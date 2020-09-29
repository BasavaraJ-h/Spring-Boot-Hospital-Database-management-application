package com.example.webappcontact;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;




//@Controller
@RestController
public class indexcontroler {
	
	@Autowired
	DatabaseWorker DBworker;
	
	
	@RequestMapping("/index")
	public String welcome() {
		return "index";
	}
	 @RequestMapping(value ="/index/Add")
	 public ResponseEntity<Object> AddData( @RequestParam String name, @RequestParam String pnum,
			 @RequestParam String email,@RequestParam String disease, @RequestParam String wnum,
			 @RequestParam String doctor,@RequestParam String ddate, @RequestParam String mdetail,
			 @RequestParam String fees){
		 
		 	
		 DBworker.AddtoDataBase(name,pnum,email , disease,wnum ,doctor,ddate,mdetail ,fees);
		 return new ResponseEntity<>("Success", HttpStatus.OK);
	
	 }
	 

	 @RequestMapping(value ="/index/Remove")
	 public ResponseEntity<Object> RemoveData(@RequestParam String name, @RequestParam String pnum,
			 @RequestParam String email){
		 
		 DBworker.RemoveFromDataBase(name,pnum,email);
		 return new ResponseEntity<>("Success", HttpStatus.OK);
		 	
	 }
	 
	 @RequestMapping(value ="/index/Display")
	 public ResponseEntity<Object> DisplayData(){
	
		 
	return new ResponseEntity<Object>( (DBworker.getusers()), HttpStatus.OK); 
	 }

}
