/*
 * Write a class MyPyramid with public static method printPyramid(int h)
 *  that takes parameter an integer h between 1 and 9, and prints a pyramid 
 *  of numbers of height h. 
Example: For h = 4 the method should print the pyramid

      1
     121
    12321
   1234321

 */

package labs;

import java.util.Scanner;

public class Lab_2_4_6 {

	public static void main(String[] args) {
		 System.out.println("Please, enter a height of a pyramid (number "
		 		+ "between 1 and 9):");
	      Scanner sc = new Scanner(System.in);
	      int height = sc.hasNextInt() ? sc.nextInt() : 1;
	      if (height <= 0 || height > 9){
	    	  height = 1;
	      }
	      System.out.println("Pyramid of height " + height + ":");
	      MyPyramid.printPyramid(height);
	}


}
