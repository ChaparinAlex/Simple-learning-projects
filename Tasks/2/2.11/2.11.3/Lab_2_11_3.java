/*
 * Create new project called  ExceptionDemo.
Add package “com.brainacad.oop.testexcp1”.
Create class Main with method main(). 
Create class Person with fields firstName (of String type), lastName (String), 
age (int).
Add to class Person setters and getters for each field. 
Create InvalidAgeException class  that is subclass of RuntimeException. 
Setter in class Person which will modify age (setAge(int )) should throw 
InvalidAgeException when age out of range 1-120.
Add code to method main() to create one Pearson object and invoke setAge() 
method with exception handling using try-catch statement
Execute the program.

 */

package com.brainacad.oop.testexcp1;

public class Lab_2_11_3 {

	public static void main(String[] args) {
		
		Person p = new Person();
		try{
			p.setAge(121);
		}catch(InvalidAgeException e){
			System.out.println("InvalidAgeException happens!");
			p.setAge(1);
		}
		
		System.out.println("After the 1-st block \"try-catch\"... p.age = " +
		p.getAge());
		
		try{
			p.setAge(120);
		}catch(InvalidAgeException e){
			System.out.println("InvalidAgeException happens!");
		}
		
		System.out.println("After the 2-nd block \"try-catch\"... p.age = " +
				p.getAge());
	}

}
