/*
 * Create class “MyInit” with field “arr”of array of integers and 
 * non-static initialization block which will initialize that array
 *  with random values. (Size of array is 10)
To generate random numbers you can use next code:  
arr[i]= (int) (100 * Math.random()). 
(Or using Random class instance and nextInt() method invocation).
Add to class MyInit and method “printArray()” which will print values
of this array. Create class Main, which will create two instances of 
class MyInit and invoke method “printArray()” to print values of their 
arrays on console.

Example of output:
23,43,11,34,78,59,34,61,24,2
5,48,50,3,1,4,67,62,78,98

 */

package labs;

public class Lab_2_5_2 {

	public static void main(String[] args) {
		MyInit testArray1 = new MyInit();
		MyInit testArray2 = new MyInit();
		testArray1.printArray();
		testArray2.printArray();
	}

}
