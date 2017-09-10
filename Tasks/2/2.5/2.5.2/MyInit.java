package labs;

public class MyInit {
    private int[] arr; 
	
	{
	   arr = new int[10];
	   for (int i = 0; i < arr.length; i++){
		   arr[i]= (int) (100 * Math.random());
	   }
	}
	
	public void printArray(){
		for (int i = 0; i < arr.length; i++){
			System.out.print(arr[i] + " ");
		}
		System.out.println();
	}
}
