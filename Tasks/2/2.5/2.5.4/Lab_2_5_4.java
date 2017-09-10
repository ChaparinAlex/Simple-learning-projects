/*
 * Change MyInit class: 
-	Change initialization block to static initialization block. 
- Compile and run. What will you see and why?
 */

package labs;

public class Lab_2_5_4 {

	public static void main(String[] args) {
		System.out.println("After changing initialization block to static "
				+ "block there will be an error, because variable arr[] isn't "
				+ "static and there can't be a static reference to this "
				+ "variable.");

	}

}
