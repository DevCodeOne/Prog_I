
public class Bisektion {

	public static void main(String[] args) {
		double a,b,x;
		double Epsilon1 = 5.0E-6;
		double Epsilon2 = 5.0E-6;
		a = -10.0;		
		b = 10.0;		
		do {
			x=zwischen(a,b);
			a = f(x) <=0?x:a;
			b = f(x) <=0?b:x;
		} while(Math.abs(f(x))>Epsilon1&&(Math.abs((b-a)/2.0))>Epsilon2);
		System.out.println(x);

	}
	
	public static double f(double x){
		
		return Math.pow(x,3.0)-8.0;
		//return Math.pow(Math.E, x)-5*x+1;
	}
	
	public static double zwischen(double a,double b){
		return ((a+b)/2);
	}

}
