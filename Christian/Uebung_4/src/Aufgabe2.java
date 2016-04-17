import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); 
		String in = input.nextLine().toLowerCase();
		boolean palin = true;
		
		for (int i = 0; i < in.length() / 2; i++) {
			if (in.charAt(i) != in.charAt(in.length()-1 -i)) {
				palin = false; 
				break;
			}
		}
		
		System.out.printf("%s ist %s Palindrom \n", in, palin ? "ein" : "kein");
		input.close();
	}
}
