
public class Aufgabe6 {

		public static void main(String [] args) {
			String test = "Hallo hall halHallol hall HalloHallo";
			String search = "Hallo";
			System.out.println(findMatchHash(test, search));
		}
		
		public static int findMatchString(String str, String sub) {
			int count = 0; 
			int index = 0; 
			
			while(index + sub.length() <= str.length()) {
				int ret = str.indexOf(sub, index);
				
				if (ret == -1) break; 
				
				count++; 
				index = ret + 1;
			}
			
			return count;
		}
		
		public static int findMatchChar(String str, String sub) {
			char [] tosearch = str.toCharArray(); 
			char [] tofind = sub.toCharArray(); 
			int count = 0;
			
			for (int i = 0; i + tofind.length <= tosearch.length; i++) {
				if (tosearch[i] == tofind[0]) {
					boolean found = true;
					
					for (int j = 0; j < tofind.length; j++) {
						if (tosearch[i+j] != tofind[j]) {
							found = false;
							break;
						}
					}
					
					if (found) {
						count++;
					}
				}
			}
			return count;
		}
		
		public static int findMatchHash(String str, String sub) {
			char [] tosearch = str.toCharArray(); 
			char [] tofind = sub.toCharArray();
			int count = 0;
			
			int dst_hash_val = 0; 
			int hash_val = 0;
			
			for (int i = 0; i < tofind.length; i++) {
				dst_hash_val += tofind[i];
				hash_val += tosearch[i];
			}
			
			for (int i = 0; i + tofind.length <= tosearch.length; i++) {
				
				if (hash_val == dst_hash_val) { // checke String
					if (tosearch[i] == tofind[0]) {
						boolean found = true;
						
						for (int j = 0; j < tofind.length; j++) {
							if (tosearch[i+j] != tofind[j]) {
								found = false;
								break;
							}
						}
						
						if (found) {
							count++;
						}
					}
				}
				
				if (i + tofind.length < tosearch.length) {
					hash_val += tosearch[i + tofind.length] - tosearch[i];
					
				}
			}
			
			
			return count;
		}
}
