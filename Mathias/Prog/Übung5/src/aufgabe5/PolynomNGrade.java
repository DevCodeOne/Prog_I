package aufgabe5;

import java.util.Scanner;

public class PolynomNGrade {

	public static void main(String[] args) {
		double a, b, c, d, x;
		Scanner sc = new Scanner(System.in);
		System.out.println("a eingeben: ");
		a = sc.nextDouble();
		System.out.println("b eingeben: ");
		b = sc.nextDouble();
		System.out.println("c eingeben: ");
		c = sc.nextDouble();
		System.out.println("d eingeben: ");
		d = sc.nextDouble();
		do {
			System.out.println("x eingeben: ");
			x = sc.nextDouble();
			if (xnn(x))
				System.exit(0);
			System.out.println("Das ergebnis = " + ((a * Math.pow(x, 3)) + (b * Math.pow(x, 2)) + (c * x) + d));
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
