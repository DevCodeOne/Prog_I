import java.math.BigDecimal;
import java.math.RoundingMode;

public class PiTestBigDez {
	static BigDecimal eins = new BigDecimal(1);
	static BigDecimal zwei = new BigDecimal(2);

	public static void main(String[] args) {
		/*BigDecimal ak = new BigDecimal(0);
		BigDecimal bk = new BigDecimal(0);
		BigDecimal akminus = new BigDecimal(3);
		BigDecimal bkminus = new BigDecimal(2.0 * Math.sqrt(akminus.doubleValue()));

		double EPSILON = 1E-20;

		do {
			bk = bkminus.divide(eins);
			ak = akminus.divide(eins);
			bk.add(ak);
			bk.divide(zwei);
			ak = akminus.multiply(bk);

			akminus = Math.sqrt(akminus * bk);

			bkminus = bk.pow(1);

		} while (ak.scale() < Integer.parseInt(args[0]));*/
		sqrt(zwei);
		System.out.println(zwei.toString());
		

	}

	public static BigDecimal sqrt(BigDecimal a) {
		System.out.println(a.toString());
		BigDecimal xn = a;
		System.out.println(xn.toString());
		BigDecimal xnp1 = new BigDecimal(0);
		System.out.println(xnp1.toString());
		xn.add(eins);
		System.out.println(xn.toString());
		xn.divide(zwei, 10, RoundingMode.HALF_UP);
		System.out.println(xn.toString());
		for (int i =0;i<100;i++){
		xnp1 = a.divide(xn, 10, RoundingMode.HALF_UP);
		System.out.println(xnp1.toString());
		xnp1 = xn.add(xnp1);
		System.out.println(xnp1.toString());
		xn = xnp1.divide(zwei, 10, RoundingMode.HALF_UP);
		System.out.println(xn.toString());
		}	
		System.out.println(xn.toString());
		
		return xn;
			
	}
}