package com.bl.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestPasswordCase1 {

    static UserRegistrationUC5 registration;

    @Before
    public void createObject() {

        System.out.println("Before");
        registration =  new UserRegistrationUC5();

    }

    @Test
    public void testValidPasswordMinEightCharacter_thenTrue() {

        System.out.println("Valid : Password");
        Assert.assertTrue(registration.isValidPassword("qwertyqw"));

    }

    @Test
    public void testInvalidPasswordLessThanEightCharacter_thenFalse() {

        System.out.println("Invalid : Password");
        Assert.assertFalse(registration.isValidPassword("qwertysdferg"));

    }
}
