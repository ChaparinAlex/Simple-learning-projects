package com.brainacad.oop.shapesexception;

public class Shape {
   private String shapeColor;
   
   public Shape(String shapeColor){
	   this.shapeColor = shapeColor;
   }
   
   public Shape(){
	   shapeColor = "white";
   }
   
   public String getShapeColor(){
	   return shapeColor;
   }
   
   public void setShapeColor(String shapeColor){
	   this.shapeColor = shapeColor;
   }
   
   public double calcArea(){
	   return 0.0;
   }
   
   /*  
    * public static Shape parseShape(String s){
	   String[] arrayOfStrings = s.split(":");
	   String[] arrayOfParametersOfShape = arrayOfStrings[2].split(",");
	   Shape shape;
	   
	  switch (arrayOfParametersOfShape.length){
	      case 1: {
	    	       shape = new Circle(arrayOfStrings[1], 
	    		   Double.parseDouble(arrayOfParametersOfShape[0]));
	    	 break;
	      }
	      case 2: {
	    	          shape = new Rectangle (arrayOfStrings[1], 
	    			  Double.parseDouble(arrayOfParametersOfShape[0]),
	    			  Double.parseDouble(arrayOfParametersOfShape[1]));
	    	  break;
	      }
	      case 3:{
	    	          shape = new Triangle(arrayOfStrings[1], 
	    			  Double.parseDouble(arrayOfParametersOfShape[0]),
	    			  Double.parseDouble(arrayOfParametersOfShape[1]),
	    			  Double.parseDouble(arrayOfParametersOfShape[2]));
	    	  break;
	      }
	      default: {
	    	           shape = new Shape(arrayOfStrings[1]);
	    	           break;
	      }
	  }
	  
	  return shape;
	   
   }
   
   /* for Lab_2_11_4 */
   
   public static Shape parseShape(String s) throws InvalidShapeStringException {
	   String[] arrayOfStrings = s.split(":");	   
	   if (arrayOfStrings.length != 3){
		   throw new InvalidShapeStringException();
	   }
	   if (!arrayOfStrings[0].equalsIgnoreCase("Circle") && 
			   !arrayOfStrings[0].equalsIgnoreCase("Rectangle")
			   && !arrayOfStrings[0].equalsIgnoreCase("Triangle")){
		   throw new InvalidShapeStringException();
	   }
	   
	   String[] arrayOfParametersOfShape = arrayOfStrings[2].split(",");
	   if (arrayOfStrings[0].equalsIgnoreCase("Circle") && 
			   arrayOfParametersOfShape.length != 1){
		   throw new InvalidShapeStringException();
	   }
	   if (arrayOfStrings[0].equalsIgnoreCase("Rectangle") && 
			   arrayOfParametersOfShape.length != 2){
		   throw new InvalidShapeStringException();
	   }
	   if (arrayOfStrings[0].equalsIgnoreCase("Triangle") && 
			   arrayOfParametersOfShape.length != 3){
		   throw new InvalidShapeStringException();
	   }
	   
	  	   
	  switch (arrayOfStrings[0]){
	      case "Circle": {
	    	       return Circle.parseCircle(s);
	      }
	      case "Rectangle": {
	    	       return Rectangle.parseRectangle(s);
	      }
	      case "Triangle":{
	    	       return Triangle.parseTriangle(s);
	      }
	      default: {
	    	       return new Shape(arrayOfStrings[1]);
	      }
	  }	   
   }
   
   @Override
   public String toString(){
	   return String.format("This is %s, color is: %s", 
			   getClass().getSimpleName(), getShapeColor().toUpperCase());
   }
}
