
public class Aufgabe2 {

	public static void main(String [] args) {
		int number = 66; 
		
		for (int i = 1; i <= number; i++) {
			if (number % i == 0) {
				System.out.println(i + " teilt " + number + " ganzzahlig");
			}
		}
	}
}
