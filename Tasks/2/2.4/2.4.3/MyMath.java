package labs;

public class MyMath {
	
		   private static final double PI = 3.14;
		   public static double areaOfCircle(double radius){
			   return PI*Math.pow(radius, 2);
		   }
		   public static int findMin(int[] array){
			   int minValue = array[0];
			   for (int i = 1; i < array.length; i++){
				   if (minValue > array[i]){
					   minValue = array[i];
				   }
			   }
			   return minValue;
		   }
		   public static int findMax(int[] array){
			   int maxValue = array[0];
			   for (int i = 1; i < array.length; i++){
				   if (maxValue < array[i]){
					   maxValue = array[i];
				   }
			   }
			   return maxValue;
		   }
}
