package aufgabe2;

public class Iterativ {

	public static void main(String[] args) {
		System.out.println(modulo(5, 3));
		System.out.println(mult(3, 3));
		rev("dame");
		System.out.println(isPalindrom("otto"));
	}

	public static int modulo(int x, int y) {
		while (x>y){
			x-=y;
		}
		return x;
	}

	public static int mult(int i, int j) {
		int ret=0;
		for (int p = 0;p<j;p++){
			ret +=i;
		}
		return ret;
	}

	public static void rev(String txt) {
		for (int i = txt.length(); i>0;i--){
			System.out.print(txt.charAt(i-1));
		}
	}

	public static boolean isPalindrom(String txt) {
		while (txt.length()>1){
			if (txt.charAt(0)!=txt.charAt(txt.length()-1))
				return false;
			txt = txt.substring(1, txt.length()-1);
		}
		return true;
	}

}
