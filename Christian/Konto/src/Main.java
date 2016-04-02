
public class Main {
	
	public static void main(String [] args) {
		Konto k = new Konto("Christian", 100); 
		
		System.out.println(k.getBesitzer());
		
		k.einzahlen(100); 
		
		System.out.println(k.getKontoStand());
		
		k.abheben(100); 
		
		System.out.println(k.getKontoStand());
	}
}
