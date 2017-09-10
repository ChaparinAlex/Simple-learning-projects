/*
 * Open project MyShapes (from 2.10 labs).
Create InvalidShapeStringException class  that is subclass of Exception. 
Rewrite the parseShape(String) method in class Shape to throw  
InvalidShapeStringException if string passed as method argument is not valid.
Example of valid string:
      “Rectangle:RED:10,20”;
Example of invalid strings:
      “RectangRED12”;
      “sdzgdzhgd”;
Add code to main() method in class Main, which creates one Rectangle, 
one Triangle and one Circle using Shape.parseShape(String) method and handles 
(using try-catch) exceptions if it occurs (display parsing error message on 
console).
Execute program.
Add code (in this loop) to read string from console, create new particular 
shape object (using Shape.parseShape() method) using retrieved string from 
console and handles exceptions if it occurs.

 */

package com.brainacad.oop.shapesexception;

import java.util.Scanner;

public class Lab_2_11_4 {

	public static void main(String[] args) {
		System.out.println("Please, enter a number of elements of array:");
		Scanner sc = new Scanner(System.in);
		int length = sc.hasNextInt() ? Integer.parseInt(sc.nextLine()) : 0;
		if (length <= 0){
			System.out.println("You entered wrong value! Program must be "
					+ "terminated.");
			sc.close();
			return;
		}
		Shape[] shapes = new Shape[length];
		System.out.println("You must enter data about " + length + " shapes in "
				+ "such format: \nRectangle:RED:11,22  \nTriangle:BLACK:5,5,5  "
				+ "\nCircle:GREEN:10");
		for (int i = 0; i < length; i++){
		 System.out.println("\nPlease enter data for the " + (i+1) + " shape:");
		 sc = new Scanner(System.in);
		 try{
			 shapes[i] = Shape.parseShape(sc.nextLine());
		 }catch(InvalidShapeStringException e){
			System.out.println("Wrong data is entered! Program must be "
			 		+ "terminated!");
			 sc.close();
			 return;
		 }
		}
		sc.close();
		for (int i = 0; i < length; i++){
			System.out.println("Shape " + (i+1) + ":");
			System.out.println(shapes[i] + ", area is: " + 
		         shapes[i].calcArea());
		}

	}

}
