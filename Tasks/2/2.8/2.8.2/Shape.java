package shapes.abstraction;

public abstract class Shape implements Drawable {
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
   
   public abstract double calcArea();
   
   @Override
   public String toString(){
	   return String.format("This is %s, color is: %s", 
			   getClass().getSimpleName(), getShapeColor().toUpperCase());
   }
}
