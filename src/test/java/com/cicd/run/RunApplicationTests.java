package com.cicd.run;

import static org.junit.jupiter.api.Assertions.assertFalse;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class RunApplicationTests {

	@Autowired
	ServicePalindrome servicePalindrome;
	
	@Test
	void contextLoads() {
		assertFalse(servicePalindrome.isPalindrome("hello"));
	}

}
