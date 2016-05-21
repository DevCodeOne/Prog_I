package aufgabe5;

import java.util.ArrayList;

public class PalimLong {

	public static void main(String[] args) {
		String str = "defababaabkababa";
		ArrayList<String> erg = new ArrayList<String>();
		for (int i = 2; i <= str.length(); i++) {
			for (int j = 0; j <= str.length() - i; j++) {
				if (isPalindrom(str.substring(j, j + i)))
					erg.add(str.substring(j, j + i));
			}
		}
		System.out.println(erg.toString());
	}

	public static boolean isPalindrom(String txt) {
		while (txt.length() > 1) {
			if (txt.charAt(0) != txt.charAt(txt.length() - 1))
				return false;
			txt = txt.substring(1, txt.length() - 1);
		}
		return true;
	}
}
