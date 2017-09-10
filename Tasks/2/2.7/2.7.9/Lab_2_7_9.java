/*
 * Add to project  “MyShapes” a new class “Triangle” which is a subclass of 
 * Shape. Add to class Triangle a private field’s a, b, c (of double type) 
 * which is sides of triangle. In class Triangle override  calcArea() method 
 * which must return area of triangle (By the formula:  area  =  , where  ). 
In class Triangle override the toString() method. It must return string which 
contain name of shape, color and a, b, c sides of triangle. Example:
“This is Triangle, color: BLACK, a=5, b=5, c=5” 
Add to class Triangle constructor with color, a, b and c arguments.

Then add to class Main code to create one Triangle object and print it name, 
color, a, b, c sides of triangle to console. Then invoke calcArea() method 
and print result to console.
Program output must looks like:
“This is Triangle, color: BLACK, a=5, b=5, c=5”
“Shape area is: 10.825”
 */

package com.brainacad.oop.testshapes;

public class Lab_2_7_9 {

	public static void main(String[] args) {
		Triangle tr1 = new Triangle("Black", 5, 5, 5);
		System.out.println(tr1);
		System.out.printf("%s area is: %.3f\n", tr1.getClass().getSimpleName(), 
		tr1.calcArea());
		
		Triangle tr2 = new Triangle();
		System.out.println(tr2);
		System.out.printf("%s area is: %.3f", tr2.getClass().getSimpleName(),  
		tr2.calcArea());

	}

}
