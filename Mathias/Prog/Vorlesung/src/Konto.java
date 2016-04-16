
public class Konto {
	static double sZinsatz = 0.01;
	double mStand;
	Person mBesitzer;
	
	
	Konto(Person besitzer, double betrag){
		this.mStand = betrag;
		this.mBesitzer = besitzer;
	}
	
	String getBesitzer(){
		return mBesitzer.getmVorname();
	}
	
	double getKontostand(){
		return mStand;
	}
	
	void einzahlen(double betrag){
		mStand = mStand + betrag;
	}
	
	double abheben(double betrag){
		mStand = mStand - betrag;
		return betrag;
	}
	
	void addiereZinsen(){
		mStand = mStand + Konto.sZinsatz*mStand;
	}
}
