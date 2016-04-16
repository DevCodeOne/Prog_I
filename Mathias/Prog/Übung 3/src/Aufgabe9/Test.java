package Aufgabe9;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println(count("asdfghjklöa", ""));
	}

	public static int count(String txt, String letters) {
		int n = -1;

		for (int i = 0; i < letters.length(); i++) {

			int x = -1;

			do {
				x++;
				x = txt.indexOf(letters.charAt(i), x);
				n++;
			} while (x > 0);
		}
		return n;
	}
}
