public class Test {

	public static void main(String[] args) {

		// 1+2
		{
			System.out.println(3 + 5 / 7 - 4);
			System.out.println(2 - 3 * (5 % 2 + 6 / 4));
			System.out.println(2 - 3 * (5 % 2 + 6 / 4.0));
		}

		// 3
		{
			int[] i = new int[50];
			for (int j = 0; j < 1000; j++) {
				i[(int) (Math.random() * 49) + 1]++;
			}
			for (int j = 0; j < i.length; j++) {
				System.out.println(i[j]);
			}
		}

		// 4
		{
			double d1 = 5.0, d2 = 6.0;
			System.out.println(Math.abs(d1 - d2) < 10E-6 ? true : false);
		}

		// 5
		{
			String line = "test";
			int i1 = 0;
			int counter = 0;
			while (line.length() > i1) {
				if (line.charAt(i1) == '?')
					counter++;
				i1++;
			}
			i1 = 0;
			counter = 0;
			do {
				if (line.charAt(i1) == '?')
					counter++;
				i1++;
			} while (line.length() > i1);
		}

		// 6 = 6 Mal
		{
			int i11 = 6;
			do {
				System.out.println(i11);
			} while (--i11 != 0);
		}

		// 7
		{
			for (int i111 = 5; i111 >= 0; i111--) {
				if (i111 == 5)
					break;
				System.out.println(--i111);
			}
		}

		// 8
		{
			int[] a = { 1, 4, 6, -2, 3, 9 };
			for (int e : a) {
				if (e % 2 == 0)
					System.out.print(e + " ");
			}
		}

		// 9 geht nicht;

		// 10 mit for each kann man keine Werte zuweisen
		{
			int[] local = new int[10];
			for (int c = 0; c < local.length; c++)
				local[c] = c;

			for (int s : local)
				s = 0;
		}

		// 11 Nicht Initialisiert
		{
			int[] a;
			//System.out.println(a.length);
		}

		// 12 b[0] und b[1] beide mit 0.0
		{
			float[] b = new float[2];
		}

		// 13
		{
			// double number1[10];
			// float number2 = { 1.0f, 2.0f, 3.0f };
			// double[] number3 = [ 1, 2, 3, 4 ];
			int[] number4 = { 1, 2, 3, 4 };
			// int[] number5 = new int[4]{1, 2, 3, 4};
		}
		int[] ab = { 1, 2, 3, 4, 5, 6, 1, 2, 3, 4 };
		int[] cd = {1,2,9};
		System.out.println(enthalten(ab, cd));
	}

	// 14
	public static double positivSum(double[] a) {
		double sum = 0;
		for (double ele : a)
			if (ele >= 0)
				sum += ele;
		return sum;
	}

	// 15
	public static int[] berechneQuadratTabelle(int n) {
		int[] quad = new int[n];
		for (int i = 0; i < quad.length; i++) {
			quad[i] = i * i;
		}
		return quad;
	}

	// 16
	// u berpr ufe , ob b Teilmenge von a ist
	// d.h. alle Elemente von b sind in a enthalten .
	public static boolean enthalten(int[] a, int[] b) {

		int n = 0;
		for (int eins : a) {
			for (int i = 0; i < b.length;i++) {
				if (eins == b[i])
					n++;
				break;
			}
		}
		if (n >= b.length)
			return true;
		return false;
	}

}
