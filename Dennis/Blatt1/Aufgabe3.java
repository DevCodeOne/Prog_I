package Blatt1;

public class Aufgabe3 {

	public static void main(String[] args) 
	{
		int a = 1;
		int b = 6;
		
		if(a < b)
		{
			b =b - (a*a);
			
			if(b == 0)
			{
				System.out.println("b ist die Quadratzahl von a!");
			}
			else
			{
				System.out.println("b ist nicht die Quadratzahl von a!");
			}
		}
		else
		{
			a = a - (b*b);
			
			if(a == 0)
			{
				System.out.println("a ist die Quadratzahl von b!");
			}
			else
			{
				System.out.println("a ist nicht die Quadratzahl von b!");
			}
		}

	}

}
