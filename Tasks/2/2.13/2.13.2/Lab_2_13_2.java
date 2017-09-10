/*
 * Open project called  TestEnum1 (form 2-13-1 lab).
Add to method main() code that iterate over MyDayOfWeek enum possible values 
in loop and using switch statement print to console days of the week only when 
you have classes in Java Programming.
Execute the program.
    Example of program output:
    My Java day: TUESDAY
    My Java day: THURSDAY
    My Java day: SATURDAY

 */

package com.brainacad.oop.testenum1;

public class Lab_2_13_2 {
	
	enum MyDayOfWeek{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {
		
		for (MyDayOfWeek mdw:MyDayOfWeek.values()){
			switch (mdw){
			   case TUESDAY:
			   case THURSDAY:
			   case SATURDAY: {
				   System.out.println("My Java day: " + mdw);
				   break;
			   }
			}
		}

	}

}
