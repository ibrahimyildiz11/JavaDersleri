package javaDers23;

import java.util.Scanner;

public class Pratik02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Urun fiyati nedir? ");
        float fiyat = scanner.nextFloat();

        System.out.println("urun adedini giriniz:");
        float miktar = scanner.nextFloat();
        float indirimOrani = 0;

        if (miktar >= 1 && miktar < 10){
            indirimOrani = 10;
        }

        if (miktar >= 10 && miktar < 50){
            indirimOrani = 20;
        }

        if (miktar >= 50){
            indirimOrani = 25;
        }

        float normalFiyat = fiyat * miktar;
        float indirimliFiyat = normalFiyat*(100-indirimOrani)*100;

        System.out.println("normal fiyat :" + normalFiyat);
        System.out.println("indirimli fiyat :" + indirimliFiyat);
    }
}
