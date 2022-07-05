package javaDers14;

//STRING METHODS
//length() : String'in uzunlugu
public class MainClass {
    public static void main(String[] args) {
        String isim = "Hamza";
        String dil = "Java";
        String bilgi = "String uzunlugu elde etme";

        System.out.println(isim);
        System.out.println(dil);
        System.out.println(bilgi);

        int isimUzunluk = isim.length();
        int dilUzunluk = dil.length();
        int bilgiUzunluk = bilgi.length();

        System.out.println(isimUzunluk);
        System.out.println(dilUzunluk);
        System.out.println(bilgiUzunluk);
    }
}
