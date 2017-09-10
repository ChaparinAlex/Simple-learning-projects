package com.brainacad.oop.testexcp1;

public class MyTest {
    public void test() throws MyException{
    	throw new MyException("It's exception within method \"test\"!");
    }
}
