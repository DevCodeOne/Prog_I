import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double koef[];
		double x = 0;
		
		System.out.print("Geben sie die Anzahl der Koeffizienten an : ");
		
		koef = new double[input.nextInt()];
		
		for (int i = 0; i < koef.length; i++) {
			System.out.printf("Geben sie einen Koeffizienten an [%d/%d] : ", i+1, koef.length);
			koef[i] = input.nextDouble();
		}
		
		System.out.print("Geben sie Werte für X ein, um zu beenden 0 eingeben ");
		
		while((x = input.nextDouble()) != 0) {
			double value = 0;
			
			for (int i = 0; i < koef.length; i++) {
				value += koef[i] * Math.pow(x, (koef.length - 1) - i);
			}
			
			System.out.println(value);
			System.out.print("Geben sie Werte für X ein, um zu beenden 0 eingeben ");
		}
		input.close();
	}
}