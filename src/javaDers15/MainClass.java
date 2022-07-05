package javaDers15;
//concat()
public class MainClass {
    public static void main(String[] args) {
        String isim = "Kerem";
        String soyIsim = "Kartal";
        String bosluk = " ";

        System.out.println(isim);
        System.out.println(soyIsim);

        //String adSoyad = isim + bosluk + soyIsim;

        String adSoyad = isim.concat(bosluk).concat(soyIsim);

        System.out.println(adSoyad);
        System.out.println(adSoyad.length());

        String bilgi = "Benim ismim " + isim + " ve soy ismim " + soyIsim;
        System.out.println(bilgi);
    }
}
