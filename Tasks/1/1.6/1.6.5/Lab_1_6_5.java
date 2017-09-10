/*
 * Write a program, which finds in a given matrix the area of equal 
 * numbers. Here is one example with an area containing 7 elements 
 * with equal value of 1:

1	1	1	3	4
2	1	3	1	2
2	2	3	4	1
3	3	3	1	4





The program must print to console:
Line 1: [0-2]
Line 2: [1,3]
Line 3: [4]
Line 4: [3]

 */


package tasks;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Lab_1_6_5 {

	public static void main(String[] args) {
		int[][] array = new int[4][5];
		Random random = new Random();
        System.out.println("Current array:");
		int min = 1, max = 4;
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 5; j++){
				array[i][j] = random.nextInt(max - min + 1) + min;
				System.out.print(array[i][j] + " ");
			}
			System.out.println();
		}
		int[][] arrayOfIndexes = new int[4][5];
		for (int i = 0; i < 4; i++){
			Arrays.fill(arrayOfIndexes[i], -1);	
		}
		System.out.print("\nPlease, enter a number which must be found:");
		Scanner sc = new Scanner(System.in);
		int num = sc.hasNextInt()?sc.nextInt():1;
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 5; j++){
				if (array[i][j] == num){
					arrayOfIndexes[i][j] = j;
				}
			}
		}
		int[] arrayOfFoundIndexes = new int[4];
		for (int i = 0; i < 4; i++){
			for (int j = 0; j < 5; j++){
				if (arrayOfIndexes[i][j] != -1){
					arrayOfFoundIndexes[i]++;
				}
			}
		}
		int[] copyArrayOfIndexes0 = new int[arrayOfFoundIndexes[0]];
		int[] copyArrayOfIndexes1 = new int[arrayOfFoundIndexes[1]];
		int[] copyArrayOfIndexes2 = new int[arrayOfFoundIndexes[2]];
		int[] copyArrayOfIndexes3 = new int[arrayOfFoundIndexes[3]];
		
		for (int j = 0, k = 0; j < 5; j++){
			if (arrayOfIndexes[0][j] != -1){
				copyArrayOfIndexes0[k++] = arrayOfIndexes[0][j];
			}
		}
		for (int j = 0, k = 0; j < 5; j++){
			if (arrayOfIndexes[1][j] != -1){
				copyArrayOfIndexes1[k++] = arrayOfIndexes[1][j];
			}
		}
		for (int j = 0, k = 0; j < 5; j++){
			if (arrayOfIndexes[2][j] != -1){
				copyArrayOfIndexes2[k++] = arrayOfIndexes[2][j];
			}
		}
		for (int j = 0, k = 0; j < 5; j++){
			if (arrayOfIndexes[3][j] != -1){
				copyArrayOfIndexes3[k++] = arrayOfIndexes[3][j];
			}
		}
		
			System.out.print("Line 1: ");
			System.out.println(Arrays.toString(copyArrayOfIndexes0));
			System.out.print("Line 2: ");
			System.out.println(Arrays.toString(copyArrayOfIndexes1));
			System.out.print("Line 3: ");
			System.out.println(Arrays.toString(copyArrayOfIndexes2));
			System.out.print("Line 4: ");
			System.out.println(Arrays.toString(copyArrayOfIndexes3));
	}

}
