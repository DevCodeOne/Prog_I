import java.util.Arrays;
import java.util.Comparator;

public class Aufgabe2 {

    public static<E> void sort(E []a, Comparator<E> c) {
        for (int j = 0; j < a.length; j++)
            for (int i = 0; i < a.length - 1; i++) {
                if (c.compare(a[i], a[i+1]) > 0) {
                    E tmp = a[i];
                    a[i] = a[i + 1];
                    a[i + 1] = tmp;
                }
            }
    }

    public static void main(String [] args) {
        Double d[] = new Double[]{0.0, 5.0, 223.0, 5.0, 23.0 ,1.0, 10.0};
        sort(d, (a ,b) -> Double.compare(a, b));

        System.out.println(Arrays.toString(d));
    }
}