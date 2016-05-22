
public class Aufgabe3 {

	public static void main(String [] args) {
		int a = 22, b = 2;
		System.out.printf("binom_rek(%d, %d) = %d (rek) %n", a, b, binom_rek(a, b));
		System.out.printf("binom_rek(%d, %d) = %d (it) %n", a, b, binom_it(a, b));
	}
	
	public static int binom_it(int n, int k) {
		int num = 1; 
		int divider = 1;
		
		for (int i = 0; i < k; i++) {
			num *= (n - i);
			divider *= (i + 1);
		}
		
		return num / divider;
		
	}
	
	public static int binom_rek(int n, int k) {
		if (n == k || k == 0) return 1; 
		
		if (n > k && k > 0)
			return binom_rek(n - 1, k) + binom_rek(n - 1, k - 1);
		return 0;
	}
}
