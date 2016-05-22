
public class Aufgabe1 {

	public static void main(String [] args) {
		int a = 13, b = 11;
		System.out.printf("%d mod %d = %d (rek) %n", a, b, mod_rek(a, b));
		System.out.printf("%d mod %d = %d (it) %n", a, b, mod_it(a, b));
		System.out.printf("%d * %d = %d (rek) %n", a, b, mult_rek(a, b));
		System.out.printf("%d * %d = %d (it) %n", a, b, mult_it(a, b));
		System.out.printf("%s reversed %s (rek) %n", "Hello World", reverse_rek("Hello World"));
		System.out.printf("%s reversed %s (it) %n", "Hello World", reverse_it("Hello World"));
		System.out.printf("palin(%s) = %s (rek) %n", "madam", palindrom_rek("madam"));
		System.out.printf("palin(%s) = %s (it) %n", "madam", palindrom_it("madam"));
	}
	
	public static int mod_rek(int a, int b) {
		if (a < b) return a; 
		
		return mod_rek(a - b, b);
	}
	
	public static int mod_it(int a, int b) {
		while (a >= b) a -= b;
		
		return a;
	}
	
	public static int mult_rek(int a, int b) {
		if (b > 1) return a + mult_rek(a, b - 1); 
		return a;
	}
	
	public static int mult_it(int a, int b) {
		int erg = a;
		while(b-- > 1) erg += a;
		return erg;
	}
	
	public static String reverse_rek(String str) {
		int last_char = str.length() - 1;
		
		return "" + str.charAt(last_char) + (last_char != 0 ? reverse_rek(str.substring(0, last_char)) : "");
	}
	
	public static String reverse_it(String str) {
		char [] c = new char[str.length()]; 
		
		for (int i = str.length() - 1; i >= 0; i--) {
			c[(str.length() - 1) - i] = str.charAt(i);
		}
		
		return new String(c);
	}
	
	public static boolean palindrom_rek(String str) {
		return Character.toLowerCase(str.charAt(0)) == Character.toLowerCase(str.charAt(str.length() - 1)) && 
				((str.length() - 2) > 1 ? palindrom_rek(str.substring(1, str.length() - 1)) : true);
	}
	
	public static boolean palindrom_it(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (!(Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(str.length() - 1 - i))))
				return false;
		}
		return true;
	}
}
