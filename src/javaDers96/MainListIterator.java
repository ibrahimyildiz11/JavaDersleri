package javaDers96;

import java.util.ArrayList;
import java.util.ListIterator;

public class MainListIterator {
    public static void main(String[] args) {
        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Burcu");
        isimler.add("Nesrin");
        isimler.add("Busra");

        ListIterator listIterator = isimler.listIterator();
        System.out.println(listIterator.next());
        listIterator.add("Ayse");
        System.out.println(isimler);
        /*System.out.println(listIterator.next());
        System.out.println(listIterator.next());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());
        System.out.println(listIterator.previous());*/
    }
}
