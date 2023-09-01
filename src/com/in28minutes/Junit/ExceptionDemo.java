package com.in28minutes.Junit;

public  class ExceptionDemo {
    public String convertToUpperCase(String input) {
        if (input.isEmpty()) {
            throw new IllegalArgumentException("Input empty, cannot convert to upper case!!");
        }
        return input.toUpperCase();
    }
}
