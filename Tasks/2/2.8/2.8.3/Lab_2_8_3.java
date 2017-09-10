/*
 * You must implement the Comparable interface to each of shape types 
 * (Rectangle, Circle, Triangle). Implement the compareTo method for each 
 * of shape types class so that it compares the areas of the shapes.
Create two different Rectangle instances and compare it to each other. 
Print result to console.
 */

package shapes.abstraction;

public class Lab_2_8_3 {

	public static void main(String[] args) {
		Rectangle r1 = new Rectangle("Red", 10, 5);
		Rectangle r2 = new Rectangle("Blue", 20, 8);
		r1.draw();
		r2.draw();
		
        int compareResult = r1.compareTo(r2);
        if (compareResult == 0){
        	System.out.println("Rectangles are equal");
        }
        if (compareResult > 0){
        	System.out.println("Rectangle r1 is bigger than rectangle r2");
        }
        if (compareResult < 0){
        	System.out.println("Rectangle r1 is less than rectangle r2");
        }
	}

}
