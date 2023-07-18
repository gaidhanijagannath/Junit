package com.in28minutes.Junit;

import org.junit.Test;
import org.junit.Before;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;



public class AssertTest {


    @Before
    public void before() {
        System.out.println("Before");
    }

    @Test
    public void test(){

        assertEquals(1,1);
        assertArrayEquals(new int[]{1, 2, 3}, new int[]{1, 2, 3});

        // assertNotNull(); assertNull(); for checking objects..
    }
}
