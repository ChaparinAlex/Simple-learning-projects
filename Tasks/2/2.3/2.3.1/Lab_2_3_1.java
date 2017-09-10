/*
 * Create class “MyWindow” with fields (width (of double type), height 
 * (of double type), numberOfGlass(of int type), color(of  String type), 
 * isOpen(boolean)). Create five instances of class MyWindow,  with different 
 * fields values.

 */

package labs;

public class Lab_2_3_1 {

	public static void main(String[] args) {
		   MyWindow[] windows = new MyWindow[5];
		   for (int i = 0; i < 5; i++){
			   windows[i] = new MyWindow();
		   }
		   windows[0].setWidth(2.2);
		   windows[0].setHeight(3.3);
		   windows[0].setNumberOfGlass(5);
		   windows[0].setColor("red");
		   windows[0].setOpen(true);
		   
		   windows[1].setWidth(2.8);
		   windows[1].setHeight(3.8);
		   windows[1].setNumberOfGlass(6);
		   windows[1].setColor("black");
		   windows[1].setOpen(true);
		   
		   windows[2].setWidth(6.9);
		   windows[2].setHeight(2.4);
		   windows[2].setNumberOfGlass(7);
		   windows[2].setColor("orange");
		   windows[2].setOpen(false);
		   
		   windows[3].setWidth(7.5);
		   windows[3].setHeight(3.8);
		   windows[3].setNumberOfGlass(8);
		   windows[3].setColor("white");
		   windows[3].setOpen(true);
		   
		   windows[4].setWidth(5.7);
		   windows[4].setHeight(4.0);
		   windows[4].setNumberOfGlass(10);
		   windows[4].setColor("green");
		   windows[4].setOpen(false);
		   
		   for (int i = 0; i < 5; i++){
			   System.out.println("Window " + (i+1) + ":");
			  windows[i].printFields();
		   }
	}

}
