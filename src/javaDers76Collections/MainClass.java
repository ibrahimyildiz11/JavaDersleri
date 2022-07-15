package javaDers76Collections;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class MainClass {
    public static void main(String[] args) {
        //int[] sayilar = {1,2,3,4,5};

        Araba nesne1 = new Araba();
        Araba nesne2 = new Araba();
        Araba nesne3 = new Araba();

        Araba[] Arabalar = {nesne1, nesne2, nesne3};

        ArrayList<Integer> sayilar = new ArrayList<>();
        sayilar.add(5);

        sayilar.add(5);

        sayilar.add(15);

        System.out.println(sayilar);

        List<String> liste = new ArrayList<>();
        liste.add("Hamza");
        liste.add("Ali");
        liste.add("Berk");
        liste.add(0, "Ayse");
        liste.add(2, "Burak");

        System.out.println(liste);

    }
}
