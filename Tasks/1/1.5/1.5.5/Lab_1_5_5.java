/*
 * Write a program to produce the sum of 1, 2, 3, ..., to an upper bound - n. 
Also compute and display the average. The output shall look like:
The Sum is: 100
The Avg is: 10

 */


package tasks;

import java.util.Scanner;

public class Lab_1_5_5 {

	public static void main(String[] args) {
		int n, sum = 0;
		while (true){
			System.out.print("Please, enter n: ");
	        Scanner sc = new Scanner(System.in);
	        if (sc.hasNextInt()){
	        	n = sc.nextInt();
	        	break;
	        }else{
	        	System.out.println("You entered NOT a number! Try again!");
	        }
		}
		for (int i = 1; i <=n; i++){
			sum += i;
		}
		System.out.println("The Sum is: " + sum);
		System.out.println("The Avg is: " + (float)sum/n);
	}

}
