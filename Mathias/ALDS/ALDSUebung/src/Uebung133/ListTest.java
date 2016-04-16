package mypack;
import java.util.Random;
import java.io.*;

import mypack.list.LinkedList;

public class ListTest {

    /**
     * @param args
     */
    public static void main(String[] args)  {
        // allocate list
        LinkedList list=new LinkedList();
        
        // input
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        String input;
        int choice=-1;  // show menu
        
        // menu
        do
        {
            if(choice==-1) {
                System.out.println();
                System.out.println(" 0. Programm beenden");
                System.out.println(" 1. Liste löschen");
                System.out.println(" 2. Liste ausgeben (iterativ)");
                System.out.println(" 3. Liste ausgeben (rekursiv)");
                System.out.println(" 4. Liste umgekehrt ausgeben (rekursiv)");
                System.out.println(" 5. Liste umkehren (rekursiv)");
                System.out.println(" 6. Element hinzufügen (am Anfang)");
                System.out.println(" 7. Element hinzufügen (am Ende)");
                System.out.println(" 8. Element hinzufügen (Sortierreihenfolge)");
                System.out.println(" 9. Element löschen (iterativ)");
                System.out.println("10. Element löschen (rekursiv)");
                System.out.println("11. Element suchen (iterativ)");
                System.out.println("12. Element suchen (rekursiv)");
                System.out.println("13. Element zählen (iterativ)");
                System.out.println("14. Element zählen (rekursiv)");
                System.out.println("15. Listenlänge bestimmen (iterativ)");
                System.out.println("16. Listenlänge bestimmen (rekursiv)");
                System.out.println("17. Aufsteigende Sortierung überprüfen (iterativ)");
                System.out.println("18. Aufsteigende Sortierung überprüfen (rekursiv)");
                System.out.println("42. Liste vorbelegen (unsortiert)");
                System.out.println("43. Liste vorbelegen (sortiert)");
            }
           
            System.out.print("Eingabe: ");
            try
            {   // read a line and convert it to integer
                input = buffer.readLine().trim();
                choice = Integer.parseInt(input);
            }
            catch(Exception e)
            {   choice=-1;  // show menu
            }
            
            switch(choice)
            {   
                case 1:
                    list.dispose1();
                    break;
                case 2:
                    list.show1();
                    System.out.println();
                    break;
                    
                case 7:
                    int element;
                     
                    System.out.print("Element: ");
                    try
                    {   // read a line and convert it to integer
                        input = buffer.readLine().trim();
                        element = Integer.parseInt(input);
                    }
                    catch(Exception e)
                    {   element=42; 
                    }                   

                    list.insertLast(element);
                    break;

                case 42:
                    int elements, max;
                    Random randomGen = new java.util.Random(42); 
                    
                    System.out.print("Anzahl der Elemente: ");
                    try
                    {   // read a line and convert it to integer
                        input = buffer.readLine().trim();
                        elements = Integer.parseInt(input);
                    }
                    catch(Exception e)
                    {   elements=10; 
                    }
                    System.out.print("Maximum: ");
                    try
                    {   // read a line and convert it to integer
                        input = buffer.readLine().trim();
                        max = Integer.parseInt(input);
                    }
                    catch(Exception e)
                    {   max=10; 
                    }
                   
                    list.dispose1();
                    for(int i=1; i<=elements; i++)
                        list.insertFirst(randomGen.nextInt(max+1));
                    break;
            }
            
            
            
        } while (choice!=0);
        
    }

}
