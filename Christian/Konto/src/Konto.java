public class Konto {

	static double Zinssatz = 0.01;
	
	double mStand; 
	String mBesitzer; 
	
	Konto(String besitzer, double betrag) {
		this.mStand = betrag; 
		this.mBesitzer = besitzer; 
	}
	
	Konto(Person besitzer, double betrag) {
		this(besitzer.getmVorname(), betrag);
	}
	
	String getBesitzer() {
		return mBesitzer;
	}
	
	void einzahlen(double betrag) {
		mStand += betrag;
	}
	
	double abheben(double betrag) {
		mStand -= betrag;
		return betrag;
	}
	
	double getKontoStand() {
		return mStand;
	}
	
	void addiereZinsen() {
		mStand += mStand + Konto.Zinssatz * mStand;
	}
}