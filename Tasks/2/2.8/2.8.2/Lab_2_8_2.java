/*
 * Add to project  “MyShapes” a new  interface called “Drawable”, with abstract
 *  method draw(). The draw() method has no arguments and does not return a 
 *  value. Implement  interface Drawable to class Shape. The classes that 
 *  implements the Drawable interface will provide actual implementation to 
 *  these abstract method witch print characteristics of each shape on console 
 * (print to console information about this object from toString() and area of 
 * this shape (using “calcArea()” method). Add code to main() method in class 
 * Main to iterate over shapes array in loop (use for-each loop) and invoke 
 * draw() method. Execute the program, output must looks like:

      This is Rectangle, color: RED, width=11, height=22,  area is: 242
      This is Triangle, color: BLACK, a=5, b=5, c=5, area is: 10.825
      This is Circle, color: GREEN, radius=10, area is: 314.15926

 */

package shapes.abstraction;

public class Lab_2_8_2 {

	public static void main(String[] args) {
		Shape[] arr = {new Rectangle("Red", 10, 5), new Rectangle("Blue", 20, 8),
				new Rectangle("White", 15, 10), new Rectangle("Rose", 12, 6),
				new Rectangle("Brown", 3, 5), new Circle("Violet", 10), 
				new Circle("Yellow", 15), new Triangle("Black", 5, 5, 5), 
				new Triangle("Green", 3, 4, 5)};
			 			 
			 for (Shape s:arr){
				 s.draw();
			 }

	}

}
