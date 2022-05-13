package com.bl.regex;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ParameterizeTests {

    private String email;
    private boolean expected;
    static UserRegistrationUC11 registration;

    @Before
    public void createObject() {

        registration = new UserRegistrationUC11();
        System.out.println("Before");

    }

    public ParameterizeTests(String email, boolean expected) {

        this.email = email;
        this.expected = expected;

    }

    @Test
    public void testValidEmail() {

        boolean actual = registration.isValidEmail(email);
        Assert.assertEquals(actual ,expected);

    }

    @Parameterized.Parameters
    public static Iterable<Object[]> email() {

        return Arrays.asList(new Object[][] {{"abc@yahoo.com" ,true},{"abc-100@yahoo.com",true},{"abc.100@yahoo.com" ,true},
                {"abc111@abc.com",true},{"abc-100@abc.net",true},{"abc.100@abc.com.au",true},{"abc@1.com",true},
                {"abc@gmail.com.com",true},{"abc+100@gmail.com",true},{"abc@.com.my",false},{"abc123@gmail.a",false},
                {"abc123@.com",false},{"abc123@.com.com",false},{".abc@abc.com",false},{"abc()*@gmail.com",false},
                {"abc@%*.com",false},{"abc..2002@gmail.com",false},{"abc.@gmail.com",false},{"abc@abc@gmail.com",false}
                ,{"abc@gmail.com.1a",false},{"abc@gmail.com.aa.au",false}});
    }
}
