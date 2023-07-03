package com.cicd.run;

import org.springframework.stereotype.Service;

@Service
public class ServicePalindrome {

	boolean isPalindrome(String s) {
		return s.equals(new StringBuilder(s).reverse().toString());
	}
}
