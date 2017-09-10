/*
 * Create new project called TestStrings2. Add package 
 * “com.brainacad.oop.teststring2”.
Create a class Main with a main() method. In method main() declare two local 
variables myStr1 and myStr2 of String type and assign a value “Cartoon” for 
first string and ”Tomcat” for second. Write code to display all of the letters,
which are present in the first word, but absent in the second.

 */

package com.brainacad.oop.teststring2;

public class Lab_2_9_2 {

	public static void main(String[] args) {
		String myStr1 = "Cartoon";
		String myStr2 = "Tomcat";
        
		String letterString = "";
		loop:
		for (int i = 0; i < myStr1.length(); i++){
			for (int j = 0; j < myStr2.length(); j++){
				if (myStr1.charAt(i) == myStr2.charAt(j)){
					continue loop;
				}
				if (j == myStr2.length() - 1){
					letterString += myStr1.charAt(i);
				}
			}
		}
		StringBuilder sb = new StringBuilder(letterString);
		for (int i = 0; i < sb.length(); i++){
			for (int j = i + 1; j < sb.length(); j++){
				if (sb.charAt(i) == sb.charAt(j)){
					sb.deleteCharAt(j);
				}
			}
		}
		System.out.println("myStr1 = " + myStr1 + "\nmyStr2 = " + myStr2);
		System.out.println("Charecters which are present in myStr1 and absent"
				+ "in myStr2 are: " + sb);
	}

}
