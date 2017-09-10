/*
 * Create class “MyInitTest” with two initialization blocks, two static 
 * initialization blocks and two constructors (one constructor() must invoke
 * second constructor(int)). On each block write code that prints on console 
 * type of block and block number. 

For example:
“static initialization block 1” 
“static initialization block 2”
“non-static initialization block 1” 
“non-static initialization block 2” 
“constructor 1” 
“constructor 2” 

Create class Main, which will create instance of class MyInitTest by 
invoking first constructor.

 */

package labs;

public class Lab_2_5_1 {

	public static void main(String[] args) {
		MyInitTest Test = new MyInitTest();
		MyInitTest testArray1 = new MyInitTest();
		MyInitTest testArray2 = new MyInitTest();
	}
}
