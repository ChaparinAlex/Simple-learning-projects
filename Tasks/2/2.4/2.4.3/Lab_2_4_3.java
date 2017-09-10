/*
 * Add to class MyMath final static field PI = 3.14 and static method 
 * areaOfCircle, which will take radius, use constant PI and calculate area.
 */

package labs;

import java.util.Scanner;

public class Lab_2_4_3 {

	public static void main(String[] args) {
		System.out.println("\n\tLab work 2.4.3:");
		  System.out.println("Please, input radius of circle:");
		  Scanner sc = new Scanner(System.in);
		  double radius = sc.hasNextDouble() ? sc.nextDouble() : 1.0;
		  System.out.println("Square of circle is: " + 
		  MyMath.areaOfCircle(radius));

	}

}
