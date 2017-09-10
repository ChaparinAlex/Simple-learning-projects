/*
 * Write a program to produce on console the following :
 
1
2  1
3 2  1
4 3 2  1
5 4 3 2  1
6 5 4 3 2  1
7 6 5 4 3 2  1
8 7 6 5 4 3 2  1 

 */


package tasks;

public class Lab_1_5_1 {
	public static void main(String[] args) {
		for (int i = 8; i >= 1; i--){
			for (int j = 9; j > i; j--){
				System.out.print((j - i) + " ");
			}
			System.out.println();
		}
	}
}
