package com.bl.regex;

public class Constants {

    private Constants() {

    }

    public final static String FirstName_REGEX = "^[A-Z][a-z]{2,}$";
    public final static String LastName_REGEX = "^[A-Z][a-z]{2,}$";
    public final static String EMAIL_REGEX = "^[a-z0-9]{1,}([.+-][0-9a-z]{1,})?@[a-z0-9]{1,}+(.[a-z]{2,4})([.+-][a-z]{1,3})?$";
    public final static String MOBILE_REGEX = "^[0-9]{2}[ ][6-9]{1}[0-9]{9}$";
    public final static String Pass_REGEX = "^(?=.*[A-Z])(?=.*[0-9])(?=.*[@$!%*#?&])[a-z0-9A-Z@$!%*#?&]{8,}$";

}
