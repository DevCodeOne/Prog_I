package aufgabe3;

public class Binomialkoefizient {

	public static void main(String[] args) {
		long time;
		double n=926.0,k=915.0;
		time = System.currentTimeMillis();
		System.out.println(Binom(n, k));
		System.out.println("Normal" + (System.currentTimeMillis()-time));
		time = System.currentTimeMillis();
		System.out.println(BinomRek(n, k));
		System.out.println("Rekursiv" + (System.currentTimeMillis()-time));
		

	}

	public static double Binom(double n, double k) {
		double x = 1, x2 = 1;
		for (int i = 0; i < k; i++) {
			x *= n - i;
			x2 *= (i + 1);
		}
		return (x / x2);
	}

	public static double BinomRek(double n, double k) {
		if (n == k || Math.abs(k) < 1) {
			return 1;
		} else
			return BinomRek(n - 1, k) + BinomRek(n - 1, k - 1);

	}

}
