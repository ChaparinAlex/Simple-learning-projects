/*
 * Override toString() method in each class
In toString() method provide code which prints class name and fields values.
Example:
Device: manufacturer =Samsung, price=120, serialNumber=AB1234567CD
Monitor: manufacturer =Samsung, price=120, serialNumber=AB1234567CD, 
X=1280,Y=1024
 */

package lab_2_7_1;

public class Lab_2_7_2 {

	public static void main(String[] args) {
		Device device = new Device("Intel", 2000.0f, "1AB45DF678");
		Monitor monitor = new Monitor("AMD", 3000.0f, "2BC56HJ890", 235, 545);
        EthernetAdapter ethernetAdapter = new EthernetAdapter("Fujitsu", 
        		5000.0f, "3CD78KL562",5000,"13d:567:c34");
        System.out.println(device);
        System.out.println(monitor);
        System.out.println(ethernetAdapter);
	}

}
