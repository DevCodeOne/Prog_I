
public class PiTest {

	public static void main(String[] args) {
		double bk,ak;
		double akminus = 3;
		double bkminus = 2.0*Math.sqrt(3.0);
		double EPSILON = Double.MIN_VALUE;
		
		do{
			bk = 2/(Math.pow(bkminus, -1)+Math.pow(akminus, -1));
			ak = Math.sqrt(akminus*bk);
			
			
			bkminus = bk;
			akminus = ak;		
			
		}while ((bk-ak)>EPSILON);

		System.out.println("Pi liegt zwischen \n" + ak + " und \n" + bk);
	}

}
