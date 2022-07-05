package javaDers7;

public class Pratik03 {
    public static void main(String[] args) {
        /*Vucut kitle endeksi hesaplayan bir program yaziniz
        Vucut Kitle Endeksi = kilo / (boyun karesi)
        Not: Boy, metre cinsinden girilmelidir
        */

        float kilo = 60.0f;
        float boy = 1.7f;

        float vucutKitleEndeksi = kilo / (boy*boy);

        System.out.println(vucutKitleEndeksi);

    }
}
