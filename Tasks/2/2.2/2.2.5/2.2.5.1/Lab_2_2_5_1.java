/*
 *  Write class A with overridden methods calcSquare that calculate square
 *  of rectangle, square of foursquare and square of circle and print result. 
 *  Write class that will use these methods
 */

package labs;

public class Lab_2_2_5_1 {

	public static void main(String[] args) {
		A squareOfRectangle = new A();
		System.out.printf("Square of rectangle with one side 3.6 and second"
			+ " side 6.9 equals: %.2f%n", squareOfRectangle.calcSquare(3.6, 6.9));
		A squareOfFoursquare = new A();
		System.out.printf("Square of foursquare with side 8.8"
			+ " equals: %.2f%n", squareOfFoursquare.calcSquare(8.8, 8.8));
		A squareOfCircle = new A();
		System.out.printf("Square of circle with radius 10.4"
			+ " equals: %.2f%n", squareOfCircle.calcSquare(10.4));

	}

}
