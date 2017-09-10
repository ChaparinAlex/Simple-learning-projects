/*
 * Add to class Computer method void view (){} that prints all fields of 
 * object in line. Print all info (fields) of all objects in console.

 */

package labs;

public class Lab_2_1_5 {

	public static void main(String[] args) {
		Computer[] pc = new Computer[5];
		for (int i = 0; i < 5; i++){
			pc[i] = new Computer();
			pc[i].setManufacturer("Intel" + (i+1));
			pc[i].setSerialNumber((i + 1)*(i + 1));
			pc[i].setPrice((i + 1)*(i + 1)*(i + 1));
			pc[i].setQuantityCPU(i + 1);
			pc[i].setFrequencyCPU(2300 + i*200);
		}
		System.out.println("Current data:\n");
		for (int i = 0; i < 5; i++){
			System.out.println("PC " + (i + 1) + ":");
			pc[i].view();
		}
		
		System.out.println("\nLet's change data by increasing field \"price\""
				+ " by 10%. After that view new data:\n");
		for (int i = 0; i < 5; i++){
			pc[i].setPrice(pc[i].getPrice()*1.1f);
			System.out.println("PC " + (i + 1) + ":");
			pc[i].view();
		}

	}

}
