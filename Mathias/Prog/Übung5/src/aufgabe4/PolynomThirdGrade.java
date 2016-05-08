package aufgabe4;

import java.util.Scanner;

public class PolynomThirdGrade {

	public static void main(String[] args) {
		int grade = 0;

		Scanner sc = new Scanner(System.in);
		System.out.println("Welchen Grad soll das Polynom haben?");
		grade = sc.nextInt();
		Double[] koeff = new Double[grade];
		double x;

		for (int i = 0; i < grade; i++) {
			System.out.println((i + 1) + ". Koeffizient: ");
			koeff[i] = sc.nextDouble();
		}

		do {
			double erg = 0;
			System.out.println("x eingeben: ");
			x = sc.nextDouble();
			if (xnn(x))
				System.exit(0);
			for (int i = 0; i < grade; i++) {
				erg += koeff[i] * Math.pow(x, i);
			}
			//erg += koeff[grade - 1];
			System.out.println("Das ergebnis = " + erg);
		} while (true);

	}

	public static boolean xnn(Double x) {
		if (x < Double.MIN_VALUE) {
			System.out.println("x darf nicht 0 sein!");
			return true;
		}
		return false;
	}
}
