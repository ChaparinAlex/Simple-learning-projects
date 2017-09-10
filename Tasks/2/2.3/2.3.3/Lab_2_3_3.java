/*
 * Add to class Window overload constructors, which will initialize class’ 
 * fields, depend from what data we will put there:
MyWindow(width, height),
MyWindow(width, height, numberOfGlass).
Finally class MyWindow must have four constructors)
 */

package labs;

public class Lab_2_3_3 {

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
