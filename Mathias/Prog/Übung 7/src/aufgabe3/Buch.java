package aufgabe3;

public class Buch {
	private String Autor, Titel, ISBN, Verlag;

	public Buch(String autor, String titel, String iSBN, String verlag) {
		super();
		Autor = autor;
		Titel = titel;
		ISBN = iSBN;
		Verlag = verlag;
	}

	@Override
	public String toString() {
		return Autor + " : " + Titel + " (ISBN: " + ISBN + ")";
	}

	public String getAutor() {
		return Autor;
	}

	public void setAutor(String autor) {
		Autor = autor;
	}

	public String getTitel() {
		return Titel;
	}

	public void setTitel(String titel) {
		Titel = titel;
	}

	public String getISBN() {
		return ISBN;
	}

	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}

	public String getVerlag() {
		return Verlag;
	}

	public void setVerlag(String verlag) {
		Verlag = verlag;
	}
	
	
}
