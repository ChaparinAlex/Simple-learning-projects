package labs;

public class MyMatrix {
   
	public static void main(String[] args) {
		Matrix matrixOrigin1 = new Matrix();
		matrixOrigin1.fillMatrix();
		System.out.println("The first matrix:");
		matrixOrigin1.print();
		
		Matrix matrixOrigin2 = new Matrix();
		matrixOrigin2.fillMatrix();
		System.out.println("The second matrix:");
		matrixOrigin2.print();
		
		Matrix matrixOrigin3 = Matrix.addition(matrixOrigin1, matrixOrigin2);
		System.out.println("The third matrix = sum of the first and second "
				+ "matrixes:");
		matrixOrigin3.print();
		
		Matrix matrixOrigin4 = Matrix.multiplication(matrixOrigin1, 
				matrixOrigin2);
		System.out.println("The fourth matrix = arithmetic multiplication "
				+ "of the first and second matrixes:");
		matrixOrigin4.print();
	}
}
