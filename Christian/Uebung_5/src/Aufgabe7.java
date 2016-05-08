import java.util.Random;

public class Aufgabe7 {
	
	public static void main(String [] args) {
		int sizes[] = new int[] {128, 256, 512, 1024};
		
		for (int i = 0; i < sizes.length; i++) {
			System.out.println("Größe " + sizes[i]);
			double [][] mat1 = generateMatrix(sizes[i], System.currentTimeMillis());
			double [][] mat2 = generateMatrix(sizes[i], System.currentTimeMillis());
			
			// methode ijk 
			
			System.out.print("Starte mult variante ijk : ");
			
			long time = System.currentTimeMillis(); 
			
			double [][] erg1 = mult_ijk(mat1, mat2); 
			
			System.out.println(" " + (System.currentTimeMillis() - time) + " ms");
			
			// methode ikj
			
			System.out.print("Starte mult variante ikj : ");
			
			time = System.currentTimeMillis(); 
			
			double [][] erg2 = mult_ikj(mat1, mat2); 
			
			System.out.println(" " + (System.currentTimeMillis() - time) + " ms");
			
			// methode rek
			
			System.out.print("Starte mult variante rek : ");
			
			time = System.currentTimeMillis(); 
			
			double [][] erg3 = mult_rek(mat1, mat2); 
			
			System.out.println(" " + (System.currentTimeMillis() - time) + " ms");
			
			// Teste ob Matritzen gleich sind
			for (int j = 0; j < erg1.length; j++) {
				for (int k = 0; k < erg1[0].length; k++) {
					if (Math.abs(erg1[j][k] - erg3[j][k]) > 10E-13) {
						System.out.println("Fehler !!! " + Math.abs(erg1[j][k] - erg3[j][k]) +
								 "erg1 : " + erg1[j][k] + " erg3 : " + erg3[j][k]);
					}
				}
			}
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
	
	
	public static double[][] mult_rek(double [][] m1, double [][] m2) {
		double [][] erg = new double[m1.length][]; 
		
		if (m1.length == 2) {
			erg[0] = new double[] {
					m1[0][0] * m2[0][0] + m1[0][1] * m2[1][0],
					m1[0][0] * m2[0][1] + m1[0][1] * m2[1][1]
			};
			erg[1] = new double[] {
					m1[1][0] * m2[0][0] + m1[1][1] * m2[1][0],
					m1[1][0] * m2[0][1] + m1[1][1] * m2[1][1]
			};
		} else {
			erg = new double[m1.length][m1[0].length];
			double [][][] submat1 = quarterMatrix(m1); 
			double [][][] submat2 = quarterMatrix(m2); 
			double [][][] ergmat = new double[4][submat1.length][submat2.length];
			
			// TODO check 
			ergmat[0] = addMatrix(mult_rek(submat1[0], submat2[0]), mult_rek(submat1[1], submat2[2]));
			ergmat[1] = addMatrix(mult_rek(submat1[0], submat2[1]), mult_rek(submat1[1], submat2[3]));
			ergmat[2] = addMatrix(mult_rek(submat1[2], submat2[0]), mult_rek(submat1[3], submat2[2]));
			ergmat[3] = addMatrix(mult_rek(submat1[2], submat2[1]), mult_rek(submat1[3], submat2[3]));
			
			for (int i = 0; i < erg.length / 2; i++) {
				for (int j = 0; j < erg[0].length / 2; j++) {
					erg[i][j] = ergmat[0][i][j]; 
					erg[i][j + erg[0].length / 2] = ergmat[1][i][j];
					erg[i + erg.length / 2][j] = ergmat[2][i][j]; 
					erg[i + erg.length / 2][j + erg[0].length / 2] = ergmat[3][i][j];
				}
			}
		}
		return erg;
	}
	
	public static double[][][] quarterMatrix(double m1[][]) {
		double subm1[][][] = new double[4][m1.length / 2][m1[0].length / 2];
		
		for (int i = 0; i < m1.length / 2; i++) {
			for (int j = 0; j < m1[0].length / 2; j++) {
				subm1[0][i][j] = m1[i][j];
				subm1[1][i][j] = m1[i][j + m1.length / 2];
				subm1[2][i][j] = m1[i + m1.length / 2][j];
				subm1[3][i][j] = m1[i + m1.length / 2][j + m1.length / 2];
			}
		}
		return subm1;
	}
	
	public static double[][] addMatrix(double [][] mat1, double [][] mat2) {
		double [][] erg = new double[mat1.length][mat1[0].length];
		
		for (int i = 0; i < mat1.length; i++) {
			for (int j = 0; j < mat1[0].length; j++) {
				erg[i][j] = mat1[i][j] + mat2[i][j];
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
