/*
 *  Add method “printFields” to  MyWindow class. 
    In printFields method write code that print all fields values to console.
    Create array of MyWindow’s and fill it by creating MyWindow’s objects 
    using different constructors. Call method “printFields” on each array 
    element.
 */

package labs;

public class Lab_2_3_5 {

	public static void main(String[] args) {
		   MyWindow window1 = new MyWindow(2.2, 3.3, 5, "red", true);
		   MyWindow window2 = new MyWindow(1.2, 4.3);
		   MyWindow window3 = new MyWindow(2.8, 3.7, 10);
		   MyWindow window4 = new MyWindow(5.2, 6.4, 8, "yellow");
		   
		   MyWindow[] windows = {window1, window2, window3, window4};
		   int k = 1;
		   for (MyWindow myWin:windows){
			   System.out.println("Window " + k + ":");
			   myWin.printFields();
			   k++;
		   }

	}

}
