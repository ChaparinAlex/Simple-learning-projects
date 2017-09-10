package labs;

public class MyPyramid {
    public static void printPyramid(int height){
    	int[][] matrix = new int[height][2*height - 1];
    	for (int i = 0; i < height; i++){
    		matrix[i][(2*height - 1)/2] = i + 1;
    		int temp = matrix[i][(2*height - 1)/2];
    		for (int j = (2*height - 1)/2 - 1; j >= 0; j--){
    			if (temp > 0){
    				matrix[i][j] = --temp; 
    			}else{
    				matrix[i][j] = 0;
    			}
    		}
    		temp = matrix[i][(2*height - 1)/2];
    		for (int j = (2*height - 1)/2 + 1; j < 2*height - 1; j++){
    			if (temp > 0){
    				matrix[i][j] = --temp; 
    			}else{
    				matrix[i][j] = 0;
    			}
    		}
    	}
    	
    	for (int i = 0; i < height; i++){
    		for (int j = 0; j < 2*height - 1; j++){
    			if (matrix[i][j] == 0){
    				System.out.print(" ");
    			}else{
    				System.out.print(matrix[i][j]);
    			}
    		}
    		System.out.println();
    	}
    }
}
