import static java.lang.System.out;

public class Kontrollfragen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 1 = 63
		{
			int a = 5;
			System.out.println(kubik(--a - 1));
		}

		// 2 s.u.
		// for (int i = 0; i<a.length;i++){
		// a[i] = (i+1);}

		// 3 s.u.
		// int[] ret = new int[n];
		// for (int i = 0; i < n; i++) {
		// ret[i] = (i + 1);
		// }
		// return ret;

		// 4 s.u.
		// for (int i = 0; i<a.length;i++){
		// System.out.println(a[i]);
		// }

		// 5 dafür das kein Wert zurück geliefert wird.

		// 6
		System.out.println(absInt(-123.5));

		// 7
		//
		// f(int, float);
		// f(1, 2.0); mit 2.0f gehts
		// f(0.0, 2);
		// char c = f(1, 0.0F); muss man casten
		double d = f(1, 0.0F);
		// f(1,2,3);
		int a = 2;
		int b = f(a, a);

		// 8
		// return bricht die Methode ab und liefern sofern
		// noch eine Variable angeführt wird diese zurück
		// wenn die Methode das vorsieht.

		// 9
		// der Selbe Methoden Name mit unterschiedlichen
		// Parametern bzw Rückgabetypen

		// 10
		// :-)8-) newline

		// 11 ausg: 2 6 12
		System.out.println("Aufg 11");
		f();
		f();
		f();

		// 12
		zwölf('a', 'a' * 1.0F);
		System.out.println();

		// 13
		// keine Ahnung?!

		// 14
		// auch keine Ahnung

		// 15
		// immer noch keine Ahnung

		// 16
		// weil a<b keinen Rückgabewert liefert!
		// result nicht initialisiert

		// 17
		// Iterativ über hilfsmethode ist indirekt

		// 18
		System.out.println(achtzehn(1, -10));
		
		// 19
		// Die Methoden würden sich immer wieder 
		// gegenseitig aufrufen
	}

	// Methode zu 1
	static int kubik(int a) {
		return a * a * a;
	}

	// Methode zu 2
	public static void fill(int[] a) {
		for (int i = 0; i < a.length; i++) {
			a[i] = (i + 1);
		}
	}

	// Methode zu 3
	public static int[] create(int n) {
		int[] ret = new int[n];
		for (int i = 0; i < n; i++) {
			ret[i] = (i + 1);
		}
		return ret;
	}

	// Methode zu 4
	public static void print(int[] a) {
		for (int i = 0; i < a.length; i++) {
			System.out.println(a[i]);
		}
	}

	// Methode zu 6
	public static long absInt(double e) {
		long ret = (long) e;
		ret *= (-1);
		return ret;
	}

	// Methode zu 7
	public static int f(int a, float b) {
		return 1;
	}

	// zu 11
	static int d1 = 3;
	static int d2 = 2;

	static void f() {
		int i = d1 * d2;
		d1 = d2;
		d2 = i;
		out.println(d1);
	}

	// Methoden zu 12
	static void zwölf(int i, double f) {
		out.print("int double");
	}

	static void zwölf(int i, int c) {
		out.print("int int");
	}

	static void zwölf(int i, char c) {
		out.print("int char");
	}

	static void zwölf(int i, float f) {
		out.print("int float" + f);
	}

	// Methode zu 18
	public static int achtzehn(int x, int y) {
		if (x == y) {
			return x * y;
		} else if (x > y) {
			return achtzehn(x - 1, y);
		} else {
			return achtzehn(x + 1, y);
		}
	}

}
