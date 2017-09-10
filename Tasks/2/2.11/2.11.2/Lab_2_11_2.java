/*
 * Open project called  TestException.
1) Create your own exception class MyException using the extends keyword. 
Write a constructor for this class that takes a String argument and stores it 
inside the object with a String reference. Write a method that prints out the 
stored string. 
Add to method main() a try-catch clause to exercise your new exception.
2) Write a class MyTest with a method test() that throws an exception of the 
MyException type. Try compiling it without an exception specification to see 
what the compiler says. Add the appropriate exception specification (throws). 
Try out your class and its exception inside a try-catch clause.
Execute the program.
3) Define an MyTest object reference and initialize it to null. Try to call a 
method through this reference. Now wrap the code in a try-catch clause to catch
the exception.
Execute the program.

 */

package com.brainacad.oop.testexcp1;

public class Lab_2_11_2 {

	public static void main(String[] args) {
		try{
			throw new MyException("New exception!");
		}catch(Exception e){
			MyException.printString();
		}
		
		try{
			MyTest mTest = new MyTest();
			mTest.test();
		}catch(Exception e){
			MyException.printString();
		}
		
		MyTest obj = null;
		try{
			obj.test();
		}catch(Exception e){
			System.out.println("Exception is catched");
		}
		
	}

}
