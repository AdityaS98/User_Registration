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

        public void lastNameValidation() {
            String lastName = sc.next();
            Pattern pattern = Pattern.compile("^[A-Z]{1}[a-z]{2,}");
            Matcher matcher = pattern.matcher(lastName);
            if (matcher.matches()) {
                System.out.println("Valid last name");
            } else {
                System.out.println("Invalid last name");
            }
        }



    public void emailValidation() {
        String email = sc.next();
        Pattern pattern = Pattern.compile("[a][b][c][.][a-z]{1,10}[@][b][l][.][c][o][.][a-z]{1,10}");
        Matcher matcher = pattern.matcher(email);
        if (matcher.matches()) {
            System.out.println("Valid Email address ");
        } else {
            System.out.println("Invalid Email address");
        }

    }


    public static void main(String[] args) {

        UserRegistration_Java obj = new UserRegistration_Java();
        obj.firstNameValidation();
        obj.lastNameValidation();
        obj.emailValidation();

    }
}
