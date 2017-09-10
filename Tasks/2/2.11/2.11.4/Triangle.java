package com.brainacad.oop.shapesexception;

public class Triangle extends Shape{
	private double a;
	private double b;
	private double c;
	
	public Triangle(String shapeColor, double a, double b, double c){
		setShapeColor(shapeColor);
		this.a = a;
		this.b = b;
		this.c = c;
	}
	
	public Triangle(){
		setShapeColor("none");
		this.a = 0.0;
		this.b = 0.0;
		this.c = 0.0;
	}
	
	public double getA() {
		return a;
	}

	public void setA(double a) {
		this.a = a;
	}

	public double getB() {
		return b;
	}

	public void setB(double b) {
		this.b = b;
	}

	public double getC() {
		return c;
	}

	public void setC(double c) {
		this.c = c;
	}

	public double calcArea(){
		double s = (a + b + c)/2;
	 	   return Math.sqrt(s*(s - a)*(s - b)*(s - c));
	}
	
	public static Triangle parseTriangle(String s){
		String[] arrayOfStrings = s.split(":");
		   String[] arrayOfParametersOfShape = arrayOfStrings[2].split(",");
		   Triangle tr = new Triangle(arrayOfStrings[1], 
		    			  Double.parseDouble(arrayOfParametersOfShape[0]),
		    			  Double.parseDouble(arrayOfParametersOfShape[1]),
		    			  Double.parseDouble(arrayOfParametersOfShape[2]));
		return tr;
	}
	
	@Override
	public String toString(){
	 return String.format("This is %s, color is: %s, a = %.2f, b = %.2f, c = "
	 	+ "%.2f", getClass().getSimpleName(), getShapeColor().toUpperCase(), 
	  getA(), getB(), getC());
	}

}
