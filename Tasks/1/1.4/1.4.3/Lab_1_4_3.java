/*
 * Write a console program that prints result of each of arithmetic logical 
 * (AND,OR,NOT,XOR) for two variables of boolean data type.
 */


package tasks;

public class Lab_1_4_3 {

	public static void main(String[] args) {
		boolean b1 = true;
		boolean b2 = false;
		System.out.println("b1 = " + b1 + ", b2 = " + b2);
		System.out.println("b1 AND b2 = " + (b1 && b2));
		System.out.println("b1 OR b2 = " + (b1 || b2));
		System.out.println("NOT b1 = " + !b1 + ", NOT b2 = " + !b2);
		System.out.println("b1 XOR b2 = " + (b1^b2));
	}

}
