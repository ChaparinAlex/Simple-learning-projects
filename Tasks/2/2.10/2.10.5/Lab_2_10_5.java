/*
 * Add code to main() method in class Main which read integer value as string 
 * line from console (using Scanner class) and then convert it to value of 
 * integer type (using Integer.parseInt() method). Use this integer value as 
 * array length to initialize new array of shapes.  Create code to fill this 
 * array from shapes objects created by parsing strings which retrieved from 
 * console:
1.	Create loop to iterate over shapes array;
2.	Add code (in this loop) to read string from console;
3.	Add code (in this loop) create new particular shape object (using 
Shape.parseShape() method) using retrieved string from console;
4.	Add code (in this loop) which pass created shape object to Shape array as 
current element.
Then add code to iterate over shapes array in loop (use for-each loop) and 
invoke draw() method.
Execute the program, and enter to console next lines:
3
Rectangle:RED:11,22
Triangle:BLACK:5,5,5
Circle:GREEN:10
The program output must looks like:
        This is Rectangle, color: RED, width=11, height=22,  area is: 242
        This is Triangle, color: BLACK, a=5, b=5, c=5, area is: 10.825
        This is Circle, color: GREEN, radius=10, area is: 314.15926

 */

package com.brainacad.oop.testshapeswrapperclass;

import java.util.Scanner;

public class Lab_2_10_5 {

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
		 shapes[i] = Shape.parseShape(sc.nextLine());
		}
		sc.close();
		for (int i = 0; i < length; i++){
			System.out.println("Shape " + (i+1) + ":");
			System.out.println(shapes[i] + ", area is: " + 
		         shapes[i].calcArea());
		}
		
	}

}
