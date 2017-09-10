/*
 * Write a program, that iterate through array of Computer objects and 
 * increases by 10 percent field price.
 */

package labs;

public class Lab_2_1_4 {

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
			System.out.println("Manufacturer: " + pc[i].getManufacturer());
			System.out.println("Serial number: " + pc[i].getSerialNumber());
			System.out.println("Price: " + pc[i].getPrice());
			System.out.println("QuantityCPU: " + pc[i].getQuantityCPU());
			System.out.println("FrequencyCPU: " + pc[i].getFrequencyCPU());
			System.out.println();
		}
		
		System.out.println("New data after increasing field \"price\" by 10%:\n");
		for (int i = 0; i < 5; i++){
			System.out.println("PC " + (i + 1) + ":");
			System.out.println("Manufacturer: " + pc[i].getManufacturer());
			System.out.println("Serial number: " + pc[i].getSerialNumber());
			pc[i].setPrice(pc[i].getPrice()*1.1f);
			System.out.println("Price: " + pc[i].getPrice());
			System.out.println("QuantityCPU: " + pc[i].getQuantityCPU());
			System.out.println("FrequencyCPU: " + pc[i].getFrequencyCPU());
			System.out.println();
		}

	}

}
