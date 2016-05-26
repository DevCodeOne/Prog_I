import java.util.Scanner;

public class Konvergenz {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		double xnplus = 0.01;
		System.out.println("Variable für a: ");
		double a = sc.nextDouble();
		double xn;
		do {
			xn = xnplus;
			xnplus = a * xn * (1.0 - xn);
			
		} while (xnplus-xn  > Double.MIN_VALUE);
		System.out.println(xnplus);
		xnplus = 0.1;
		do {
			xn = xnplus;
			xnplus = a * xn * (1.0 - xn);
			
		} while (xnplus-xn  > Double.MIN_VALUE);
		System.out.println(xnplus);
		xnplus = 0.2;
		do {
			xn = xnplus;
			xnplus = a * xn * (1.0 - xn);
			
		} while (xnplus-xn  > Double.MIN_VALUE);
		System.out.println(xnplus);
		sc.close();
	}

}
