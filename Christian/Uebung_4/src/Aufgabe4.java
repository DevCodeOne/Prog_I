import java.util.Scanner;

public class Aufgabe4 {

	public static void main(String [] args) {
		Scanner input = new Scanner(System.in); 
		
		System.out.println("Geben sie die geplante Ankunftszeit ein (im Format HH:MM:SS) : ");
		String numbers[] = input.nextLine().split(":");
		int hours = Integer.valueOf(numbers[0]);
		int minutes = Integer.valueOf(numbers[1]);
		int seconds = Integer.valueOf(numbers[2]);
		
		System.out.println("Geben sie die Verspätung ein in Minuten : ");
		int lateness = input.nextInt();
		
		int new_minutes = (minutes + lateness) % 60; 
		int new_hours = (hours + ((minutes + lateness) / 60)) % 24;
		
		System.out.printf("Neue Ankunftszeit : %d:%d:%d \n", new_hours, new_minutes, seconds);
		input.close();
	}
}
