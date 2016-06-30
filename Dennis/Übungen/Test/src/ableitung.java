import java.util.Scanner;

public class ableitung {
    public static void main(String[] args) {
        String erg = "";
        Scanner sc = new Scanner(System.in);
        System.out.println("Bitte geben Sie die Anzahl der Elemente der Funktion an:");
        int anzahl = sc.nextInt();
        int i = 1;

        do{
            System.out.println("Bitte geben Sie die " + i + "te Konstante ein:");
            int konst = sc.nextInt();
            System.out.println("Bitte geben Sie den " + i + "ten Exponenten an:");
            int exp = sc.nextInt();
            i++;
            erg = erg + func(konst, exp, i, anzahl);
            }while(i <= anzahl);
        System.out.println(erg);
    }

    public static String func(int konst, int exp, int i, int anzahl){
        if(i > anzahl) {
           if(exp == 0){
               return "";
           }
           else if (exp == 1) {
                return konst + "";
           }
           else {
                konst *= exp;
                exp -= 1;
                return konst + "x^" + exp;
            }
        }
        else{
            if(exp == 0){
                return "";
            }
            else if (exp == 1) {
                return konst + "";
            } else {
                konst *= exp;
                exp -= 1;
                return konst + "x^" + exp + " + ";
            }
        }
    }
}