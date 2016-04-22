package Aufgabe6;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class SampleController {
	@FXML
	TextField tf1, tf2, tfString, tfChar, tfHash, tfStringT, tfCharT, tfHashT;

	@FXML
	public void bt1OnAction(ActionEvent e) {
		String t, l;
		int count;
		t = tf1.getText();
		l = tf2.getText();
		long z1, z2, z3;

		z1 = System.currentTimeMillis();
		count = StringVGL(t, l);
		z1 = System.currentTimeMillis() - z1;
		tfString.setText(count + " mal");

		z2 = System.currentTimeMillis();
		count = CharVGL(t, l);
		z2 = System.currentTimeMillis() - z2;
		tfChar.setText(count + " mal");

		z3 = System.currentTimeMillis();
		count = HashVGL(t, l);
		z3 = System.currentTimeMillis() - z3;
		tfHash.setText(count + " mal");

		tfStringT.setText(z1 + " ms");
		tfCharT.setText(z2 + " ms");
		tfHashT.setText(z3 + " ms");

	}

	public int StringVGL(String txt, String letter) {
		int n = 0;
		for (int i = 0; i <= txt.length() - (letter.length()); i++) {
			if (txt.substring(i, i + letter.length()).equals(letter))
				n++;

		}
		return n;
	}

	public int CharVGL(String txt, String letter) {
		int n = 0;
		char[] c, d;
		c = txt.toCharArray();
		d = letter.toCharArray();
		for (int i = 0; i <= c.length - d.length; i++) {
			if (c[i] == d[0]) {
				for (int j = 0; j < d.length; j++) {
					if (c[i] != d[j])
						break;
					i++;
					if (j == d.length - 1)
						n++;
				}
			}
		}
		return n;

	}

	public int HashVGL(String txt, String letter) {
		int n = 0;
		int txtcount = 0;
		int lettercount = 0;
		char[] c, d;
		c = txt.toCharArray();
		d = letter.toCharArray();
		for ( int i = 0; i<letter.length();i++){
			txtcount += c[i];
			lettercount += d[i];
		}
		if (txtcount==lettercount) n++;
		System.out.println(lettercount);
		for (int i = letter.length();i<txt.length();i++){
			txtcount += c[i];
			txtcount -= c[i-letter.length()];
			if (txtcount==lettercount) n++;
		}
		return n;
	}

}
