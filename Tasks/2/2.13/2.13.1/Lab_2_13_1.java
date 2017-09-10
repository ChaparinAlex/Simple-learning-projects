/*
 * Create new project called  TestEnum1. Add package 
 * “com.brainacad.oop.testenum1”.
1) Create a class Main with a main().
2) Create a enum type MyDayOfWeek which specify a days-of-the-week 
(SUNDAY, MONDAY, …).
3) Add to method main() code that iterate over MyDayOfWeek enum possible 
values in loop and print each value name to console.
4) Execute the program.
Example of program output:
SUNDAY
MONDAY
TUESDAY
WEDNESDAY
THURSDAY
FRIDAY
SATURDAY

 */

package com.brainacad.oop.testenum1;

public class Lab_2_13_1 {
	enum MyDayOfWeek{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY
	}

	public static void main(String[] args) {
		
		for (MyDayOfWeek mdw:MyDayOfWeek.values()){
			System.out.println(mdw);
		}

	}

}
