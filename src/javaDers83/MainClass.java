package javaDers83;

import java.util.LinkedList;
import java.util.List;

public class MainClass {
    public static void main(String[] args) {
        LinkedList<String> list = new LinkedList<>();

        list.add("Hamza");
        list.add("Hamza");
        list.add("Hamza");

        System.out.println(list);

        List<Integer> list1 = new LinkedList<>();

        list1.add(20);
        list1.add(12);

        System.out.println(list1);

        list1.add(1,40);

        System.out.println(list1);

    }
}
