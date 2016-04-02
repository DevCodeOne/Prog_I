import java.util.Scanner;

public class Aufgabe4 {
	
	public static final int CEL_IN_FAR = 0; 
	public static final int FAR_IN_CEL = 1;
	
	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double temp = 0;
		int option = 0;
		
		System.out.println("Celcius in Fahrenheit [0] ");
		System.out.println("Fahrenheit in Celcius [1] ");
		System.out.println("Wählen sie eine Umrechnung (Geben sie die Zahl ein) : ");
		
		option = input.nextInt(); 
		
		System.out.println("Geben sie eine Temperatur an : ");
		
		temp = input.nextDouble();
		
		if (option == CEL_IN_FAR) {
			System.out.printf("Temperatur in Fahrenheit : %f \n", ((9/(double)5) * temp) + 32);
		} else if (option == FAR_IN_CEL) {
			System.out.printf("Temperatur in Celcius : %f \n", (5/(double)9) * (temp - 32));
		} else {
			System.out.println("Ungültige Operation");
		}
		
		input.close();
	}
}
