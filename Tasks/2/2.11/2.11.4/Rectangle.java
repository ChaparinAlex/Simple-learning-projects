package com.brainacad.oop.shapesexception;

public class Rectangle extends Shape{
	private double width;
	private double height;
	
	public Rectangle(String shapeColor, double width, double height){
		setShapeColor(shapeColor);
		this.width = width;
		this.height = height;
	}
	
	public Rectangle(){
		setShapeColor("none");
		this.width = 0.0;
		this.height = 0.0;
	}
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public double calcArea(){
	 	   return width*height;
	}
	
	public static Rectangle parseRectangle (String s){
		String[] arrayOfStrings = s.split(":");
		   String[] arrayOfParametersOfShape = arrayOfStrings[2].split(",");
		   Rectangle rect = new Rectangle (arrayOfStrings[1], 
	    			  Double.parseDouble(arrayOfParametersOfShape[0]),
	    			  Double.parseDouble(arrayOfParametersOfShape[1]));
		   
		return rect;
	}
	
	 @Override
	public String toString(){
	 return String.format("This is %s, color is: %s, width = %.2f, height = "
	  + "%.2f", getClass().getSimpleName(), getShapeColor().toUpperCase(), 
	  getWidth(), getHeight());
	}

}
