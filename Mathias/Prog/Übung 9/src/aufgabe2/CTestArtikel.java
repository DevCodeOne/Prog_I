package aufgabe2;

import java.util.Comparator;

public class CTestArtikel {
	private int mID; // interne Nr
	private String mDesc; // Beschreibung
	// Konstruktoren

	public CTestArtikel(int id, String desc) {
		mID = id;
		mDesc = desc;
	}

	public int getID() {
		return mID;
	}

	public String getDescription() {
		return mDesc;
	}

	 public boolean equals(Object other) {
	 return ((CTestArtikel)other).mID==this.mID?true:false;
	 }
	
	 public String toString() {
	 return "ArtID: " + mID + " Description: " + mDesc;
	 }

	// zum Vergleich zweier Objekte vom Typ CTestArtikel aufsteigend

	class Auf implements Comparator<CTestArtikel> {

		@Override
		public int compare(CTestArtikel o1, CTestArtikel o2) {
			if (!o1.equals(o2))
			return o1.getID()<o2.getID()?-1:1;
			return 0;
		}
		// TODO
	}

	// zum Vergleich zweier Objekte vom Typ CTestArtikel absteigend
	class Ab implements Comparator<CTestArtikel> {

		@Override
		public int compare(CTestArtikel o1, CTestArtikel o2) {
			if (!o1.equals(o2))
				return o1.getID()>o2.getID()?-1:1;
				return 0;
		}
		// TODO
	}
}