/*
 * Create new project called  WrapperDemo2.
Add package “com.brainacad.oop.testwrapper2”.
Create class Main with method main(). 
Add to class Main static method compute( , ) that use as arguments two 
different numeric wrapper classes, adds the values of the two instances 
together, and then creates a third numeric wrapper instance whose value 
is the sum and return it.
For example:
static method compute(Byte, Integer) witch return Long type.
In method main() write code to invoke compute(,) and print result to console.
Execute the program.

 */

package com.brainacad.oop.testwrapper2;

public class Lab_2_10_2 {
	
	static Long compute(Byte byteVar, Integer intVar){
		return byteVar.longValue() + intVar.longValue();
	}

	public static void main(String[] args) {
		System.out.println("128 + 335 = " + compute((byte)128, 335));
	}

}
