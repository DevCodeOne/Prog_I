import java.util.Scanner;

public class Aufgabe5 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in);
		double numbers[] = new double[3];
		String message[] = {"erste", "zweite", "dritte"};
		
		for (int i = 0; i < 3; i++) {
			System.out.printf("Geben sie die %s Zahl ein : ", message[i]);
			numbers[i] = input.nextDouble();
		}
		
		double min = Math.min(numbers[0], Math.min(numbers[1], numbers[2]));
		double max = Math.max(numbers[0], Math.max(numbers[1], numbers[2]));
		
		double avg = (numbers[0] + numbers[1] + numbers[2]) / 3.0;
		
		System.out.printf("Min : %f Max : %f Avg : %f \n", min, max, avg);
		input.close();
	}
}
