package aufgabe2;

public class Person {
	private String Name, Vorname, Strasse, Stadt;
	private int PLZ;

	public Person(String name, String vorname, String strasse, String stadt, int pLZ) {

		Name = name;
		Vorname = vorname;
		Strasse = strasse;
		Stadt = stadt;
		PLZ = pLZ;
	}

	@Override
	public String toString() {
		return "Name: " + Name + ", " + Vorname + ", Strasse: " + Strasse + ", Stadt: " + PLZ + Stadt;
	}

	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	public String getVorname() {
		return Vorname;
	}

	public void setVorname(String vorname) {
		Vorname = vorname;
	}

	public String getStrasse() {
		return Strasse;
	}

	public void setStrasse(String strasse) {
		Strasse = strasse;
	}

	public String getStadt() {
		return Stadt;
	}

	public void setStadt(String stadt) {
		Stadt = stadt;
	}

	public int getPLZ() {
		return PLZ;
	}

	public void setPLZ(int pLZ) {
		PLZ = pLZ;
	}
	
	

}
