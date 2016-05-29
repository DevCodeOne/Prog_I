package aufgabe4;

import aufgabe3.Buch;
import javafx.fxml.FXML;
import javafx.scene.control.TextField;

public class DialogController {
	@FXML
	private TextField autor,titel,verlag,isbn;
	
	
	private Buch buch;
	
	public void setBuch(Buch buch){
		this.buch = buch;
		autor.setText(this.buch.getAutor());
		titel.setText(this.buch.getTitel());
		verlag.setText(this.buch.getVerlag());
		isbn.setText(this.buch.getISBN());
	}
	public Buch getBuch(){
		this.buch.setAutor(autor.getText());
		this.buch.setISBN(isbn.getText());
		this.buch.setTitel(titel.getText());
		this.buch.setVerlag(verlag.getText());
		return this.buch;
	}
}
