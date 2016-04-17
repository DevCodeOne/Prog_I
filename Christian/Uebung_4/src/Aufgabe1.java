import java.util.Scanner;

public class Aufgabe1 {
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); 
		String in = input.nextLine();
		
		System.out.printf("Die Länge der Eingabe ist %d \n", in.length());
		
		input.close();
	}
}
