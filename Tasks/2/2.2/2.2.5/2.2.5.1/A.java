package labs;

public class A {
	private final double PI = 3.14;
    public double calcSquare(double side1, double side2){
    	return side1*side2;
    }
        
    public double calcSquare(double radius){
    	return PI*radius*radius;
    }
}
