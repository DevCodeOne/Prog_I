public class Adresse {

    private String plz;
    private String ort;
    private String strasse;

    public Adresse(String strasse, String plz, String ort){
        this.strasse = strasse;
        this.setPlz(plz);
        this.ort = ort;
    }

    public String getPlz() {
        return plz;
    }

    public void setPlz(String plz) {
        if(plz.length() != 5)
            throw new IllegalArgumentException("PLZ falsches Format");

        this.plz = plz;
    }

    public String getOrt() {
        return ort;
    }

    public void setOrt(String ort) {
        this.ort = ort;
    }

    public String getStrasse() {
        return strasse;
    }

    public void setStrasse(String strasse) {
        this.strasse = strasse;
    }

}
