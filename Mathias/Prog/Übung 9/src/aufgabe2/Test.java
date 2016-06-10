package aufgabe2;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import aufgabe2.CTestArtikel.Auf;

public class Test {

	public static void main(String[] args) {
		CTestArtikel[] art = new CTestArtikel[5];
		CTestArtikel one = new CTestArtikel(1, "1");
		CTestArtikel two = new CTestArtikel(2, "2");
		CTestArtikel three = new CTestArtikel(3, "3");
		CTestArtikel four = new CTestArtikel(4, "4");
		CTestArtikel five = new CTestArtikel(5, "5");
		art[0] = one;
		art[1] = two;
		art[2] = three;
		art[3] = four;
		art[4] = five;
		
Comparator<CTestArtikel> auf = new CTestArtikel.Auf() ;
		
		CSortUtil.sort(art, auf);
		for (CTestArtikel a : art){
			System.out.println(a.toString());
		}
	}

}
