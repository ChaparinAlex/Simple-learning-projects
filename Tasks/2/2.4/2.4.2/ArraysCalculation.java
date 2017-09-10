package labs;

public class ArraysCalculation {
	public ArraysCalculation(){
	int[] array1 = {1,2,3};
	  int[] array2 = {4,5,6,7};
	  
	  int minElementofArray1 = MyMath.findMin(array1);
	  int maxElementofArray1 = MyMath.findMax(array1);
	  
	  int minElementofArray2 = MyMath.findMin(array2);
	  int maxElementofArray2 = MyMath.findMax(array2);
	  
	  System.out.printf("Minimum element in first array is %d%n"
	  		+ "Maximum element in first array is %d%n" +
	  		"Minimum element in second array is %d%n" + 
	  		"Maximum element in second array is %d%n", 
	  		minElementofArray1, maxElementofArray1, 
	  		minElementofArray2, maxElementofArray2);
	}
}
