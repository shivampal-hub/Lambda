package com.bl.regex;

import java.util.regex.Pattern;

public class UserRegistrationUC13 {

    public static void main(String[] args) {

        ValidFirstName isValidFirstName = firstName -> { return isValidInput(Constants.FirstName_REGEX, firstName);};
        System.out.println("FirstName : " +isValidFirstName.validFirstName("Shivam"));

        ValidLastName isValidLastName = lastName -> { return isValidInput(Constants.LastName_REGEX, lastName);};
        System.out.println("LastName : " +isValidLastName.validLastName("Pal"));

        ValidEmail isValidEmail = email -> { return isValidInput(Constants.EMAIL_REGEX, email);};
        System.out.println("Email : " +isValidEmail.validEmail("shivamm.ppal@gmail.com"));

        ValidMobile isValidMobile = number -> {return isValidInput(Constants.MOBILE_REGEX, number);};
        System.out.println("MobileNumber : " +isValidMobile.validMobile("91 9999295772"));

        ValidPassword isValidPassword = password -> { return isValidInput(Constants.Pass_REGEX, password);};
        System.out.println("Password : " +isValidPassword.validPassword("Qwerty@123"));

    }

    public static boolean isValidInput(String regex,String input) {

        return Pattern.matches(regex, input);

    }
}
