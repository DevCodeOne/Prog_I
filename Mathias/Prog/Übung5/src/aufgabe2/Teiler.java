package aufgabe2;
import java.util.Scanner;

public class Teiler {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		long l = sc.nextLong();
		for (int i = 1; i<=l;i++){
			if (l%i==0) System.out.print(i +" ");
		}
		sc.close();
	}

}
