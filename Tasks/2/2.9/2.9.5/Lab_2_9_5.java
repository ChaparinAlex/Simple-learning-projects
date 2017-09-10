/*
 * Create new project called TestRegExp. Add package 
 * “com.brainacad.oop.testsregexp”. Create a class Main with a main() method.
Create public static method checkPersonWithRegExp(String userNameString) which 
take String as argument and return boolean value. This method must return true 
only if argument string value begin from Uppercase, then other chars in 
Lowercase and contains only letters. In main() method declare array of String 
with next values: {“VOVA”,”Ivan”,”R2d2”,”ZX”,”Anna”,”12345”,”ToAd”,”TomCat”,” “}
Add code to check each of these values with checkPersonWithRegExp() method and 
print result to console.
Execute the program.

 */

package com.brainacad.oop.testsregexp;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Lab_2_9_5 {
	
	public static boolean checkPersonWithRegExp(String userNameString){
		String regEx = "^[A-Z]{1}[a-z]+$";
		Pattern pat = Pattern.compile(regEx);
		Matcher m = pat.matcher(userNameString);
		return m.matches();
	}

	public static void main(String[] args) {
		String[] names = {"VOVA","Ivan","R2d2","ZX","Anna","12345",
				"ToAd","TomCat"," "};
		for (String n:names){
			System.out.println(n + ":" + checkPersonWithRegExp(n));
		}

	}

}
