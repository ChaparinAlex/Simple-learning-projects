/*
 * The value of PI can be calculated with the series:
PI = 4 - 4/3 + 4/5 - 4/7 + 4/9 - 4/11 + ...
Write a class MyCalc with public static method calcPi(int) that 
takes as parameter an integer n, and computes and returns the value 
of PI approximated to the first n terms of the series.

 */

package labs;

import java.util.Scanner;

public class Lab_2_4_5 {

	public static void main(String[] args) {
	  System.out.println("Please, enter a quantity of elements of the serie:");
      Scanner sc = new Scanner(System.in);
      int n = sc.hasNextInt() ? sc.nextInt() : 1;
      if (n < 0){
    	  n = 1;
      }
      System.out.println("Sum of the first " + n + " elements of the serie = "
    		  + MyCalc.calcPI(n));
	}

}
