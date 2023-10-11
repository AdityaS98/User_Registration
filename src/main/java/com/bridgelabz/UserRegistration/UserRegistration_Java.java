package com.bridgelabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration_Java {
    Scanner sc = new Scanner(System.in);

    public void firstNameValidation() {


        String firstName = sc.next();

        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");

        Matcher matcher = pattern.matcher(firstName);

        if (matcher.matches()) {
            System.out.println("Valid Name");
        } else {
            System.out.println("Not a valid name");
        }
    }

    public static void main(String[] args) {

        UserRegistration_Java obj = new UserRegistration_Java();
        obj.firstNameValidation();
        
    }
}
