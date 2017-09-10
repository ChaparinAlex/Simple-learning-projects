/*
 * Write a console program that prints result of Bitwise operators for two 
 * integer variables
 */


package tasks;

public class Lab_1_4_6 {

	public static void main(String[] args) {
		int a = 10, b = 12;
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("a AND b = " + (a&b));
		System.out.println("a OR b = " + (a|b));
		System.out.println("a XOR b = " + (a^b));
		System.out.println("NOT a = " + (~a) + ", NOT b = " + (~b));
	}

}
