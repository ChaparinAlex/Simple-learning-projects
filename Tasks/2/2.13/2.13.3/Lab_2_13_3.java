/*
 * Open project called  TestEnum1 (form 2-13-2 lab).
Rewrite MyDayOfWeek enum, add method nextDay() which return the next day of 
week on for given enum value.
For example: MyDayOfWeek.FRIDAY.nextDay() must return MyDayOfWeek.SATURDAY.
Add to method main() code that read string value from console (using System.in 
and Scanner), then you must parse string value to particular enum value (using 
valueOf() method) and then print the name of next day of week to console.
Execute the program.
Example of program output:
FRIDAY
The next day of week: SATURDAY

 */

package com.brainacad.oop.testenum1;

import java.util.Scanner;

public class Lab_2_13_3 {

	enum MyDayOfWeek{
		SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, SATURDAY;
		
		MyDayOfWeek nextDay(){			
			int i = this.ordinal();
			MyDayOfWeek nextDay = MyDayOfWeek.values()[(i + 1)%7];
			return nextDay;			
		}
	}

	public static void main(String[] args) {
		
		System.out.println("Please, enter a day of week:");
		Scanner sc = new Scanner(System.in);
		String temp = sc.nextLine().toUpperCase();
		MyDayOfWeek currentDay = MyDayOfWeek.valueOf(temp);
		System.out.println("The next day of week: " + currentDay.nextDay());
		sc.close();
	}

}
