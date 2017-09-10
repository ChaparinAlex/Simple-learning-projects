/*
 * Create new project called  TestNested1. Add package 
 * �com.brainacad.oop.testnest1�.
Create a class MyPhoneBook which contains static nested class PhoneNumber.
1) Add to class PhoneNumber two fields: name (of String type) and phone 
(�f String type), constructor with two parameters (name, phone) and getters for
 each class field.
Override the toString() method in PhoneNumber to return information about name 
and phone number.
2) Add to class MyPhoneBook private field phoneNumbers as array of PhoneNumber 
(array length of 10).
3) Add to class MyPhoneBook public method addPhoneNumber()  with  two 
parameters, of String type (name, phone) which use it to create new PhoneNumber
 object and pass it to next available array element. 
4) Add to class MyPhoneBook public method printPhoneBook() which iterates over
phoneNumbers  array in loop and print name and phone number information of each
 record to console.
5) Create a class Main with a main() method. Add to method main() code that 
creates MyPhoneBook object and fill it with five phone number records. Add code
to invoke printPhoneBook() method.
6) Execute the program.
Example of program output:
Name: Sasha, phone: 050123456
Name: Vova, phone: 067987654

 */

package com.brainacad.oop.testnest1;

import java.util.Scanner;

public class Lab_2_12_1 {

	public static void main(String[] args) {
		MyPhoneBook myPhoneBook = new MyPhoneBook();
		System.out.println("Please, enter 5 contacts to phonebook.");
		Scanner sc;
		String tempName, tempPhone;
		for (int i = 0; i < 5; i++){
			System.out.println("\nEnter data of " + (i+1) + " contact:");
			System.out.print("Name: ");
			sc = new Scanner(System.in);
			tempName = sc.nextLine();
			System.out.print("Phone: ");
			sc = new Scanner(System.in);
			tempPhone = sc.nextLine();
			myPhoneBook.addPhoneNumber(tempName, tempPhone);
		}
		System.out.println();
		myPhoneBook.printPhoneBook();
	}

}
