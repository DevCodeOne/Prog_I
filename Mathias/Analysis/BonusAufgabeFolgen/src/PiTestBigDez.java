import java.math.BigDecimal;

public class PiTestBigDez {
	static BigDecimal eins = new BigDecimal(1);
	static BigDecimal zwei = new BigDecimal(1);

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
		zwei.toString();
		

	}

	public static BigDecimal sqrt(BigDecimal a) {
		a.add(eins);
		a.divide(zwei);
		for (int i =0;i<100;i++){
		a.add	
			
		}		
		return a;
			
	}
}
