/*
 * Create project MyCalc. 
Create class Main with main method in package com.brainacad.calc.
Create class  “Triangle” in package “com.brainacad.shapes”  with three 
double data fields named “a”, “b”, and “c” with default values 1.0 to 
denote three sides of the triangle. Add constructor with (a,b,c) parameters 
and creates a triangle with specified a, b, and c values. Add method named
 getArea() that returns the area of this triangle using Heron formula:
  A = SQRT(s*(s - a)*(s - b)*(s - c)), where s = (a + b + c)/2
Use static import from Math class.
Create instance of  Triangle in Main class and test “getArea” method.

 */

package com.brainacad.calc;

import com.brainacad.shapes.Triangle;

public class Main {

	public static void main(String[] args) {
		Triangle tr = new Triangle(3.0, 4.0, 5.0);
		System.out.println("The area of triangle with sides 3.0, 4.0, 5.0 = " +
		tr.getArea());

	}

}
