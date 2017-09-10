/*
 * Open project  WrapperDemo2 (from 2.10 lab).
Add to class Main assertions code that checks correct result of executing 
compute( , ) method. The compute( , ) method use as argument s two different 
numeric wrapper classes, adds the values of the two instances together, and 
then creates a third numeric wrapper instance whose value is the sum and return
it. In method main() write code to invoke compute(,) in assertion and compare 
to correct result.
1. Execute the program.
2. Execute the program with –ea VM parameter.
3. Change code in compute( , ) method,  for example change return statement to:
 return 0; Execute the program.
4. Execute the program with –ea VM parameter.

 */

package com.brainacad.assertions;

public class Lab_2_11_5 {

	static Long compute(Byte byteVar, Integer intVar){
		// return byteVar.longValue() + intVar.longValue();
		return 0L;
	}

	public static void main(String[] args) {
		Long l = compute((byte)128, 335);
		assert l == 207: "l must be equal 207!";
		System.out.println("128 + 335 = " + compute((byte)128, 335));
	}

}
