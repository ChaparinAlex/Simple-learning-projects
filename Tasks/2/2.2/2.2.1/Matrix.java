package labs;

import java.util.Random;

public class Matrix {
	 private static final int SIZE = 2;
     private final int matrix[][] = new int[SIZE][SIZE];
     public void fillMatrix(){
  	   Random r = new Random();
  	   int min = 0, max = 9;
  	   for (int rows = 0; rows < matrix.length; rows++){
  		   for (int columns = 0; columns < matrix.length; columns++){
  			   matrix[rows][columns] = r.nextInt(max - min + 1) + min;
  		   }
  	   }
     }
     public static Matrix addition(Matrix matrix1, Matrix matrix2){
    	 Matrix temp = new Matrix();
  	   for (int rows = 0; rows < SIZE; rows++){
  		   for (int columns = 0; columns < SIZE; columns++){
  			   temp.matrix[rows][columns] = matrix1.matrix[rows][columns] + 
  					 matrix2.matrix[rows][columns];
  		   }
  	   } 
  	   return temp;
     }
     public static Matrix multiplication(Matrix matrix1, Matrix matrix2){
    	 Matrix temp = new Matrix(); 
  	   for (int rows = 0; rows < SIZE; rows++){
  		   for (int columns = 0; columns < SIZE; columns++){
  			   temp.matrix[rows][columns] = matrix1.matrix[rows][columns]*
  					 matrix2.matrix[rows][columns];
  		   }
  	   } 
  	   return temp;
     }
     public void print(){
  	   for (int rows = 0; rows < SIZE; rows++){
  		   for (int columns = 0; columns < SIZE; columns++){
  			   System.out.printf("%-5d", matrix[rows][columns]);
  		   }
  		   System.out.println();
  	   }
  	   System.out.println();
     }
  }
