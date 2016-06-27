import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;

public class StreamTest {
    public static void main(String[] args){
        Random rand = new Random();
        List<Integer> liste = new ArrayList<Integer>();
        for(int i = 0; i < 50; i++){
            liste.add(rand.nextInt(50));
        }

        long start, end;

        start = System.currentTimeMillis();
        int sum = 0;
        for(Integer i : liste){
           sum += i;
        }
        end = System.currentTimeMillis();
        System.out.println(sum + " (" + (end - start) + " ms)");

        System.out.println();

        start = System.currentTimeMillis();
        Integer sum2 = liste.stream().reduce(0, (x,y) -> x + y);
        end = System.currentTimeMillis();

        System.out.println(sum2 + " (" + (end - start) + " ms)");
    }
}