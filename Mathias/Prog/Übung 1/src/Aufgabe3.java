import java.util.Scanner;

public class Aufgabe3 {

	public static void main(String[] args) {
		int a,b;
		Scanner sc = new Scanner(System.in);
		System.out.println("bitte zwei Ganzzahlen:");
		a = sc.nextInt();
		b = sc.nextInt();
		sc.close();
		if (quad(a,b)||quad(b,a)) System.out.println("ist Quadratzahl");
		else System.out.println("keine Quadratzahl");
	}
	
	static boolean quad (int a, int b){
		if ((a*a) == b) return true;
		return false;
	}

}
