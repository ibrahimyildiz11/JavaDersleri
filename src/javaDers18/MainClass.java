package javaDers18;

import java.util.Locale;

public class MainClass {
    public static void main(String[] args) {
        String diller = " ingilizce, fransizca, ispanyolca, turkce";

        /*contains() : iceriyor mu
                diller.contains("ingilizce");

        trim() : bosluk karakterlerini temizler
                diller.trim();

        charAt() : indexteki karakteri alir
                diller.charAt(20);

        replace() : string icerisinde degisiklik yapar
                diller.replace("ispanyolca", "arapca");

        compareTo() : iki stringi () -> karsilastirir
                diller.compareTo("Almanca");*/

        System.out.println(diller.contains("arapca"));
        System.out.println(diller.trim());
        System.out.println(diller.charAt(21));
        System.out.println(diller.replace("ispanyolca", "arapca"));

        String bilgi = "Ben Java'yi sevmiyorum!";
        System.out.println(bilgi.replace("sevmiyorum", "seviyorum"));
        System.out.println(bilgi.replace(" ", ""));

        String isim1 = "Ahmet";
        String isim2 = "Mehmet";
        System.out.println(isim1.compareTo(isim2)); //sonuc negatif ise ilk string alfabede daha once gelir demektir!

    }
}
