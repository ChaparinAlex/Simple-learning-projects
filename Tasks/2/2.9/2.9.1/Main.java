/*
 * Create new project called TestStrings1. Add package 
 * “com.brainacad.oop.teststring1”. Create a class Main with a main() method.
 * In method main() declare local variable myStr of String type and assign a 
 * value: “abracadabra”. Using the methods of the class String, do next steps:
-	Find the index of first “ra” substring  of myStr value and print result to 
console.
-	Find the index of last “ra” substring of myStr value and print result to 
console.
-	Get substring of myStr from 3 to 7 char index and print result to console.
-	Create static method reverseString(String) which return String value as 
result with changed order of letters (reverse it, for example “abcd” ->”dcba”).
-	Invoke reverseString() method with myStr argument and print result to 
console.
Execute the program.

 */

package com.brainacad.oop.teststring1;

public class Main {
	
	static String reverseString(String string){
		String temp = new String("");
		for (int i = string.length() - 1; i >= 0; i--){
			temp += string.charAt(i);
		}
		return temp;
	}

	public static void main(String[] args) {
		String myStr = "abracadabra";
		int i1 = myStr.indexOf("ra");
		int i2 = myStr.lastIndexOf("ra");
		String subMyStr = myStr.substring(3, 7);
		String myStr1 = "12345";
		String myStr2 = reverseString(myStr1);
        
		System.out.println("i1 = " + i1 + "\n" + "i2 = " + i2 + "\nsubMyStr = "
		+ subMyStr + "\nmyStr1 = " + myStr1 + "\nReverse string = " + myStr2);
	}

}
