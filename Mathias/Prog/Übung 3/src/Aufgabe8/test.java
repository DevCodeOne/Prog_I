package Aufgabe8;

public class test {

	public static void main(String[] args) {
		System.out.println(count("hal,"));
		

	}
	public static int count(String txt){
		int n = -2;
		int x=-1;
		int y =-1;
		do{
			x++;
			x = txt.indexOf(';', x);
			n++;
		} while (x>0);
		do{
			y++;
			y = txt.indexOf(',', y);
			n++;
		} while (y>0);
		return n;		
	}

}
