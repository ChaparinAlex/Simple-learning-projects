package labs;

public class MyWindow {
	    private double width;
	    private double height;
	    private int numberOfGlass;
	    private String color;
	    private boolean open;
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
		public int getNumberOfGlass() {
			return numberOfGlass;
		}
		public void setNumberOfGlass(int numberOfGlass) {
			this.numberOfGlass = numberOfGlass;
		}
		public String getColor() {
			return color;
		}
		public void setColor(String color) {
			this.color = color;
		}
		public boolean isOpen() {
			return open;
		}
		public void setOpen(boolean open) {
			this.open = open;
		}
		public MyWindow(double width, double height, int numberOfGlass, 
				String color, boolean open) {
			this.width = width;
			this.height = height;
			this.numberOfGlass = numberOfGlass;
			this.color = color;
			this.open = open;
			System.out.println("Constructor #1 invoked!\n");
		}
		/* public MyWindow(double width, double height) {
			this.width = width;
			this.height = height;
			System.out.println("Constructor #2 invoked!\n");
		} */
		public MyWindow(double width, double height) {
			this(width, height, 0, "white", false);
			System.out.println("Constructor #2 invokes constructor #1!\n");
		}
		/* public MyWindow(double width, double height, int numberOfGlass) {
			this.width = width;
			this.height = height;
			this.numberOfGlass = numberOfGlass;
			System.out.println("Constructor #3 invoked!\n");
		} */
		public MyWindow(double width, double height, int numberOfGlass) {
			this(width, height, numberOfGlass, "white", false);
			System.out.println("Constructor #3 invokes constructor #1!\n");
		}
		public MyWindow(double width, double height, int numberOfGlass, 
				String color) {
			this.width = width;
			this.height = height;
			this.numberOfGlass = numberOfGlass;
			this.color = color;
			System.out.println("Constructor #4 invoked!\n");
		}
		public MyWindow(){
			this.width = 1.0;
			this.height = 1.0;
			this.numberOfGlass = 1;
			this.color = "white";
			this.open = false;
			System.out.println("Default constructor invoked!\n");
		}
		public void printFields(){
			System.out.println("Width: " + this.width + "\nHeight: " + 
		this.height + "\nNumber of glass: " + this.numberOfGlass + 
		"\nColor: " + this.color + "\nIs open: " + this.open + ".\n");
		}
}
