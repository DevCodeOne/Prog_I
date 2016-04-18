package Vorlesung160418;

import java.util.Random;

public class Test {
	private static final char[] ALPHA = "abcdef".toCharArray();

	public static void main(String[] args) {
		String rdStr = getRandomStr(50);
		System.out.println(rdStr);

		String suchStr = "abc";
		int count = 0;

		System.out.println("Anzahl" + countWithIndexOf(rdStr, suchStr));
	}
//Besser Rabin-Karb-Algo für Hashmaps! Komplexität O(n)
//	public static int countWithIndexOf(String str, String suchstr) {
//		char[] array = str.toCharArray();
//		char[] suche = suchstr.toCharArray();
//		int count = 0;
//		for ( int i=0; i<array.length; i++){
//			if (array[i] == suche[0]){
//				boolean fount = true;
//				for (int j=0; j<suche.length;j++){
//					
//					
//				}
//			}
//		}
//	}

	public static String getRandomStr(int len) {

		StringBuilder strBuilder = new StringBuilder();
		Random rd = new Random();
		for (int i = 0; i < len; i++) {
			int pos = rd.nextInt(ALPHA.length);
			strBuilder.append(ALPHA[pos]);
		}
		return strBuilder.toString();
	}

}
