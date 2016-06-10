

public class CTest2 implements ITest {
	private boolean mIsGerade;

	public CTest2(boolean isGerade) { // TODO Eigenschaft merken
		mIsGerade = isGerade;
	}

	public boolean check(int wert) {
		// TODO liefert true , wenn wert gerade und
		// mIsGerade true ist , sonst false .
		return wert%2==0?mIsGerade:false;
	}
}