package com.bl.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestMobileNumber {

    static UserRegistrationUC4 registration;

    @Before
    public void createObject() {

        registration = new UserRegistrationUC4();
        System.out.println("Before");

    }

    @Test
    public void testValidMobileNumberStartingWithSeven_thenTrue() {

        System.out.println("Valid : Number");
        Assert.assertTrue(registration.isValidMobile("91 7999295772"));

    }

    @Test
    public void testValidMobileNumberStartingWithEight_thenTrue() {

        System.out.println("Valid : Number");
        Assert.assertTrue(registration.isValidMobile("91 8999295772"));

    }


    @Test
    public void testValidMobileNumberStartingWithNine_thenTrue() {

        System.out.println("Valid : Number");
        Assert.assertTrue(registration.isValidMobile("91 9999295772"));

    }


    @Test
    public void testInvalidMobileNumberWithNineDigits_thenFalse() {

        System.out.println("InValid : Number");
        Assert.assertFalse(registration.isValidMobile("91 999929577"));

    }

    @Test
    public void testInvalidMobileNumberWithElevenDigits_thenFalse() {

        System.out.println("InValid : Number");
        Assert.assertFalse(registration.isValidMobile("91 99992957712"));

    }

    @Test
    public void testInvalidMobileNumberStartingWithTwo_thenFalse() {

        System.out.println("InValid : Number");
        Assert.assertFalse(registration.isValidMobile("91 2999295771"));

    }

    @Test
    public void testInvalidMobileNumberStartingWithThree_thenFalse() {

        System.out.println("InValid : Number");
        Assert.assertFalse(registration.isValidMobile("91 3999295771"));

    }

    @Test
    public void testInvalidMobileNumberStartingWithFour_thenFalse() {

        System.out.println("InValid : Number");
        Assert.assertFalse(registration.isValidMobile("91 4999295771"));

    }

    @Test
    public void testInvalidMobileNumberStartingWithFive_thenFalse() {

        System.out.println("InValid : Number");
        Assert.assertFalse(registration.isValidMobile("91 5999295771"));

    }

    @Test
    public void testValidMobileNumberStartingWithSix_thenTrue() {

        System.out.println("Valid : Number");
        Assert.assertTrue(registration.isValidMobile("91 6999295771"));
    
    }
}
