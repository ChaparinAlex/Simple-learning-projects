package com.brainacad.oop.testexcp1;

public class MyException extends Exception{
	
	private static String s;
    
	public MyException(String s){
		this.s = s;
	}
	
	public static void printString(){
		System.out.println(s);
	}
}
