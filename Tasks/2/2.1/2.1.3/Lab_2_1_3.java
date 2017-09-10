/*
 * Write a program to create array of Computer objects (5 pcs.)
Declare array of Computer objects (5 pcs.), create 5 Computer objects 
and place it to array (using loop).
 */

package labs;

public class Lab_2_1_3 {	

	public static void main(String[] args) {
		Computer[] pc = new Computer[5];
		for (int i = 0; i < 5; i++){
			pc[i] = new Computer();
		}

	}

}
