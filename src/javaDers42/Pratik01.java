package javaDers42;

public class Pratik01 {
    public static void main(String[] args) {
        toplama(20, 10);
        toplama(20,10,30);
        cikarma(20, 10);
        carpma(20, 10);
        bolme(20, 10);
    }
    public static void toplama(int sayi1, int sayi2) {
        int islem = sayi1 + sayi2;
        System.out.println("Toplam : " + islem);
    }

    public static void toplama(int sayi1, int sayi2, int sayi3) {
        int islem = sayi1 + sayi2+ sayi3;
        System.out.println("Toplam : " + islem);
    }
    public static void cikarma(int sayi1, int sayi2) {
        int islem = sayi1 - sayi2;
        System.out.println("Fark : " + islem);
    }
    public static void carpma(int sayi1, int sayi2) {
        int islem = sayi1 * sayi2;
        System.out.println("Carpim : " + islem);
    }
    public static void bolme(int sayi1, int sayi2) {
        int islem = sayi1 / sayi2;
        System.out.println("Bolum : " + islem);
    }
}
