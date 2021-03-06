package Uebung122;

public class Vorgabe2 
{
	public static void main(String[] args) 
	{
		// Erzeugung von c1 mit dem 2. Konstruktor
		ComplexNumber c1 = new ComplexNumber(3.0, 5.0);
		
		// Erzeugung von c2 mit dem Standard-Konstruktor
		// anschlie�end Werte mit den set-Methoden setzen
		ComplexNumber c2 = new ComplexNumber();
		c2.setReal(8.0);
		c2.setImg(4.0);
		
		// tmp ist eine Kopie von c1
		ComplexNumber tmp = new ComplexNumber(c1);
		// alternativ: 
		//ComplexNumber tmp = c1.copy(); 
		System.out.println(c1.toString());
		System.out.println(c2.toString());
		// tmp + c2
		tmp.add(c2);
		System.out.println("c1 + c2 = " + tmp.getReal() + " + i*" + tmp.getImg());
		
		// tmp zur�cksetzen
		tmp = c1.copy();
		
		// tmp - c2;
		tmp.sub(c2);
		System.out.println("c1 - c2 = " + tmp.getReal() + " + i*" + tmp.getImg());
		
		// tmp zur�cksetzen
		tmp = c1.copy();
		
		// tmp * c2;
		tmp.mul(c2);
		System.out.println("c1 * c2 = " + tmp.getReal() + " + i*" + tmp.getImg());
				
		// tmp zur�cksetzen
		tmp = c1.copy();
		
		// tmp / c2;
		tmp.div(c2);
		System.out.println("c1 / c2 = " + tmp.getReal() + " + i*" + tmp.getImg());
		
		// tmp zur�cksetzen
		tmp = c1.copy();
				
		// C1 negiert
		tmp.neg();
		System.out.println("c1 neg = " + tmp.getReal() + " + i*" + tmp.getImg());

		// tmp zur�cksetzen
		tmp = c1.copy();
						
		// C1 quad
		
		System.out.println("c1 quad = " + tmp.absSquare());
				
		// tmp zur�cksetzen
		tmp = c1.copy();
						
		// C1 Wurzel
		
		System.out.println("c1 Wurzel = " + tmp.abs());
				
		// tmp zur�cksetzen
		tmp = c1.copy();
						
		// C1 konj
		tmp= tmp.con();
		System.out.println("c1 con = " + tmp.getReal() + " + i*" + tmp.getImg());
	}
}
