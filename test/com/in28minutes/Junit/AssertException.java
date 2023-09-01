package com.in28minutes.Junit;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class AssertException {

    ExceptionDemo exceptionDemo= new ExceptionDemo();

    //Junit 4

    @Test(expected = NullPointerException.class)
    public void ConvertToUpperCaseWithTryCatchTest(){
        String test = null;
        test.length();

        assertTrue(test.isEmpty());

    }


    //Junit 5
    @Test
    public void whenExceptionThrown_thenAssertionSucceeds() {
        Exception exception = assertThrows(NumberFormatException.class, () -> {
            Integer.parseInt("1a");
        });

        String expectedMessage = "For input string";
        String actualMessage = exception.getMessage();

        assertTrue(actualMessage.contains(expectedMessage));

    }
}
