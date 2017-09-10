package shapes.abstraction;

public class Circle extends Shape implements Comparable{
    private double radius;
    
    public Circle(String shapeColor, double radius){
    	setShapeColor(shapeColor);
    	this.radius = radius;
    }
    
    public Circle(){
    	setShapeColor("none");
    	this.radius = 0;
    }
    
    public double calcArea(){
 	   return 3.14*Math.pow(radius, 2);
    }
    
    public double getRadius(){
    	return radius;
    }
    
    public void draw(){
    	System.out.print(this);
		 System.out.println(", area is: " + this.calcArea());
    }
    
    @Override
    public String toString(){
 	   return String.format("This is %s, color is: %s, radius = %.2f", 
 	    getClass().getSimpleName(), getShapeColor().toUpperCase(), getRadius());
    }
    
    @Override
    public int compareTo(Object o){
    	Circle circle = (Circle)o;
    	if (this.calcArea() > circle.calcArea()) return 1;
    	if (this.calcArea() < circle.calcArea()) return -1;
    	return 0;
    }
}
