/*
 Write a program, which creates square matrix like those in the 
 figure below and prints them formatted to the console. 
 The size of the matrix is 4 x 4: 

1	5	9	13
2	6	10	14
3	7	11	15
4	8	12	16

 */


package tasks;

public class Lab_1_6_3 {

	public static void main(String[] args) {
		int[][] matrix = new int[4][4];
		for (int i = 0; i < matrix.length; i++){
			for (int j = 0; j < matrix.length; j++){
				matrix[i][j] = i + 1 + j*4;
				System.out.printf("%-4d", matrix[i][j]);
			}
			System.out.println();
		}

	}

}
