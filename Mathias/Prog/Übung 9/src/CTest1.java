public class CTest1 implements ITest {
	private int mUnter;
	private int mOber;

	public CTest1(int untereGrenze, int obereGrenze) { // TODO Grenzen merken
		mUnter = untereGrenze;
		mOber = obereGrenze;
	}

	public boolean check(int wert) { // TODO liefert true , wenn wert
										// in dem Bereich [ mUnter , mOber ]
										// liegt .
		return wert >= mUnter ? (wert <= mOber ? true : false ): false;
	}
}