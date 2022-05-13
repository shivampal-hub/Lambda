package com.bl.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFirstName {

    static UserRegistrationUC1 registration;

    @Before
    public void createObject() {
        registration = new UserRegistrationUC1();
        System.out.println("Before");
    }

    @Test
    public void testValidFirstNameFirstLetterCapital_thenTrue() {

        System.out.println("Test : Valid First Name With First Letter Capital");
        Assert.assertTrue(registration.isValidFirstName("Shivam"));
    }

    @Test
    public void testValidFirstNameFirstLetterCapitalMinThreeChar_thenTrue() {

        System.out.println("Test : Valid First Name With First Letter Capital and min Three Char");
        Assert.assertTrue(registration.isValidFirstName("Shi"));
    }

    @Test
    public void testInvalidFirstNameFirstLetterNonCapital_thenFalse() {

        System.out.println("Test : Invalid First Name With First Letter non Capital");
        Assert.assertFalse(registration.isValidFirstName("shi"));
    }

    @Test
    public void testInvalidFirstNameLessThanThreeLetter_thenFalse() {

        System.out.println("Test : Invalid First Name With Less then three  Letter ");
        Assert.assertFalse(registration.isValidFirstName("Sh"));
    }
}
