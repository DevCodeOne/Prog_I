package aufgabe1;

import java.math.BigInteger;

public class BigInt {

	public static void main(String[] args) {
		BigInteger i1 = new BigInteger("1234567890987654321");
		BigInteger i2 = new BigInteger("34567890123456789");
		i1.multiply(i2);
		System.out.println(i1.toString());
	}

}
