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

    public void listOfValidEmails() {
        System.out.println("Valid Emails following below:");
        boolean b1 = Pattern.matches("^[a-z]{3}@[a-z]{2,}.[a-z]{3,}$", "abc@yahoo.com");
        System.out.println("b1 :" + b1);
        boolean b2 = Pattern.matches("^[a-z]{3}-[0-9]{3}@[a-z]{3,}.[a-z]{2,}$", "abc-100@yahoo.com");
        System.out.println("b2 :" + b2);
        boolean b3 = Pattern.matches("^[a-z]{3}.[0-9]{3}@[a-z]{3,}.[a-z]{2,}$", "abc.100@yahoo.com");
        System.out.println("b3 :" + b3);
        boolean b4 = Pattern.matches("^[a-z0-9]{2,}@[a-z]{3}.[a-z]{2,}$", "abc111@abc.com");
        System.out.println("b4 :" + b4);
        boolean b5 = Pattern.matches("^[a-z]{2,}-[0-9]{2,}@[a-z]{2,}.[a-z]{2,}", "abc-100@abc.net");
        System.out.println("b5 :" + b5);
        boolean b6 = Pattern.matches("^[a-z]{3}.[0-9]{3}@[a-z]{3}.[a-z]{3}.[a-z]{2}$", "abc.100@abc.com.au");
        System.out.println("b6 :" + b6);
        boolean b7 = Pattern.matches("^[a-z]{3}@[a-z]{2,}.[a-z]{3}.[a-z]{3}$", "abc@gmail.com.com");
        System.out.println("b7 :" + b7);
        boolean b8 = Pattern.matches("[a-z]{3,}[+]\\d{2,}@[a-z]{2,}.[a-z]{3,}", "abc+100@gmail.com");
        System.out.println("b8 :" + b8);
        boolean b9 = Pattern.matches("^[a-z]{2,}@[0-9]{1,}.[a-z]{2,}$", "abc@1.com");
        System.out.println("b9 :" + b9);
    }

    public void listOfinvalidEmail() {
        System.out.println("InValid Emails following below:");
        boolean a1 = Pattern.matches("[a-z]{4,}@[a-z].[a-z]{2,}", "abc");
        System.out.println("a1 :" + a1);
        boolean a2 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{2,}", "abc@.com.my");
        System.out.println("a2 :" + a2);
        boolean a3 = Pattern.matches("[a-z\\d]{3,}@[a-z]{2,}.[a-z]", "abc123@.gmail.a");
        System.out.println("a3 :" + a3);
        boolean a4 = Pattern.matches("[a-z\\d]{3,}@[a-z]{2,}.[a-z]{2,}", "abc123@.com");
        System.out.println("a4 :" + a4);
        boolean a5 = Pattern.matches("[a-z\\d]{3,}@[a-z]{2,}.[a-z]{2,}", "abc123@.com.com");
        System.out.println("a5 :" + a5);
        boolean a6 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{2,}", ".abc@abc.com");
        System.out.println("a6 :" + a6);
        boolean a7 = Pattern.matches("[a-z]{3,}@[a-z]{3,}.[a-z]{2,}", "abc()*@gmail.com");
        System.out.println("a7 :" + a7);
        boolean a8 = Pattern.matches("[a-z]{3,}@[a-z]{3,}.[a-z]{2,}", "abc@%*.com");
        System.out.println("a8 :" + a8);
        boolean a9 = Pattern.matches("[a-z\\d]{3,}@[a-z]{3,}.[a-z]{2,}", "abc..2002@gmail.com");
        System.out.println("a9 :" + a9);
        boolean a10 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{2,}", "abc.@gmail.com");
        System.out.println("a10 :" + a10);
        boolean a11 = Pattern.matches("[abc]{3,}@[a-z]{2,}.[a-z]{2,}", "abc@abc@gmail.com");
        System.out.println("a11 :" + a11);
        boolean a12 = Pattern.matches("[a-z]{3,}@[a-z]{2,}.[a-z]{3,}.[a-z]{2,}", "abc@gmail.com.1a");
        System.out.println("a12 :" + a12);
        boolean a13 = Pattern.matches("[abc]{3,}@[a-z]{2,}.[a-z]{2,}.[a-z]{2,}", "abc@gmail.com.aa.au");
        System.out.println("a13 :" + a13);
    }


    public void fourthPasswordValidation() {
        String password = sc.next();

        Pattern pattern = Pattern.compile("[A-Z]{1,}[0-9]{1,}[!@#$%^&*]{1}[a-z]{6,}");
        Matcher matcher = pattern.matcher(password);

        if (matcher.matches()) {
            System.out.println("It is a valid Password");
        } else {
            System.out.println("It is not a valid password");

            fourthPasswordValidation();
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
        obj.fourthPasswordValidation();
        obj.listOfValidEmails();
        obj.listOfinvalidEmail();
    }
}


