/*
 * Add code to main() method in class Main to create array (Rectangle[] arr2) 
 * of six Rectangle objects and sort it using Arrays.sort() method.
Add code to main() method in class Main to iterate over Rectangles array in 
loop (use for-each loop) and invoke draw() method.

Execute the program, output must looks like:

    This is Rectangle, color: RED, width=10, height=10,  area is: 100
    This is Rectangle, color: RED, width=11, height=22,  area is: 242
    This is Rectangle, color: RED, width=100, height=5,  area is: 500

 */

package shapes.abstraction;

import java.util.Arrays;

public class Lab_2_8_4 {

	public static void main(String[] args) {
	   Rectangle[] r = {new Rectangle("Red", 10, 5), 
		new Rectangle("Blue", 20, 8), new Rectangle("White", 15, 10), 
		new Rectangle("Rose", 12, 6), new Rectangle("Brown", 3, 5), 
		new Rectangle("Violet", 10, 12)};
	   
	   Arrays.sort(r);
	   for (Rectangle rect:r){
		   rect.draw();
	   }

	}

}
