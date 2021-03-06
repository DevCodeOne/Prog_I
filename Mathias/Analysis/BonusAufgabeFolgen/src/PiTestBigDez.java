import java.math.BigDecimal;
import java.math.RoundingMode;

public class PiTestBigDez {
	static BigDecimal eins = new BigDecimal(1);
	static BigDecimal zwei = new BigDecimal(2);

	public static void main(String[] args) {
		BigDecimal ak = new BigDecimal(0);
		BigDecimal bk = new BigDecimal(0);
		BigDecimal akminus = new BigDecimal(3);
		BigDecimal bkminus = (sqrt(akminus).multiply(zwei));

		double EPSILON = 1E-20;

		for (int i = 0; i < 100; i++) {
			bkminus = eins.divide(bkminus, 130, RoundingMode.HALF_UP);
			ak = eins.divide(akminus, 130, RoundingMode.HALF_UP);
			bkminus.add(ak);

			bkminus = zwei.divide(bkminus, 130, RoundingMode.HALF_UP);
			// ak = akminus.multiply(bk);

			akminus = sqrt(akminus.multiply(bk));

		}

		System.out.println(akminus.toString());
		System.out.println(bkminus.toString());

	}

	public static BigDecimal sqrt(BigDecimal a) {
		BigDecimal xn = a;
		BigDecimal xnp1 = new BigDecimal(0);
		xn.add(eins);
		xn.divide(zwei, 130, RoundingMode.HALF_UP);
		for (int i = 0; i < 99; i++) {
			System.out.println(i + " " + xn.toString());
			xnp1 = a.divide(xn, 130, RoundingMode.HALF_UP);
			xnp1 = xn.add(xnp1);
			xn = xnp1.divide(zwei, 130, RoundingMode.HALF_UP);
		}
		return xn;

	}
}
