package com.bl.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPasswordCase4 {

    static UserRegistrationUC8 registration;

    @Before
    public void createObject() {

        System.out.println("Before");
        registration =  new UserRegistrationUC8();

    }

    @Test
    public void testValidPasswordAtleastOneUpperCaseOneNumericValueOneSpecialCharAndMinEightCharacter_thenTrue() {

        System.out.println("Valid : Password");
        Assert.assertTrue(registration.isValidPassword("qwertY@q1q"));

    }

    @Test
    public void testInvalidPasswordAtleastOneUpperCaseOneNumericValueAndMinEightCharacter_thenTrue() {

        System.out.println("Valid : Password");
        Assert.assertFalse(registration.isValidPassword("qwertYq1q"));

    }


    @Test
    public void testInvalidPasswordAtleastOneUpperCaseAndMinEightCharacter_thenTrue() {

        System.out.println("Invalid : Password");
        Assert.assertFalse(registration.isValidPassword("qwertYqwq"));

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
