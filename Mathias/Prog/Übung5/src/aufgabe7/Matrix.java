package aufgabe7;

import java.util.Scanner;

public class Matrix {
	static int[][] cube;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Kantenlänge? : ");
		int n = sc.nextInt();
		cube = new int[n][n];
		int[] nextPos = { ((n / 2) + 1), (n / 2) };
		for (int i = 1; i <= (n * n); i++) {
			cube[nextPos[0]][nextPos[1]] = i;
			System.out.println(i);
			nextPos[0] = (nextPos[0] + 1) % n;
			nextPos[1] = (nextPos[1] + 1) % n;
			System.out.println(nextPos[0] + " " + nextPos[1]);

			while (i < n * n && cube[nextPos[0]][nextPos[1]] != 0) {
				nextPos[0] = Math.floorMod(nextPos[0] + 1, n);
				nextPos[1] = Math.floorMod(nextPos[1] - 1, n);
				System.out.println(nextPos[0] + " " + nextPos[1]);
				System.out.println(-2 % 3);
			}
		}
		printCube();

	}

	public static void nextPos(int[] previous) {

	}

	public static void printCube() {
		for (int i = 0; i < cube.length; i++) {
			for (int j = 0; j < cube[i].length; j++) {
				System.out.print(cube[i][j] + " ");
			}
			System.out.println();
		}
	}
}
