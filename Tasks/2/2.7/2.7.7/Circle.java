package com.brainacad.oop.testshapes;

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
    
    @Override
    public String toString(){
 	   return String.format("This is %s, color is: %s, radius = %.2f", 
 	    getClass().getSimpleName(), getShapeColor().toUpperCase(), getRadius());
    }
}
