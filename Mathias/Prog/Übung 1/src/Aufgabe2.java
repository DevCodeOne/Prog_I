import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("bitte zwei Ganzzahlen:");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		System.out.println("Summe : " + (a+b));
		System.out.println("Differenz : " + (a-b));
		System.out.println("Produkt : " + (a*b));
		System.out.println("Quotient : " + (a/b));
		System.out.println("DivRest : " + (a%b));
	}

}
