
        /*
		 * Write a console program prints on console each of the primitive 
		 * data types (byte,short,int,long,float,double,char,boolean).
		 */

package tasks;

public class Lab_1_4_1 {

	public static void main(String[] args) {
		
		byte byteVar = 126;
		short shortVar = 32_000;
		int intVar = 1_986_876_654;
		long longVar = 9_000_000_000_000_000_000L;
        float floatVar = 2.123f;
        double doubleVar = 645.123456789;
        char charVar = 'c';
        boolean booleanVar = true;
        
        System.out.println("byteVar = " + byteVar);
        System.out.println("shortVar = " + shortVar);
        System.out.println("intVar = " + intVar);
        System.out.println("longVar = " + longVar);
        System.out.println("floatVar = " + floatVar);
        System.out.println("doubleVar = " + doubleVar);
        System.out.println("charVar = " + charVar);
        System.out.println("booleanVar = " + booleanVar);
	}

}
