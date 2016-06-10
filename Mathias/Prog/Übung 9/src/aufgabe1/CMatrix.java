package aufgabe1;

public class CMatrix implements Cloneable {
	private double[][] mMatrix;

	public Object clone() {
		double[][] cloneMatrix = null;
		for (int i = 0; i <= mMatrix.length; i++) {
			for (int j = 0; j <= mMatrix[i].length; j++) {
				cloneMatrix = new double[mMatrix.length][mMatrix[i].length];
				cloneMatrix[i][j] = mMatrix[i][j];
			}
		}
		return cloneMatrix;
	}

}
