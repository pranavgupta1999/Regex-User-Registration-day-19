package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * Validate Password : As a User need to follow pre-defined Password rules. Rule
 * 3 – Should have at least 1 Numeric Number
 * 
 * @author : pranav gupta
 *
 */
// Method to validate Password
public void validatePassword(String password) {
    String passwordRegex = "(?=.*[A-Z])(?=.*[0-9])[0-9a-zA-Z!@#$%^&*_.+-]{}";
    if (password.matches(passwordRegex)) { // check Input and Pattern
        System.out.println("'" + password + "'" + " is valid Password !");
        System.out.println("--------------------------------------------");
    } else {
        System.out.println("'" + password + "'" + " is Invalid Password !");
        System.out.println("\nPassword Should have : \n1. Minimum 8 charatcers \n2. At least 1 Upper Case \n3. At least 1 Numeric Number");
        System.out.println("-------------------------------------------------------------------");
    }
}
}
