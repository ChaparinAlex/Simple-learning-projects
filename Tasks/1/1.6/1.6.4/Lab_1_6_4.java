/*
 * Write a program, which uses a binary search in a sorted array of 
 * integer numbers to find a certain element.
 */


package tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab_1_6_4 {

	public static void main(String[] args) {
		int[] array = new int[20];
		Random r = new Random();
		int min = 1, max = 20;
        for (int i = 0; i < array.length; i++){
        	array[i] = r.nextInt(max - min + 1) + min;
        }
        System.out.println("Current array:");
        System.out.println(Arrays.toString(array));
        System.out.println("\nSorted array:");
        Arrays.sort(array);
        System.out.println(Arrays.toString(array));
        int findNum;
        while (true){
        	System.out.print("\nPlease, enter a number which must be found in "
            		+ "array: ");
        	Scanner sc = new Scanner(System.in);
        	if (sc.hasNextInt()){
        		findNum = sc.nextInt();
        		break;
        	}else{
        		System.out.println("You entered NOT an integer number! "
        				+ "Try again!");
        	}
        }
        System.out.println("Index of the first found element in array is: " + 
        (Arrays.binarySearch(array, findNum) < 0 ? "Element isn't found" : 
        	Arrays.binarySearch(array, findNum)));        
	}
}
