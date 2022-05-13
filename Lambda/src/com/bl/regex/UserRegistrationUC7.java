package com.bl.regex;


import java.util.regex.Pattern;

public class UserRegistrationUC7 {

    public boolean isValidPassword(String password) {

        return isValidInput(Constants.Pass_REGEX ,password);

    }

    public boolean isValidMobile(String number) {

        return isValidInput(Constants.MOBILE_REGEX, number);

    }

    public boolean isValidFirstName(String firstName) {

        return isValidInput(Constants.FirstName_REGEX, firstName);

    }

    public boolean isValidLastName(String lastName) {

        return isValidInput(Constants.LastName_REGEX, lastName);

    }

    public boolean isValidEmail(String email) {

        return isValidInput(Constants.EMAIL_REGEX, email);

    }

    public static boolean isValidInput(String regex,String input) {

        return Pattern.matches(regex, input);

    }
}
