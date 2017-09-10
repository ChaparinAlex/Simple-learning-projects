/*
 * Write a console program that prints result of bit shift 
 * operators for integer variable.
 */


package tasks;

public class Lab_1_4_5 {

	public static void main(String[] args) {
		int a = 128;
		int b = a;
		System.out.println("a = " + a + ", b = " + b);
		System.out.println("a << 2 = " + (a<<2));
		System.out.println("b * 4 = " + (b*4));
		a = 128;
		b = a;
		System.out.println("\na = " + a + ", b = " + b);
		System.out.println("a >> 3 = " + (a>>3));
		System.out.println("b / 8 = " + (b / 8));
	}

}
