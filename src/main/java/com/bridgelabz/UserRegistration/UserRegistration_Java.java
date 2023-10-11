package com.bridgelabz.UserRegistration;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration_Java {
    Scanner sc = new Scanner(System.in);


    public void firstNameValidation() {

        System.out.println("Enter First Name");


        String firstName = sc.next();

        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");

        Matcher matcher = pattern.matcher(firstName);

        if (matcher.matches()) {
            System.out.println("Valid Name");
        } else {
            System.out.println("Not a valid name");
            firstNameValidation();
        }
    }

    public void lastNameValidation() {
        System.out.println("Enter Last Name");
        String lastName = sc.next();
        Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
        Matcher matcher = pattern.matcher(lastName);
        if (matcher.matches()) {
            System.out.println("Valid last name");
        } else {
            System.out.println("Invalid last name");
            lastNameValidation();
        }
    }


    public void emailValidation() {
        System.out.println("Enter Email");
        String email = sc.next();
        Pattern pattern = Pattern.compile("[a][b][c][.][a-z]{1,10}[@][b][l][.][c][o][.][a-z]{1,10}");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Valid Email address ");
        } else {
            System.out.println("Invalid Email address");
            emailValidation();
        }

    }


    public void mobileNumberValidation() {
        System.out.println("Enter Mobile No");
        String mobile = sc.next();

        Pattern pattern = Pattern.compile("^[1-9]{2}+[0-9]{10}$");
        Matcher matcher = pattern.matcher(mobile);

        if (matcher.matches()) {
            System.out.println("Mobile Number is valid");
        } else {
            System.out.println("Mobile Number is invalid ");
            mobileNumberValidation();
        }
    }


    public void firstPasswordValidation() {
        System.out.println("Enter first Password");
        String password = sc.next();

        Pattern pattern = Pattern.compile("[a-z]{8,}");
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
            firstPasswordValidation();
        }

    }

    public void secondPasswordValidation() {
        String password = sc.next();

        Pattern pattern = Pattern.compile("[A-Z]{1,}[a-z]{7,}");

        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("Password is valid");
        } else {
            System.out.println("Password is invalid");
            secondPasswordValidation();
        }
    }

    public void thirdPasswordValidation() {
        String password = sc.next();
        Pattern pattern = Pattern.compile("[A-Z]{1,}[0-9]{1,}[a-z]{6,}");

        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("It is a valid password");
        } else {
            System.out.println("It ia an invalid password");
            thirdPasswordValidation();
        }
    }


    public static void main(String[] args) {

        UserRegistration_Java obj = new UserRegistration_Java();
        obj.firstNameValidation();
        obj.lastNameValidation();
        obj.emailValidation();
        obj.mobileNumberValidation();
        obj.firstPasswordValidation();
        obj.secondPasswordValidation();
        obj.thirdPasswordValidation();
    }
}


