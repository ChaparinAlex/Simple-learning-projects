/*
 * Create new project called TestStrings3. Add package 
 * “com.brainacad.oop.teststring3”.
Create a class Main with a main() method. 
Create static method: uniqueChars(String s), which must  take a String as 
argument and return an array of distinct (unique) chars (char[]) of the given 
string. In method main() add code to invoke uniqueChars() method and pass 
string: “Using methods of class String” as argument. Print result to console.
Execute the program.

 */

package com.brainacad.oop.teststring3;

public class Lab_2_9_3 {
	
	static char[] uniqueChars(String s){
		StringBuilder sb = new StringBuilder(s);
		boolean f = false;
		int temp;
		for (int i = 0; i < sb.length(); i++){
			for (int j = i + 1; j < sb.length(); j++){
				if (sb.charAt(i) == sb.charAt(j)){
					sb.deleteCharAt(j);
					j--;
					f = true;
				}
			}
			if (f){
				sb.deleteCharAt(i);
				f = false;
				i--;
			}
		}
		return sb.toString().toCharArray();
	}

	public static void main(String[] args) {
		char[] charArray = uniqueChars("Using methods of class String");
		for (char c:charArray){
			System.out.print(c);
		}
	}

}
