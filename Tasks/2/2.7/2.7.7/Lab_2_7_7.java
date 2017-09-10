/*
 * Add to project  “MyShapes” a new class “Circle” which is a subclass of 
 * Shape. Add to class Circle a private field “radius” (of double type). 
In class Circle override  calcArea() method which must return area of circle 
(by the formula:  area  = PI*radius2). 
In class Circle override the toString() method. It must return string which 
contain name of shape, color and radius of circle. Example:
“This is Circle, color: GREEN, radius=22” 
Add to class Circle constructor with color and radius arguments.

Then add to class Main code to create one Circle object and print it name 
color, and radius to console. Then invoke calcArea() method and print result 
to console. Program output must looks like:
“This is Circle, color: GREEN, radius=10”
“Shape area is: 314.15926”
 */

package com.brainacad.oop.testshapes;

public class Lab_2_7_7 {

	public static void main(String[] args) {
		Circle circle1 = new Circle("Red", 10);
		System.out.println(circle1);
		System.out.println(circle1.getClass().getSimpleName() + " area is: " 
		+ circle1.calcArea());
		
		Circle circle2 = new Circle();
		System.out.println(circle2);
		System.out.println(circle2.getClass().getSimpleName() + " area is: " 
		+ circle2.calcArea());

	}

}
