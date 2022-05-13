package com.bl.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserRegistrationUC1 {

    public boolean isValidFirstName(String firstName) {

        Pattern p = Pattern.compile("^[A-Z][a-z]{2,}$");
        Matcher m = p.matcher(firstName);
        boolean isValid = m.matches();

        if (isValid) {
            System.out.println("Valid: " + firstName);
        } else {
            System.out.println("Invalid Entry.Please check again");
        }
        return isValid;
    }
}
