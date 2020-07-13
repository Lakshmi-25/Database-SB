package com.database.ex1.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class DbController {
	
	@PostMapping("/pin")
	public String view(@RequestBody Long pinNbr){
		try
		{
		 String	response=pinNbr.toString();
		 System.out.println(response);
		}catch(Exception e) {
			e.getStackTrace();
		}
		return "processed";
	}
}
