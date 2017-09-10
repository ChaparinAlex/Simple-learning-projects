/*
 * Write a console program that prints result of increment and decrement in
 *  prefix and postfix mode for integer variable.
 */


package tasks;

public class Lab_1_4_4 {

	public static void main(String[] args) {
		int incDec = 10;
		System.out.println("incDec = " + incDec);
        System.out.println("Prefix increment: ++incDec = " + ++incDec);
        System.out.println("Now incDec = " + incDec);
        System.out.println("Postfix increment: incDec++ = " + incDec++);
        System.out.println("Now incDec = " + incDec);
        System.out.println("Prefix decrement: --incDec = " + --incDec);
        System.out.println("Now incDec = " + incDec);
        System.out.println("Postfix decrement: incDec-- = " + incDec--);
        System.out.println("Now incDec = " + incDec);
	}

}
