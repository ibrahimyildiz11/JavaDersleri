package javaDers16;
//indexOf()
public class MainClass {
    public static void main(String[] args) {
        String isim = "Hamza";
        int sira = isim.indexOf("z");

        System.out.println(isim);
        System.out.println(isim.length());
        System.out.println("z harfinin bulundugu index : " + sira);

        //aradigini bulamazsa -1 verir
        System.out.println(isim.indexOf("p"));

        //birden fazla ayni karakter varsa ilkinin indexini verir
        System.out.println(isim.indexOf("a"));

        //son index icin
        System.out.println(isim.lastIndexOf("a"));

        System.out.println(isim.indexOf("za"));


    }
}
