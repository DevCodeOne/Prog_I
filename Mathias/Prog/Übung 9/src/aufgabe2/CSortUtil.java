package aufgabe2;

import java.util.Comparator;

public class CSortUtil {	
	public static <E> void sort (E[] a, Comparator <E> c)

	 {
		
		int pos;
		E tmp;
		for (int i = a.length; i > 0; i--) {
			pos = 0;
			while (pos < i  && c.compare( a[pos],(a[pos + 1])) < 0) {
				tmp = a[pos];
				a[pos] = a[pos + 1];
				a[pos + 1] = tmp;
			}
			
		}
	}

}
