package javaDers31;

import java.util.Arrays;
import java.util.Scanner;

public class Pratik01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen bir metin giriniz.");
        String makale = scanner.nextLine();

        System.out.println("Makale: " + makale);
        String[] cumleler = makale.split("\\.");
        String[] kelimeler = makale.split(" ");
        String[] karakterler = makale.split("");

        for (int i =0; i < cumleler.length; i++) {
            System.out.println(cumleler[i]);
        }

        System.out.println("Cumle sayisi: " + cumleler.length);
        System.out.println("Kelime sayisi: " + kelimeler.length);
        System.out.println("Karakterler sayisi: " + karakterler.length);
    }

    /*Sed sapien ligula, commodo nec rutrum ut, tincidunt et odio. Vivamus vel condimentum arcu, vel faucibus odio.
    Suspendisse venenatis a turpis eget consequat. Pellentesque semper turpis ipsum, nec pulvinar lectus tristique quis.
    Pellentesque cursus placerat nisi non posuere.
    Morbi mattis elementum erat, vitae tempor nulla hendrerit eget.
    Aenean ante ex, ultricies a consectetur eu, laoreet a arcu.*/
}
