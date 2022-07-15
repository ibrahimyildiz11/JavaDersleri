package javaDers38;

public class MainClass {
    public static void main(String[] args) {
        byte sayi1 = 100;
        int sayi2 = 50;

        sayi1 = (byte) sayi2; // int olan sayi2'yi byte'a cast ettik.
        System.out.println(sayi1);

        long sayi4 = 5674l;
        int sayi3 = 999;

        sayi3 = (int) sayi4;

        System.out.println(sayi3);

        //**********************

        byte sayi5 = 120;
        int sayi6 = 500;

        sayi6 = sayi5;
        // asagidan yukari cast otomatik yapilir bizim yapmamiza gerek yok.
        // asagidaki tipte sayi yukaridaki tipin icerisine zaten sigacaktir.


    }
}
