package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * Valid Last Name - Last name starts with Cap and has minimum 3 characters
 * 
 * @author : pranav gupta
 *
 */
public class ValidateUserRegistration {
	
	// Method to validate user last name
	public boolean validateLastName(String name) {
		String pattern = "^[A-Z]{1}[a-zA-Z]{2,}$";

		if (name.matches(pattern)) {
			System.out.println("'" + name + "'" + " is Valid Last Name !");
			System.out.println("------------------------------------");
			return true;
		} else {
			System.out.println("'" + name + "'" + " is Invalid Last Name !");
			System.out.println("------------------------------------");
			return false;
		}
	}
}