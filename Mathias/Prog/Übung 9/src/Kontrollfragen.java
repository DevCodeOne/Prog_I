import java.util.Iterator;

public class Kontrollfragen{

	@SuppressWarnings("unused")
	public static void main(String[] args) {

		// Aufgabe 1
		{
			I1 a = new A();
			// A b = new I1(); cannot convert from I1 to a
			// A c = new A(); I1 = c; I1 ist keine Variable
			// A d = new A(); I1 b1 = d;I2 c1 = b1; cannot convert from I1 to I2
			//I1 e = new I1(); cannot instantiate the type I1
		}
		
		// Aufgabe 2
		// weil ein Interface nicht instantiert werden kann!
		
		// Aufgabe 3
		// c ist richtig 
		{
		//Test.print(); geht nicht da nicht static
		}
		
		// Aufgabe 4
		// nicht direkt so?!
		
		// Aufgabe 5
		// stellt sicher das man will das dieses Objekt auch geklont werden kann
		
		// Aufgabe 6
		// kennzeichnet eine Klasse als Bestandteil einer Collection bei der über mehrere
		// Elemente Iteriert werden kann
		
		// Aufgabe 7
		// die implementierung der ganzen Interfaces und die Möglichkeit eine Liste die erweiterbar ist zu implementieren
		// was nicht zuletzt auf das IFace Collection zurückzuführen ist.
		
		
	}

}
