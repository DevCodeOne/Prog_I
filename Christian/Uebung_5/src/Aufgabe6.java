public class Aufgabe6 {

	public static final int KANTENLAENGE = 3;
	
	public static void main(String [] args) {
		int [][] quadr = erstelleMagViereck(KANTENLAENGE); 
		
		for (int i = 0; i < quadr.length; i++) {
			for (int j = 0; j < quadr[0].length; j++) {
				System.out.print(quadr[i][j] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] erstelleMagViereck(int n) {
		int [][] quadr = new int[n][n];
		int pos[];
		
		quadr[n / 2 + 1][n / 2] = 1;
		
		pos = platziereZahl(quadr, n / 2 + 1, n / 2);

		for (int i = 1; i < n * n - 1; i++) {
			pos = platziereZahl(quadr, pos[0], pos[1]);
		}
		
		return quadr;
	}
	
	public static int[] platziereZahl(int [][] quadr, int i, int j) {
		int nextY = (i + 1) % quadr.length;
		int nextX = (j + 1) % quadr[0].length;
		
		if (quadr[nextY][nextX] != 0) { // zelle ist frei
			nextY = (i + 1) % quadr.length;
			nextX = (j - 1) % quadr[0].length;
			
			while(nextX < 0) nextX += quadr[0].length;
			
			while(quadr[nextY][nextX] != 0) {
				nextY = (nextY + 1) % quadr.length;
				nextX = (nextX - 1) % quadr[0].length;
				
				while(nextX < 0) nextX += quadr[0].length;
			}
		}
		quadr[nextY][nextX] = quadr[i][j] + 1;
		return new int[] {nextY, nextX};
	}
}
