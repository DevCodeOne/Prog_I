package aufgabe6;

import java.util.Random;
import java.util.Scanner;

public class MagicCube {

	public static void main(String[] args) {
		double[][] mat1 = generateMatrix(512, 2);
		double[][] mat2 = generateMatrix(512, 3);
		long time = System.currentTimeMillis();
		double[][] mat3 = mult_ijk(mat1, mat2);
		System.out.println("Mat3 fertig " + (System.currentTimeMillis()-time) );
//		for (int i = 0; i < mat3.length; i++) {
//			for (int j = 0; j < mat3.length; j++) {
//				System.out.print(mat3[i][j]+" ");
//			}
//			System.out.println();
//		}
		time = System.currentTimeMillis();
		double[][] mat4 = mult_ijk(mat1, mat2);
		System.out.println("Mat4 fertig " + (System.currentTimeMillis()-time) );

	}

	public static double[][] mult_ijk(double[][] a, double[][] b) {
		double[][] erg = new double[a.length][b[0].length];
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a.length; j++) {
				for (int k = 0; k < a.length; k++) {
					erg[i][j] += a[i][k] * b[k][j];
				}
			}
		}
		return erg;
	}

	 public static double [][] mult_ikj ( double [][] a, double [][] b)
	 {
		 double[][] erg = new double[a.length][b[0].length];
		 for (int i = 0; i < a.length; i++) {
				for (int j = 0; j < a.length; j++) {
					for (int k = 0; k < a.length; k++) {
						erg[i][j] += a[i][j] * b[j][k];
					}
				}
			}
			return erg;
	 }
	// public static double [][] mult_rek ( double [][] a, double [][] b)
	// {
	// }
	// Erzeugt size x size Zufallsmatrix
	public static double[][] generateMatrix(int size, int seed) {
		double[][] matrix = new double[size][size];
		Random rand = new Random(seed);
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
				matrix[i][j] = rand.nextDouble();
		return matrix;
	}
}
