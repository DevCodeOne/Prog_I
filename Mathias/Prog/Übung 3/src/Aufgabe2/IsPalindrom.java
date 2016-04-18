package Aufgabe2;

import java.util.Scanner;

public class IsPalindrom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("ein Wort");
		System.out.println(palin(sc.next()));
		sc.close();
	}

	public static boolean palin(String t) {
		if (t.length() == 0)
			return true;
		if (t.length() == 1 || t.charAt(0) != t.charAt(t.length() - 1)) {
			return false;
		} else {
			return palin(t.substring(1, t.length() - 1));
		}

	}

	public static boolean ispalin(String t) {
		char[] pal = t.toLowerCase().toCharArray();
		for (int i = 0; i < (pal.length / 2); i++) {
			if (pal[i] != pal[pal.length-1 - i])
				return false;
		}
		return false;

	}
}
