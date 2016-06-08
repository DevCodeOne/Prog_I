import java.util.Scanner;

public class RegulaFalsi {
	public static void main(String[] args) {
		double a, b, xs = 0;
		final double EPSILON1 = 0.0000000001;
		final double EPSILON2 = 0.0000000001;
		final int MaxIter = 10000;
		int k = 1;
		Scanner sc = new Scanner(System.in);
		
		//Eingabe Eingangsvariablen
		do {
			System.out.println("Variable a: ");
			a = sc.nextDouble();
			System.out.println("Variable b: ");
			b = sc.nextDouble();
			System.out.print(f(a) > 0 ? "a muss kleiner 0 sein" : "");
			System.out.print((f(a) * f(b)) > 0 ? "Kein Nullpunkt zwischen a und b erkennbar" : "");
		} while ((f(a) * f(b)) > 0&&f(a) > 0);

			// Beginn Halbierung
		do {
			xs = Xs(a, b);
			b = (f(a) * f(xs)) < 0 ? xs : b;
			a = (f(a) * f(xs)) < 0 ? a : xs;
			k++;
		} while ((b - a) > (2 * EPSILON1) && k < MaxIter && Math.abs(f(xs)) > EPSILON2);
		
		//Ausgabe Abbruchkriterium
		System.out.println("Abbruchkriterium war: " + ((b - a) < (2 * EPSILON1)?"(b-a)<2*EPSILON1":(k == MaxIter?"MaxIter":"|f(xs)|<EPSILON2")));
		
		//Ausgabe Nullstelle
		System.out.println("Nullstelle liegt bei: " + ((b - a) < (2 * EPSILON1)?(a+b)/2:(k == MaxIter?"zu ungenau?!" + xs :xs)));
		sc.close();
	}

	public static double Xs(double a, double b) {
		return ((a * f(b) - b * f(a)) / (f(b) - f(a)));
	}

	//Funktionsmethode
	public static double f(double x) {
		 return (x + Math.pow(Math.E, x) - 1);
		// return (Math.pow(x, 4)-2);
		//return (Math.pow(Math.E, x) - 5 * x + 1);
	}
}
