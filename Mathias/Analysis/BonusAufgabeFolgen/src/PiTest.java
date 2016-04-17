
public class PiTest {

	public static void main(String[] args) {
		double bk,ak;
		double akminus = 3;
		double bkminus = 2*Math.sqrt(3);
		double EPSILON = 1E-20;
		
		do{
			bk = 2/(Math.pow(bkminus, -1)+Math.pow(akminus, -1));
			ak = Math.sqrt(akminus*bk);
			
			System.out.println(ak + " " + bk);
			bkminus = bk;
			akminus = ak;		
			
		}while ((bk-ak)>EPSILON);

		
	}

}