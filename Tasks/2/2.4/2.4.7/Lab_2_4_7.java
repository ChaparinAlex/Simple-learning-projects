/*
 * Write a program that computes the distance an object will fall in Earth's
 * gravity. Create a new class called GravityCalculator with method calcDist
 * (double t) that takes double  t, and returns the position of an object
 * after falling for t seconds (outputting the position in meters). 
 * The formula in Math notation is:
x(t) = 0.5 * at 2 + vit + xi 
Where:
a - Acceleration (m/s 2 ) = 9.81
t - Time (s) (for example t=10) 
vi Initial velocity (m/s) =0 
xi Initial position =0
Declare Acceleration value field as a constant;

 */

package labs;

import java.util.Scanner;

public class Lab_2_4_7 {

	public static void main(String[] args) {
		GravityCalculator gCalc = new GravityCalculator();
		 System.out.println("Please, enter a time of oject falling "
		 		+ "(in seconds):");
		      Scanner sc = new Scanner(System.in);
		      double time = sc.hasNextDouble() ? sc.nextDouble() : 0.0;
		      if (time <= 0.0){
		    	 time = 0.0;
		      }
		      System.out.println("Position of object after falling: " +
		      gCalc.calcDist(time) + " meters");
	}

}
