package com.in28minutes.Junit;


//I have added comments in Junit to test push request
public class MyMath {

    int sum(int[] numbers) {
        int sum = 0;
        for (int i : numbers) {
            sum += i;
        }
        return sum; //.
    }
}