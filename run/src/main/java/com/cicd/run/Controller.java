package com.cicd.run;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@Autowired
	ServicePalindrome servicePalindrome;
	
	boolean testPalindrome(@RequestParam String s) {
		return servicePalindrome.equals(s);
	}
}
