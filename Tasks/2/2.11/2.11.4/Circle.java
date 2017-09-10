package com.brainacad.oop.shapesexception;

public class Circle extends Shape{
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
    
    public static Circle parseCircle(String s){
       String[] arrayOfStrings = s.split(":");
 	   String[] arrayOfParametersOfShape = arrayOfStrings[2].split(",");
 	   Circle circle = new Circle(arrayOfStrings[1], 
 	    		   Double.parseDouble(arrayOfParametersOfShape[0]));
 	   return circle;
    }
    
    @Override
    public String toString(){
 	   return String.format("This is %s, color is: %s, radius = %.2f", 
 	    getClass().getSimpleName(), getShapeColor().toUpperCase(), getRadius());
    }
}
