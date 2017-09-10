/*
 * Create class Matrix with 2D array (int, size 2x2) field and methods: 
 * addition and multiplication of matrices
 */

package labs;

public class Lab_2_2_1 {

	public static void main(String[] args) {
		Matrix a = new Matrix();
		a.fillMatrix();
		System.out.println("Matrix A:");
		a.print();
		Matrix b = new Matrix();
		b.fillMatrix();
		System.out.println("Matrix B:");
		b.print();
		Matrix c = Matrix.addition(a, b);
		System.out.println("Matrix C = A + B:");
		c.print();
		Matrix d = Matrix.multiplication(a, b);
		System.out.println("Matrix D = A * B (arithmetically):");
		d.print();
	}

}
