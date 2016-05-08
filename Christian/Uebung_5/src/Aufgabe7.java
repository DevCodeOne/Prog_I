import java.util.Random;

public class Aufgabe7 {
	
	public static void main(String [] args) {
		int sizes[] = new int[] {128, 256, 512, 1024};
		
		for (int i = 0; i < sizes.length; i++) {
			System.out.println("Größe " + sizes[i]);
			double [][] mat1 = generateMatrix(sizes[i], System.currentTimeMillis());
			double [][] mat2 = generateMatrix(sizes[i], System.currentTimeMillis());
			
			System.out.print("Starte mult variante ijk : ");
			
			long time = System.currentTimeMillis(); 
			
			double [][] erg1 = mult_ijk(mat1, mat2); 
			
			System.out.println(" " + (System.currentTimeMillis() - time) + " ms");
			
			System.out.print("Starte mult variante ikj : ");
			
			time = System.currentTimeMillis(); 
			
			double [][] erg2 = mult_ikj(mat1, mat2); 
			
			System.out.println(" " + (System.currentTimeMillis() - time) + " ms");
			
			/*
			 *  Teste ob Matritzen gleich sind
			for (int j = 0; j < erg1.length; j++) {
				for (int k = 0; k < erg1[0].length; k++) {
					if (Math.abs(erg1[j][k] - erg2[j][k]) > Double.MIN_VALUE) {
						System.out.println("Fehler !!!");
					}
				}
			}
			*/
		}
	}
	
	public static double[][] mult_ijk(double [][] mat1, double [][] mat2) {
		double [][] erg = new double[mat1.length][mat2[0].length];
		
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat2[0].length; j++) {
				for (int k = 0; k < mat1.length; k++) {
					erg[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
		
		return erg;
	}
	
	public static double[][] mult_ikj(double [][] mat1, double [][] mat2) {
		double [][] erg = new double[mat1.length][mat2[0].length];
		
		for (int i = 0; i < mat1.length; i++) {
			for (int k = 0; k < mat1.length; k++) {
				for (int j = 0; j < mat2[0].length; j++) {
					erg[i][j] += mat1[i][k] * mat2[k][j];
				}
			}
		}
		
		return erg;
	}
	
	public static double [][] generateMatrix(int size, long seed) {
		double[][] matrix = new double[size][size];
		Random rand = new Random(seed);
		for (int i = 0; i < size; i++)
			for (int j = 0; j < size; j++)
					matrix[i][j] = rand.nextDouble();
		return matrix;
	}
}
