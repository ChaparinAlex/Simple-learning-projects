package shapes.abstraction;

public class Rectangle extends Shape implements Comparable{
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
	
	public void draw(){
    	System.out.print(this);
		 System.out.println(", area is: " + this.calcArea());
    }
	
	 @Override
	public String toString(){
	 return String.format("This is %s, color is: %s, width = %.2f, height = "
	  + "%.2f", getClass().getSimpleName(), getShapeColor().toUpperCase(), 
	  getWidth(), getHeight());
	}
	 
	 @Override
	public int compareTo(Object o){
	   Rectangle rectangle = (Rectangle)o;
	   if (this.calcArea() > rectangle.calcArea()) return 1;
	   if (this.calcArea() < rectangle.calcArea()) return -1;
	   return 0;
	}

}
