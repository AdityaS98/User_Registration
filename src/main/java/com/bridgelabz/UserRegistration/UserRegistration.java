package com.bridgelabz.UserRegistration;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistration {

    public boolean firstNameValidation(String firstName) throws UserRegistrationException {
        if (Pattern.matches("^[A-Z]{1}[a-z]{2,}", firstName)) {
            return true;
        } else {
            throw new UserRegistrationException("You have entered Wrong First Name");
        }
    }

}