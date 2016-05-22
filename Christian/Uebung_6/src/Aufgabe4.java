import java.util.HashSet;
import java.util.Arrays;

public class Aufgabe4 {

	public static void main(String [] args) {
		String str = "defababaabk"; 
		System.out.printf("MaxLen Palin : %d %n", findLargestPalindromLength(str)); 
		System.out.println(Arrays.toString(findPalindroms(str)));
	}
	
	public static int findLargestPalindromLength(String str) {
		int maxLen = 0;
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i); 
			int index = i + 1; 
			
			while (index < str.length()) {
				int found = str.indexOf(c, index); 
				if (found == -1) break;
				
				String substr = str.substring(i, found + 1);
				
				if (palindrom_it(substr)) {
					maxLen = Math.max(substr.length(), maxLen);
				}
				
				index = found + 1;
			}
		}
		
		return maxLen;
	}
	
	public static String [] findPalindroms(String str) {
		HashSet<String> strings = new HashSet<String>();
		
		for (int i = 0; i < str.length(); i++) {
			char c = str.charAt(i); 
			int index = i + 1; 
			
			while (index < str.length()) {
				int found = str.indexOf(c, index); 
				if (found == -1) break;
				
				String substr = str.substring(i, found + 1);
				
				if (palindrom_it(substr)) strings.add(substr);
				
				index = found + 1;
			}
		}
		
		return strings.toArray(new String[strings.size()]);
	}
	
	public static boolean palindrom_it(String str) {
		for (int i = 0; i < str.length() / 2; i++) {
			if (!(Character.toLowerCase(str.charAt(i)) == Character.toLowerCase(str.charAt(str.length() - 1 - i))))
				return false;
		}
		return true;
	}
}
