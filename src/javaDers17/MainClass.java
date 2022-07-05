package javaDers17;

import java.util.Locale;

public class MainClass {
    public static void main(String[] args) {
        String isim = "hamza";
        String isim2 = "HAMZA";

        boolean esitMi = isim.equals(isim2);

        System.out.println(isim.equals(isim2));
        System.out.println(isim.equalsIgnoreCase(isim2));

        System.out.println(isim.toUpperCase());
        System.out.println(isim2.toLowerCase());
    }
}
