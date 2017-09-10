/*
 * Write class InitTest with private field “id” of int type and static 
 * private field “nextId” of integer;
Write code that:
-	Initialize static field “nextId” of some random value (in 1 … 1000 range)
 once when class loaded to JVM;
-	Increments  static field “nextId” each time when new instance of InitTest
 created;
-	Initialize field “id” of “nextId” field value each time when new instance
 of InitTest created.
And method getId() which will return value of id.
Create class Main, which will create five instances of class InitTest and
 invokes method “getId()” on each instance and print returned value on console.

 */

package labs;

public class Lab_2_5_5 {

	public static void main(String[] args) {
		System.out.println("nextId after declaring class InitTest = " + 
	          InitTest.getNextId() + "\n");
		InitTest[] inits = new InitTest[5];
		for (int i = 0; i < 5; i++){
			inits[i] = new InitTest();
			System.out.println("nextId after creating object " + (i+1) + " = "
			+ InitTest.getNextId());
			System.out.println("id of inits[" + (i+1) + "] = " + 
			inits[i].getId() + "\n");
		}

	}

}
