import java.util.Scanner;

public class Aufgabe2 {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		int zahlen[] = new int[2];
		
		System.out.println("Geben sie die erste Zahl ein : ");
		
		zahlen[0] = input.nextInt();
		
		System.out.println("Geben sie die zweite Zahl ein : ");
		
		zahlen[1] = input.nextInt();
		
		System.out.printf("%d + %d = %d \n", zahlen[0], zahlen[1], zahlen[0] + zahlen[1]);
		System.out.printf("%d - %d = %d \n", zahlen[0], zahlen[1], zahlen[0] - zahlen[1]);
		System.out.printf("%d * %d = %d \n", zahlen[0], zahlen[1], zahlen[0] * zahlen[1]);
		if (zahlen[1] != 0)
			System.out.printf("%d / %d = %d \n", zahlen[0], zahlen[1], zahlen[0] / zahlen[1]);
		else 
			System.out.println("Nicht definiert !!");
		
		input.close();
	}

}
