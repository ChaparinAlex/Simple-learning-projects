package com.brainacad.oop.testshapes;

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
   
   @Override
   public String toString(){
	   return String.format("This is %s, color is: %s", 
			   getClass().getSimpleName(), getShapeColor().toUpperCase());
   }
}
