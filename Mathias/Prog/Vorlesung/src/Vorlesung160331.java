
import static java.lang.System.out;

public class Vorlesung160331 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person otto = new Person("Otto", "Müller");

		Konto k1 = new Konto(otto, 100.0);

		out.println(k1.getBesitzer()); // durch den Statischen import kein
										// System mehr
		k1.einzahlen(100);

		System.out.println(k1.getKontostand());

		k1.abheben(400);
		System.out.println(k1.getKontostand());
	}

}
