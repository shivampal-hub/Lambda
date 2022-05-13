package com.bl.regex;

import java.util.regex.Pattern;

public class UserRegistrationUC12 {

    /*public static void main(String[] args) {

        try {
            UserRegistrationUC12 user = new UserRegistrationUC12();
            user.isValidEmail("shivamm.@gmail.com");
        }catch (CustomException e) {
            System.out.println(e);
        }
    }
*/
    public boolean isValidEmail(String email) throws CustomException {

         if(isValidInput(Constants.EMAIL_REGEX, email) == false) {
             System.out.println(isValidInput(Constants.EMAIL_REGEX, email));
             throw new CustomException("Invalid Email");

        }
        else {
             System.out.println(isValidInput(Constants.EMAIL_REGEX, email));
            return isValidInput(Constants.EMAIL_REGEX, email);
        }
    }

    public boolean isValidPassword(String password) throws CustomException {

        if(isValidInput(Constants.Pass_REGEX, password) == false) {
            System.out.println(isValidInput(Constants.Pass_REGEX, password));
            throw new CustomException("Invalid Password");

        }
        else {
            System.out.println(isValidInput(Constants.Pass_REGEX, password));
            return isValidInput(Constants.Pass_REGEX, password);
        }

    }

    public boolean isValidMobile(String number) throws CustomException{

        if(isValidInput(Constants.MOBILE_REGEX, number) == false) {
            System.out.println(isValidInput(Constants.MOBILE_REGEX, number));
            throw new CustomException("Invalid Mobile Number");

        }
        else {
            System.out.println(isValidInput(Constants.MOBILE_REGEX, number));
            return isValidInput(Constants.MOBILE_REGEX, number);
        }

    }

    public boolean isValidFirstName(String firstName) throws CustomException{

        if(isValidInput(Constants.FirstName_REGEX, firstName) == false) {
            System.out.println(isValidInput(Constants.FirstName_REGEX, firstName));
            throw new CustomException("Invalid FirstName");

        }
        else {
            System.out.println(isValidInput(Constants.FirstName_REGEX, firstName));
            return isValidInput(Constants.FirstName_REGEX, firstName);
        }
    }

    public boolean isValidLastName(String lastName) throws CustomException{

        if(isValidInput(Constants.LastName_REGEX, lastName) == false) {
            System.out.println(isValidInput(Constants.LastName_REGEX, lastName));
            throw new CustomException("Invalid LastName");

        }
        else {
            System.out.println(isValidInput(Constants.LastName_REGEX, lastName));
            return isValidInput(Constants.LastName_REGEX, lastName);
        }
    }

    public static boolean isValidInput(String regex,String input) {

        return Pattern.matches(regex, input);

    }
}
