import java.util.Scanner;

public class aufgabe3 {
	public static void main(String[] args) {
		double a = 0, b, c, x = 0;
		final double EPSILON1 = 0.0000000001;
		final double EPSILON2 = 0.0000000001;
		int k = 1;
		Scanner sc = new Scanner(System.in);

		System.out.println("Zahl von der die Wurzel gezogen werden soll: ");
		b = sc.nextDouble();
		
		//Übergabe des wertes zum Vergleich
		c = b;
		
		//Berechnung MaxIterationen
		double MaxIter = Math.ceil(ld(((b - a) / EPSILON2)));

		//Beginn Zwischenwertschleife
		do {
			x = X(a, b);
			b = f(x) <= c ? b : x;
			a = f(x) <= c ? x : a;
			k++;
		} while ((b - a) > (2 * EPSILON1) && k < MaxIter && Math.abs(f(x)) > EPSILON2);
		
		//Ausgabe Abbruchkriterium
		System.out.println("Abbruchkriterium war: "
				+ ((b - a) < (2 * EPSILON1) ? "(b-a)<2*EPSILON1" : (k == MaxIter ? "MaxIter" : "|f(xs)|<EPSILON2")));
		
		//Ausgabe Wurzelwert
		System.out.println("Die Wurzel von " + c + " liegt bei: " + x);
		sc.close();
	}

	// Zwischenwert
	public static double X(double a, double b) {
		return ((a + b) / 2);
	}

	// Funktionsmethode
	public static double f(double x) {
		// return (x + Math.pow(Math.E, x) - 1);
		// return (Math.pow(x, 4)-2);
		return (x * x);
	}

	// Basiswechselsatz
	public static double ld(double x) {
		return Math.log(x) / Math.log(2.0);
	}
}
