import java.util.Scanner;

public class Bisektion {

	public static void main(String[] args) {
		double a, b, x = 0;
		final double EPSILON1 = 0.0000000001;
		final double EPSILON2 = 0.0000000001;

		int k = 1;
		Scanner sc = new Scanner(System.in);
		
		//Eingabe der Eingangvariablen
		do {
			System.out.println("Variable a: ");
			a = sc.nextDouble();
			System.out.println("Variable b: ");
			b = sc.nextDouble();
			System.out.print(f(a) > 0 ? "a muss kleiner 0 sein" : "");
			System.out.print((f(a) * f(b)) > 0 ? "Kein Nullpunkt zwischen a und b erkennbar" : "");
		} while ((f(a) * f(b)) > 0 && f(a) > 0);
		
		//Berechnung MaxIterationen 
		double MaxIter = Math.ceil(ld(((b - a) / EPSILON2)));
		System.out.println(MaxIter);
		
		// Schleife für die Zwischenwerte
		do {
			x = X(a, b);
			b = f(x) <= 0 ? b : x;
			a = f(x) <= 0 ? x : a;
			k++;
			System.out.println(k);
		} while ((b - a) > (2 * EPSILON1) && k < MaxIter && Math.abs(f(x)) > EPSILON2);
		
		//Ausgabe Abbruchkriterium
		System.out.println("Abbruchkriterium war: "
				+ ((b - a) < (2 * EPSILON1) ? "(b-a)<2*EPSILON1" : (k == MaxIter ? "MaxIter" : "|f(xs)|<EPSILON2")));
		
		//Ausgabe Nullstelle
		System.out.println("Nullstelle liegt bei: " + x);
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
		return (Math.pow(Math.E, x) - 5 * x + 1);
	}

	// Basiswechselsatz
	public static double ld(double x) {
		return Math.log(x) / Math.log(2.0);
	}

}
