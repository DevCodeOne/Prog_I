package aufgabe1;

public class Schach {
	static int[][] brett;

	public static void main(String[] args) {
		int dame;
		do {
			brett = new int[8][8];
			dame = 0;

			do {
				// Zufallswerte für x und y
				int i = (int) (Math.random() * 8);
				int j = (int) (Math.random() * 8);

				if (brett[i][j] == 0) { // freies Feld?

					brett[i][j] = 1; // Dame setzen
					fillbrett(i, j); // Linien für die Dame
					dame++; // eine Dame mehr auf dem Feld
				}
			} while (leer()); // wenn noch 0en da sind
		} while (dame < 8); // 8 Damen auf dem feld

		showbrett();
	}

	// Ausgabe des Bretts
	static void showbrett() {
		for (int i = 0; i < brett.length; i++) {
			for (int j = 0; j < brett[i].length; j++) {
				System.out.print(brett[i][j] + " ");

			}
			System.out.println();
		}
	}

	// Methode liefert true zurück wenn es noch 0en auf dem Feld gibt
	static boolean leer() {
		for (int i = 0; i < brett.length; i++) {
			for (int j = 0; j < brett[i].length; j++) {
				if (brett[i][j] == 0)
					return true;
			}
		}
		return false;
	}

	// Füllt die Linien der Damen mit 2er
	static public void fillbrett(int x, int y) {

		// horizontale Linie
		for (int hor = 0; hor < brett[x].length; hor++) {
			if (brett[x][hor] != 1) {
				brett[x][hor] = 2;
			}
		}

		// vertikale Linie
		for (int ver = 0; ver < brett.length; ver++) {
			if (brett[ver][y] != 1) {
				brett[ver][y] = 2;
			}
		}

		// diagonal nach unten
		int diag1 = x;
		int diag2 = y;

		if (diag1 <= diag2) {
			diag2 = diag2 - diag1;
			diag1 = 0;
		}
		if (diag1 > diag2) {
			diag1 = diag1 - diag2;
			diag2 = 0;
		}

		while (diag1 <= 7 && diag2 <= 7) {
			if (brett[diag1][diag2] != 1) {
				brett[diag1][diag2] = 2;
			}
			diag1++;
			diag2++;
		}

		// diagonal nach oben
		diag1 = x;
		diag2 = y;

		while (diag2 > 0 && diag1 < 7) {
			diag1++;
			diag2--;
		}
		while (diag1 >= 0 && diag2 <= 7 && diag2 >= 0 && diag1 <= 7) {
			if (brett[diag1][diag2] != 1) {
				brett[diag1][diag2] = 2;
			}
			diag1--;
			diag2++;
		}
	}
}
