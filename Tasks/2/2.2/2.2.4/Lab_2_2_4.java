/*
 * Create class Person with fields firstName(String), lastName(String), 
 * age(int), gender(String), phoneNumber(int), and  five overloaded methods 
 * that set this fields with different arguments list. And create class that 
 * will be use instance of class Person and his methods.
 */

package labs;

public class Lab_2_2_4 {

	public static void main(String[] args) {
		Person[] person = new Person[5];
		for (int i = 0; i < 5; i++){
			person[i] = new Person();
		}
		person[0].setFields("Vasylj", "Petriv", 45, "male", 123457);
		person[1].setFields("Mykola", "Ivaniv", 40, "male");
		person[2].setFields("Oksana", "Osyka", 30);
		person[3].setFields("Yuriy", "Kozak");
		person[4].setFields("Halyna");
		
		for (int i = 0; i < 5; i++){
			System.out.println("Person " + (i + 1) + ":");
			person[i].print();
		}
	}

}
