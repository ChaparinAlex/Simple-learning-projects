/*
 * Create new project called TestTokennizer. 
Add package “com.brainacad.oop.teststokennizer”.
Create a class Main with a main() method.
In method main() declare local variables myStr add code which split a 
string by “space” “comma” and “.dot” delimiter using StringTokennizer  class, 
and iterate the StringTokenizer elements and print it out one by one to console. 
String myStr = “This is String, split by StringTokenizer. Created by 
Student:Name of Student”.
Execute the program.

 */

package com.brainacad.oop.teststokennizer;

import java.util.StringTokenizer;

public class Lab_2_9_4 {

	public static void main(String[] args) {
		String myStr = "This is String, split by StringTokenizer. Created by "
				+ "student: Oleksandr Chaparin.";
		System.out.println("The base sentence is:\n" + myStr);
		StringTokenizer s1 = new StringTokenizer(myStr);
		StringTokenizer s2 = new StringTokenizer(myStr, ",");
		StringTokenizer s3 = new StringTokenizer(myStr, ".");
		System.out.println("\nToken is \" \"(space):");
		while (s1.hasMoreElements()){
			System.out.println(s1.nextElement());
		}
		System.out.println("\nToken is \",\"(comma):");
		while (s2.hasMoreElements()){
			System.out.println(s2.nextElement());
		}
		System.out.println("\nToken is \".\"(dot):");
		while (s3.hasMoreElements()){
			System.out.println(s3.nextElement());
		}
	}

}
