package javaDers22;

import java.util.Random;

public class Pratik03 {
    public static void main(String[] args) {
        Random rastgele = new Random();

        int sayi = rastgele.nextInt(101); //0 - 100

        if (sayi <= 25) {
            System.out.println("Sayi 0 - 25 araligindadir.");
        }

        if (sayi > 50) {
            System.out.println("Sayi 50 - 100 araligindadir.");
        }
        System.out.println(sayi);


    }
}
