package com.bl.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestEmail {

    static UserRegistrationUC9 registration;

    @Before
    public void createObject() {

        registration = new UserRegistrationUC9();
        System.out.println("Before");

    }

    @Test
    public void testValidEmailCase1_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc@yahoo.com"));

    }

    @Test
    public void testValidEmailCase2_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc-100@yahoo.com"));

    }

    @Test
    public void testValidEmailCase3_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc.100@yahoo.com"));

    }

    @Test
    public void testValidEmailCase4_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc111@abc.com"));

    }

    @Test
    public void testValidEmailCase5_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc-100@abc.net"));

    }

    @Test
    public void testValidEmailCase6_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc.100@abc.com.au"));

    }

    @Test
    public void testValidEmailCase7_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc@1.com"));

    }

    @Test
    public void testValidEmailCase8_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc@gmail.com.com"));

    }

    @Test
    public void testValidEmailCase9_thenTrue() {

        System.out.println("Test : Valid Email");
        Assert.assertTrue(registration.isValidEmail("abc+100@gmail.com"));

    }

    @Test
    public void testInvalidEmailCase1_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("shivammppalgmail.com"));

    }

    @Test
    public void testInvalidEmailCase2_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc@.com.my"));

    }

    @Test
    public void testInvalidEmailCase3_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc123@gmail.a"));

    }

    @Test
    public void testInvalidEmailCase4_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc123@.com"));

    }

    @Test
    public void testInvalidEmailCase5_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc123@.com.com"));

    }

    @Test
    public void testInvalidEmailCase6_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail(".abc@abc.com"));

    }

    @Test
    public void testInvalidEmailCase7_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc()*@gmail.com"));

    }

    @Test
    public void testInvalidEmailCase8_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc@%*.com"));

    }

    @Test
    public void testInvalidEmailCase9_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc..2002@gmail.com"));

    }

    @Test
    public void testInvalidEmailCase10_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc.@gmail.com"));

    }

    @Test
    public void testInvalidEmailCase11_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc@abc@gmail.com"));

    }

    @Test
    public void testInvalidEmailCase12_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc@gmail.com.1a"));

    }

    @Test
    public void testInvalidEmailCase13_thenFalse() {

        System.out.println("Test : Invalid Email");
        Assert.assertFalse(registration.isValidEmail("abc@gmail.com.aa.au"));

    }
}
