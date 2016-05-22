package aufgabe1;

public class Rekursion {

	public static void main(String[] args) {
		System.out.println(modulo(5, 3));
		System.out.println(mult(3, 3));
		rev("dame");
		System.out.println(isPalindrom("otte"));
	}

	public static int modulo(int x, int y) {
		if (x > y) {
			return modulo((x - y), y);
		}
		return x;
	}

	public static int mult(int i, int j) {
		if (i == 0 || j == 0) {
			return 0;
		} else {
			return i + mult(i, j - 1);
		}
	}

	public static void rev(String txt) {
		System.out.print(txt.charAt(txt.length() - 1));
		if (txt.length() > 1)
			rev(txt.substring(0, (txt.length() - 1)));
	}

	public static boolean isPalindrom(String txt) {
		if (txt.length() > 1)
			if (txt.charAt(0) == txt.charAt(txt.length() - 1) && isPalindrom(txt.substring(1, txt.length() - 1)))
				return true;
			else
				return false;

		return true;
	}

}
