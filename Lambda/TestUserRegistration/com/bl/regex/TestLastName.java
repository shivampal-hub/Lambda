package com.bl.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestLastName {

    static UserRegistrationUC2 registration;

    @Before
    public void createObject() {
        registration = new UserRegistrationUC2();
        System.out.println("Before");
    }

    @Test
    public void testValidLastNameFirstLetterCapital_thenTrue() {

        System.out.println("Test : Valid Last Name With First Letter Capital");
        Assert.assertTrue(registration.isValidLastName("Shivam"));
    }

    @Test
    public void testValidLastNameFirstLetterCapitalMinThreeChar_thenTrue() {

        System.out.println("Test : Valid Last Name With First Letter Capital and min Three Char");
        Assert.assertTrue(registration.isValidLastName("Shi"));
    }

    @Test
    public void testInvalidLastNameFirstLetterNonCapital_thenFalse() {

        System.out.println("Test : Invalid Last Name With First Letter non Capital");
        Assert.assertFalse(registration.isValidLastName("shi"));
    }

    @Test
    public void testInvalidLastNameLessThanThreeLetter_thenFalse() {

        System.out.println("Test : Invalid Last Name With Less then three  Letter ");
        Assert.assertFalse(registration.isValidLastName("Sh"));
    }
}
