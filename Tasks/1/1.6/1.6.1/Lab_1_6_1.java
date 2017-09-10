/*
 * Create an array of all the even numbers from 2 to 30 (2,4,6...30)
 *  and display elements of the array to the screen.
 */


package tasks;

public class Lab_1_6_1 {
	
	public static void main(String[] args) {
		int[] array = new int[15];
		for (int i = 1; i <= 15; i++){
			array[i-1] = i*2;
		}
		for (int i = 0; i < array.length; i++){
			System.out.printf("%-5d", array[i]);
			if ((i + 1)%5 == 0){
				System.out.println();
			}
		}
	}
}
