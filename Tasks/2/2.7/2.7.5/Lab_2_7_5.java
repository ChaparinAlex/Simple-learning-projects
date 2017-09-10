/*
 * Create program (class Main). The program must demonstrate the creation 
 * of an arrays of different types devices, setup and output characteristics
 *  of each device
 */

package lab_2_7_1;

public class Lab_2_7_5 {

	public static void main(String[] args) {
	  Device[] devices1 = {new Device(), new EthernetAdapter(), new Monitor()};
	  for (Device d:devices1){
		  System.out.println(d);
	  }
	  
	  Device[] devices2 = {new Device("Intel", 2000.0f, "1AB45DF678"), 
	   new EthernetAdapter("Fujitsu", 5000.0f, "3CD78KL562",5000,"13d:567:c34"), 
	   new Monitor("AMD", 3000.0f, "2BC56HJ890", 235, 545)};
	  for (Device d:devices2){
		  System.out.println(d);
	  }

	}

}
