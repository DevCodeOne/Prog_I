package Blatt1;

public class Aufgabe2 
{
	public static void main(String[] args)
	{
		int a = 5;
		int b = 3;
		
		if(b == 0)
		{
			double quo = 0.0;
			int sum = a + b;
			int dif = a - b;
			int pro = a * b;
			int rest = a % b;
		
			System.out.println("Summe :" + sum);
			System.out.println("Differenz :" + dif);
			System.out.println("Produkt :" + pro);
			System.out.println("Quotient :" + quo);
			System.out.println("Rest :" + rest);
		}
		else
		{	
			int sum = a + b;
			int dif = a - b;
			int pro = a * b;
			double quo = (double) a / (double)b;
			int rest = a % b;
		
			System.out.println("Summe :" + sum);
			System.out.println("Differenz :" + dif);
			System.out.println("Produkt :" + pro);
			System.out.println("Quotient :" + quo);
			System.out.println("Rest :" + rest);
		}
	}
}
