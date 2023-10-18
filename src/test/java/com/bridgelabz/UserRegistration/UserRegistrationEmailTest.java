package com.bridgelabz.UserRegistration;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

public class UserRegistrationEmailTest {

    UserRegistration obj = new UserRegistration();

    @ParameterizedTest
    @CsvSource({
            "abc@yahoo.com,true",
            "abc-100@yahoo.com,false",
            "abc.100@yahoo.com,false",
            "abc111@abc.com,false",
            "abc-100@abc.net,false",
            "abc.100@abc.com.au,false",
            "abc@1.com,false",
            "abc@gmail.com.com,false",
            "abc+100@gmail.com,false"})
    void testEmailValidation(String emailAddress) {
        boolean isValid = obj.validEmail(emailAddress);
        Assertions.assertTrue(isValid);
    }

    @ParameterizedTest
    @CsvSource({"abc", "@.com.my", "abc123@gmail.a", "abc123@.com", "abc123@.com.com",
            ".abc@abc.com", "abc()*@gmail.com", "abc@%*.com", "abc..2002@gmail.com", "abc..2002@gmail.com",
            "abc@abc@gmail.com", "abc@gmail.com.1a", "abc@gmail.com.aa.au"})
    void testInvalidEmail(String email) {
        boolean isInvalid = obj.validEmail(email);
        Assertions.assertFalse(isInvalid);
    }

}

