/*
 * Create Emploee class with fields firstName, lastName, occupation, 
 * telephone and static field numberOfEmployees and getters/setters. 
 * Also class must have constructor, which will initialize class fields 
 * and increment numberOfEmployees.
 */

package labs;

public class Lab_2_4_4 {

	public static void main(String[] args) {
	 System.out.println("\tLab work 2.4.4:\n");
	 Emploee[] employees = new Emploee[5];
	 for (int i = 0; i < 5; i++){
		 employees[i] = new Emploee();
	 }
	 
	 Emploee employee = new Emploee("Ivan", "Ivaniv", "Front-end developer", 
			 "+380670000000");
	 
	 for (int i = 0; i < 5; i++){
		 System.out.println("Employee " + (i+1) + ":\n");
		 employees[i].printData();
	 }
	 
	 System.out.println("Employee " + Emploee.getNumberOfEmployees() + 
			 ":\n");
	 employee.printData();
	 
	 System.out.println("Count of employees: " + 
	           Emploee.getNumberOfEmployees());
	}
}
