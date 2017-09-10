/*
 * Use “MyShapes” project. The program must demonstrate the creation of an 
 * array of different types of shapes and print characteristics of each shape
 *  on console.
1.	Add new code to method main() in class Main:
2.	Create array (Shape[] arr) of different Shapes objects, (five  rectangles, 
two circles and two triangles);
3.	Add code to iterate over shapes array in loop (use for-each loop) and print
 characteristics of each shape on console (using “toString()” method) with area
  of this shape (using “calcArea()” method).
4.	Execute the program, output must looks like:

         This is Rectangle, color: RED, width=11, height=22,  area is: 242
         This is Triangle, color: BLACK, a=5, b=5, c=5, area is: 10.825
         This is Circle, color: GREEN, radius=10, area is: 314.15926
               …
5.	Add code to calculate total area of all shape types. Define “sumArea” 
(of double type) local variable and use it in loop to sum total area for all 
shapes.
6.	Add code to sum total area for each shape types. Define “sumRectArea”, 
“sumTriangleArea”, “sumCircleArea” (of double type) local variables and use it
 in loop to sum total area for each shape type. You should use instanceof 
 keyword for determining, total area for each of shape types (Rectangle, Circle,
 Triangle) and print it to console. 
7.	Execute the program, output must looks like:
Rectangles total area: 234.54
Circle total area: 547.231
Triangle total area: 356.56

 */

package com.brainacad.oop.testshapes;

public class Lab_2_7_10 {

	public static void main(String[] args) {
	 Shape[] arr = {new Rectangle("Red", 10, 5), new Rectangle("Blue", 20, 8),
		new Rectangle("White", 15, 10), new Rectangle("Rose", 12, 6),
		new Rectangle("Brown", 3, 5), new Circle("Violet", 10), 
		new Circle("Yellow", 15), new Triangle("Black", 5, 5, 5), 
		new Triangle("Green", 3, 4, 5)};
	 for (Shape s:arr){
		 System.out.print(s);
		 System.out.println(", area is: " + s.calcArea());
	 }
	 
	 double sumArea = 0.0;
	 for (Shape s:arr){
		 sumArea += s.calcArea();
	 }
	 
	 double sumRectArea = 0.0;
	 double sumTriangleArea = 0.0;
	 double sumCircleArea = 0.0;	 
	 for (Shape s:arr){
		 if (s instanceof Rectangle){
			 sumRectArea += s.calcArea();
		 }
		 if (s instanceof Circle){
			 sumCircleArea += s.calcArea();
		 }
		 if (s instanceof Triangle){
			 sumTriangleArea += s.calcArea();
		 }
	 }
	 
	 System.out.println("Shapes total area: " + sumArea);
	 System.out.println("Rectangles total area: " + sumRectArea);
	 System.out.println("Circles total area: " + sumCircleArea);
	 System.out.println("Triangles total area: " + sumTriangleArea);
	}

}
