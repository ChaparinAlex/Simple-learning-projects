/*
 * Add to project  “MyShapes” a new class “Rectangle” which is a subclass 
 * of Shape. Add to class Rectangle a private field’s width and height 
 * (of double type). In class Rectangle override  calcArea() method which 
 * must return area of rectangle (By the formula:  area  = width* height). 
In class Rectangle override the toString() method. It must return string 
which contain name of shape, color and rectangle width and height. Example:
“This is Rectangle, color: RED, width=11, height=22” 
Add to class Rectangle constructor with color , width and height arguments.

Then add to class Main code to create one Rectangle object and print it name,
color, width and height to console. Then invoke calcArea() method and print 
result to console.
Program output must looks like:
“This is Rectangle, color: RED, width=11, height=22”
“Shape area is: 242”
 */

package com.brainacad.oop.testshapes;

public class Lab_2_7_8 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle("Red", 10, 5);
		System.out.println(r1);
		System.out.println(r1.getClass().getSimpleName() + " area is: " 
		+ r1.calcArea());
		
		Rectangle r2 = new Rectangle();
		System.out.println(r2);
		System.out.println(r2.getClass().getSimpleName() + " area is: " 
		+ r2.calcArea());

	}

}
