package com.bridgelabz.regex;

import java.util.Scanner;

/**
 * Validate Email Id : As a User need to enter Email has 3 mandatory parts (abc,
 * bl & co) and 2 optional (xyz & in) with precise @ and . positions Ex.
 * abc.xyz@bl.co.in
 * 
 * @author : pranav gupta
 *
 */
// Method to validate Email Id
public boolean validatEmail(String name) {
    String regex = "^[\\w!#$%&'*`{|}~^-]+(?:\\.[\\w!#$%&'*`{|}~^-]+)*:([0-9]{1}|[a-zA-Z]{2,5})\\.)+[a-zA-Z]{2,3}";
    if (name.matches(regex)) {
        System.out.println("Email Id is Valid !");
        System.out.println("------------------------------------------------------------------------");
        return true;
    } else {
        System.out.println("Email Id is Invalid !");
        System.out.println("------------------------------------------------------------------------");
        return false;
    }
}
}