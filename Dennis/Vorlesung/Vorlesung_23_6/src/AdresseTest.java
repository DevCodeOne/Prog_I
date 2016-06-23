import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class AdresseTest {

    @Test
    public void testgetPlz(){
        Adresse adr = new Adresse("strasse", "12345", "HOM");

        String plz = adr.getPlz();

        assertTrue(plz.equals("12345"));
    }
    @Test
    public void testgetStr(){
        Adresse adr = new Adresse("strasse", "12345", "HOM");

        String str = adr.getStrasse();

        assertTrue(str.equals("strasse"));
    }
    @Test
    public void testgetOrt(){
        Adresse adr = new Adresse("strasse", "12345", "HOM");

        String ort = adr.getOrt();

        assertTrue(ort.equals("HOM"));
    }
}
