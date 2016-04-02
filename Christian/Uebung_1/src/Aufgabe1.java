
public class Aufgabe1 {
	
	public static void main(String [] args) {
		
		String viereck[] = new String[]{
				"**********",
				"*        *",
				"*        *", 
				"**********"
		};
		
		String dreieck[] = new String[] {
				"*******",
			    " ***** ",
			    "  ***  ", 
			    "   *   "
		};
		
		System.out.println(viereck[0]);
		System.out.println(viereck[1]);
		System.out.println(viereck[2]);
		System.out.println(viereck[3]);
		
		System.out.println(dreieck[0]);
		System.out.println(dreieck[1]);
		System.out.println(dreieck[2]);
		System.out.println(dreieck[3]);
		
		System.out.println(dreieck[3]);
		System.out.println(dreieck[2]);
		System.out.println(dreieck[1]);
		System.out.println(dreieck[0]);
	}
}
