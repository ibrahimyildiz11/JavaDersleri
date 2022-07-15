package javaDers96;

import java.util.ArrayList;
import java.util.Iterator;

public class MainClass {
    public static void main(String[] args) {
        ArrayList<String> isimler = new ArrayList<>();
        isimler.add("Burcu");
        isimler.add("Nesrin");
        isimler.add("Busra");

        Iterator iterator = isimler.iterator();

        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }
        System.out.println(iterator.hasNext()); // sonraki data var mi. ilk sorguda listede eleman var mi?
        /*System.out.println(iterator.next());
        iterator.remove();
        System.out.println(iterator.next());
        System.out.println(iterator.next());
        System.out.println(iterator.hasNext());*/

        System.out.println(isimler);
    }
}
