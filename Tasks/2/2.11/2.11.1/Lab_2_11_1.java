/*
 * Create new project called  TestException. Add package 
 * “com.brainacad.oop.testexcp1”.
Create a class Main with a main() that throws an object of class Exception 
inside a try block. Give the constructor for Exception a String argument. 
Catch the exception inside a catch clause and print the String argument. 
Add a finally clause and print a message to prove you were there.
Execute the program.

 */

package com.brainacad.oop.testexcp1;

public class Lab_2_11_1 {

	public static void main(String[] args) {
		try{
			throw new Exception("Exception!");
		}catch(Exception e){
			System.out.println(e.getMessage());
		}finally{
			System.out.println("I'm in block \"finally\"!");
		}
	}

}
