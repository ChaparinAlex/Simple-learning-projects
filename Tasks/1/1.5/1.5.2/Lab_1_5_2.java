/*
 *  Write a program which prompts user for the number "X", reads it from 
 *  the keyboard, and saves it in an int variable called "x". 
    Then prints "One", "Two",... , "Nine" if the int variable "x" is 
    1, 2,... , 9 and "Other" if “x” >9, respectively. 
    Use (a) a "nested-if" statement;  
    (b) a "switch-case" statement.
    The output shall look like (user input – in green):
   -Enter number x: 1			-Enter number x: 12
   -One					- Other
 */


package tasks;

import java.util.Scanner;

public class Lab_1_5_2 {
	
	public static void main(String[] args) {
	int x;
	while (true){
		System.out.print("Enter number x:");
		Scanner sc = new Scanner(System.in);
		if (sc.hasNextInt()){
			x = sc.nextInt();
			if (x > 0){
			break;
			}
			System.out.println("You entered NOT a number or your number is "
					+ "less than one. Try again!");
		}
	}
	switch (x){
	case 1: {
		      System.out.println("One");
		      break;
	        }
	case 2: {
	          System.out.println("Two");
	          break;
            }
	case 3: {
              System.out.println("Three");
              break;
            }
	case 4: {
              System.out.println("Four");
              break;
            }
	case 5: {
              System.out.println("Five");
              break;
            }
	case 6: {
              System.out.println("Six");
              break;
            }
	case 7: {
              System.out.println("Seven");
              break;
            }
	case 8: {
              System.out.println("Eight");
              break;
            }
	case 9: {
              System.out.println("Nine");
              break;
            }
	default:{
		      System.out.println("Other");
              break;
	        }
	}

  }

}
