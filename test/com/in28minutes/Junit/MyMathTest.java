package com.in28minutes.Junit;

import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class MyMathTest {


    MyMath myMath = new MyMath();

    //run before every test.
    @Before
    public void before(){
        System.out.println("before");
    }

    @After
    public void after(){
        System.out.println("After");
    }

    @BeforeClass
    public static void beforeClass(){
        System.out.println("beforeClass");
    }

    @AfterClass
    public static void afterClass(){
        System.out.println("afterClass");
    }

    //order of test execution can by anything.

    @Test
    public void sumWith3Numbers(){

        //fail("not yet implemented..........");
        /*
        in JUnit absence of failure means success.
        'i.e' even if there are no checks, it will still execute as Success.
        */

        System.out.println("Test 1");
        int result = myMath.sum(new int[]{3,4,6});

        //we have to check whether the values are right
        assertEquals(13,result);
    }

    @Test
    public void sumWith4Numbers(){
        System.out.println("Test 2");
        assertEquals(20, myMath.sum(new int[]{3,4,6,7}));
    }

    @Test
    public void sumWith5Numbers(){

        System.out.println("Test 3");
        assertEquals(21, myMath.sum(new int[]{3,4,6,7,1}));

    }

}
