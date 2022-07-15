package javaDers43;

public class Pratik01 {
    public static void main(String[] args) {
        int sonuc1 = toplama(20, 10);
        int sonuc2 = toplama(20,10,30);
        int sonuc3 = cikarma(20, 10);
        int sonuc4 = carpma(20, 10);
        int sonuc5 = bolme(20, 10);
        System.out.println(sonuc1);
        System.out.println(sonuc2);
        System.out.println(sonuc3);
        System.out.println(sonuc4);
        System.out.println(sonuc5);
    }
    public static int toplama(int sayi1, int sayi2) {
        int islem = sayi1 + sayi2;
        return islem;
    }

    public static int toplama(int sayi1, int sayi2, int sayi3) {
        int islem = sayi1 + sayi2+ sayi3;
        return islem;
    }
    public static int cikarma(int sayi1, int sayi2) {
        int islem = sayi1 - sayi2;
        return islem;
    }
    public static int  carpma(int sayi1, int sayi2) {
        int islem = sayi1 * sayi2;
        return islem;
    }
    public static int bolme(int sayi1, int sayi2) {
        int islem = sayi1 / sayi2;
        return islem;
    }
}
