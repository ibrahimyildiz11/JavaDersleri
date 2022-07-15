package javaDers82LinkedList;

import java.util.LinkedList;

public class MainClass {
    public static void main(String[] args) {
        LinkedList list = new LinkedList();
        list.add("Hamza");
        list.add("Burak");
        list.add("Hamza");
        list.addFirst("Ahmet");
        list.addLast("Veli");

        System.out.println(list);

        list.remove("Hamza");
        list.remove(2);

        System.out.println(list);
        System.out.println(list.getFirst());
        System.out.println(list.getLast());
        System.out.println(list.get(0));
        System.out.println(list.contains("Burak"));
    }
}
