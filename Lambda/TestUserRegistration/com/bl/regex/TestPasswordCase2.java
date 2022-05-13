package com.bl.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPasswordCase2 {

    static UserRegistrationUC6 registration;

    @Before
    public void createObject() {

        System.out.println("Before");
        registration =  new UserRegistrationUC6();

    }

    @Test
    public void testValidPasswordAtleastOneUpperCaseAndMinEightCharacter_thenTrue() {

        System.out.println("Valid : Password");
        Assert.assertTrue(registration.isValidPassword("qwertYqwq"));

    }

    @Test
    public void testInvalidPasswordWithoutUpperCaseAndMinEightCharacter_thenFalse() {

        System.out.println("Invalid : Password");
        Assert.assertFalse(registration.isValidPassword("qwertqwq"));

    }



    @Test
    public void testInvalidPasswordLessThanEightCharacter_thenFalse() {

        System.out.println("Invalid : Password");
        Assert.assertFalse(registration.isValidPassword("qwe"));

    }
}
