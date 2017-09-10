/*
 * Write class Employee with method calcSalary with argument name(String) 
 * and varargs salary(double…). This method should calc total salary of 
 * employee and print his name and total salary. Write class Accountant that 
 * will be create Employee instance and use his method with a different number 
 * of data.
 */

package labs;

public class Lab_2_2_3 {

	public static void main(String[] args) {
		Accountant a = new Accountant();
        a.employee.calcSalary("Ivanov Ivan Ivanovych", 245.67, 346.68, 1234.52);
        a.employee.print();
        Accountant b = new Accountant();
        b.employee.calcSalary("Petrenko Petro Petrovych", 1000.0, 2000.0);
        b.employee.print();
	}

}
