/*
 * Write a console program that prints result type casting for different 
 * primitive types
 */


package tasks;

public class Lab_1_4_8 {

	public static void main(String[] args) {
		
		int a = 10, b = 20;
		char c = 'c';
		float f = 23.789f;
		double d = 645.123456789;
		long l = 9_000_000_000_000_000_000L;
		
		byte byteVar = (byte)(a + b);
		short shortVar = (short)(a + b);
		int intVar1 = c;		
        float floatVar = (float)d;
        int intVar2 = (int)l;
        int intVar3 = (int)f;
        int intVar4 = (int)d;
          
        System.out.println("a = " + a);
        System.out.println("b = " + b);
        System.out.println("c = " + c);
        System.out.println("f = " + f);
        System.out.println("d = " + d);
        System.out.println("l = " + l);
        
        System.out.println("\nbyteVar = (byte)(a + b) = " + byteVar);
        System.out.println("shortVar = (short)(a + b) = " + shortVar);
        System.out.println("intVar1 = c = " + intVar1);
        System.out.println("floatVar = (float)d = " + floatVar);
        System.out.println("intVar2 = (int)l = " + intVar2);
        System.out.println("intVar3 = (int)f = " + intVar3);
        System.out.println("intVar4 = (int)d = " + intVar4);
	}

}
