import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String[] args) {
		double GradInCelsius, GradInFahrenheit;
		Scanner sc = new Scanner(System.in);
		System.out.println("Was würden sie gerne berechnen?");
		System.out.println("Celsius oder Fahrenheit");

		switch (sc.next().toLowerCase()) {
		case "celsius":
			System.out.println("Fahrenheit eingeben: ");
			GradInFahrenheit = sc.nextDouble();
			GradInCelsius = ((GradInFahrenheit - 32) * (5 / (double) 9));
			System.out.println("Celsius: " + GradInCelsius);
			break;
		case "fahrenheit":
			System.out.println("Celsius eingeben: ");
			GradInCelsius = sc.nextDouble();
			GradInFahrenheit = (GradInCelsius / (5 / (double) 9)) + 32;
			System.out.println("Celsius: " + GradInFahrenheit);
			break;
		default:
			System.out.println("nicht möglich");
		}
		sc.close();

	}

}
