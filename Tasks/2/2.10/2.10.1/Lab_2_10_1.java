/*
 * Create new project called WrapperDemo. 
Add package “com.brainacad.oop.testwrapper”.
Create class Main with method main(). In main() method declare few xN local 
variable of Integer class and initialize it with same value (lower then 128), 
but in different manner. 
For example:
Integer x1 = 10;
Integer x2 = new Integer(10); 
Integer x4 = Integer.valueOf(10);
Integer x5 = Integer.parseInt(“10”);
Compare it to each other using “==” and equals(), print result to console.
Do the same, but for value higher than 128.

 */

package com.brainacad.oop.testwrapper;

public class Lab_2_10_1 {

	public static void main(String[] args) {
		Integer x1 = 10;
		Integer x2 = new Integer(10); 
		Integer x3 = 10;
		Integer x4 = Integer.valueOf(10);
		Integer x5 = Integer.parseInt("10");
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		System.out.println("x3 = " + x3);
		System.out.println("x4 = " + x4);
		System.out.println("x5 = " + x5);
        System.out.println("x1 == x2: " + (x1 == x2));
        System.out.println("x1 == x3: " + (x1 == x3));
        System.out.println("x1 == x4: " + (x1 == x4));
        System.out.println("x1 == x5: " + (x1 == x5));
        System.out.println("x2 == x3: " + (x2 == x3));
        System.out.println("x2 == x4: " + (x2 == x4));
        System.out.println("x2 == x5: " + (x2 == x5));
        System.out.println("x3 == x4: " + (x3 == x4));
        System.out.println("x3 == x5: " + (x3 == x5));
        System.out.println("x4 == x5: " + (x4 == x5));
        System.out.println("x1.equals(x2): " + (x1.equals(x2)));
        System.out.println("x1.equals(x3): " + (x1.equals(x3)));
        System.out.println("x1.equals(x4): " + (x1.equals(x4)));
        System.out.println("x1.equals(x5): " + (x1.equals(x5)));
        System.out.println("x2.equals(x3): " + (x2.equals(x3)));
        System.out.println("x2.equals(x4): " + (x2.equals(x4)));
        System.out.println("x2.equals(x5): " + (x2.equals(x5)));
        System.out.println("x3.equals(x4): " + (x3.equals(x4)));
        System.out.println("x3.equals(x5): " + (x3.equals(x5)));
        System.out.println("x4.equals(x5): " + (x4.equals(x5)));
       
        System.out.println();
        
        x1 = 130;
		x2 = new Integer(130); 
		x3 = 130;
		x4 = Integer.valueOf(130);
		x5 = Integer.parseInt("130");
		System.out.println("x1 = " + x1);
		System.out.println("x2 = " + x2);
		System.out.println("x3 = " + x3);
		System.out.println("x4 = " + x4);
		System.out.println("x5 = " + x5);
        System.out.println("x1 == x2: " + (x1 == x2));
        System.out.println("x1 == x3: " + (x1 == x3));
        System.out.println("x1 == x4: " + (x1 == x4));
        System.out.println("x1 == x5: " + (x1 == x5));
        System.out.println("x2 == x3: " + (x2 == x3));
        System.out.println("x2 == x4: " + (x2 == x4));
        System.out.println("x2 == x5: " + (x2 == x5));
        System.out.println("x3 == x4: " + (x3 == x4));
        System.out.println("x3 == x5: " + (x3 == x5));
        System.out.println("x4 == x5: " + (x4 == x5));
        System.out.println("x1.equals(x2): " + (x1.equals(x2)));
        System.out.println("x1.equals(x3): " + (x1.equals(x3)));
        System.out.println("x1.equals(x4): " + (x1.equals(x4)));
        System.out.println("x1.equals(x5): " + (x1.equals(x5)));
        System.out.println("x2.equals(x3): " + (x2.equals(x3)));
        System.out.println("x2.equals(x4): " + (x2.equals(x4)));
        System.out.println("x2.equals(x5): " + (x2.equals(x5)));
        System.out.println("x3.equals(x4): " + (x3.equals(x4)));
        System.out.println("x3.equals(x5): " + (x3.equals(x5)));
        System.out.println("x4.equals(x5): " + (x4.equals(x5)));
	}

}
