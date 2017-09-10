/*
 * Open project MyShapes (from 2.8 labs).
Rewrite the class Shape to add new public static method called 
parseShape(String) which returns new object as Shape (one of shapes, 
such as triangle, rectangle and so on) based on string passed as argument.
Example of possible strings: 
“Rectangle:RED:10,20”;
“Triangle:GREEN:9,7,12”;
“Circle:BLACK:10”.
In parseShape() method you must provide following steps:
1.	Determine type of shape object (using first word of string and switch 
statement);
2.	Determine and extract numeric values form string and parse it to double 
type (using Double.parseDouble() method), to use it as arguments to create 
particular Shape object.
3.	Create particular Shape object and pass it to return statement;
Add code to main() method in class Main, which creates one Rectangle, 
one Triangle and one Circle using Shape.parseShape(String) method.
Execute program.

 */

package com.brainacad.oop.testshapeswrapperclass;

public class Lab_2_10_3 {

	public static void main(String[] args) {
		Rectangle rect = (Rectangle)Shape.parseShape("Rectangle:RED:10,20");
		Triangle tr = (Triangle) Shape.parseShape("Triangle:GREEN:9,7,12");
		Circle circle = (Circle) Shape.parseShape("Circle:BLACK:10");
		
		System.out.println(rect);
		System.out.println(tr);
		System.out.println(circle);
	}

}
