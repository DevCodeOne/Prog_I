import java.math.BigInteger;

public class Aufgabe1_1 {

	public static void main(String [] args) {
		String numberOneStr = "1234567890987654321"; 
		String numberTwoStr = "34567890123456789";
		BigInteger numberOne = new BigInteger(numberOneStr);
		BigInteger numberTwo = new BigInteger(numberTwoStr);
		
		BigInteger erg = numberOne.multiply(numberTwo);
		
		System.out.printf("%s * %s = %s %n", numberOneStr, numberTwoStr, erg.toString());
	}
}
