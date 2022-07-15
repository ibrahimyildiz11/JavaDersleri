package javaDers31;

import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {
        String diller = "turkce,ingilizce,arapca,fransizca,almanca";

        String[] array = diller.split(",");
        System.out.println(array.length);
        System.out.println(Arrays.toString(array));

        //**********************************************

        String metin = "Bugun cuma. Iyi gunler. Kendine iyi bak.";

        String[] cumleler = metin.split("\\.");

        System.out.println(cumleler.length);
        System.out.println(Arrays.toString(cumleler));
    }
}
