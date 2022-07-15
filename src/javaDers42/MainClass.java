package javaDers42;

public class MainClass {
    public static void main(String[] args) {
        toplama();

        System.out.println("alt satira gectik");

        toplama(40, 50);
    }

    public static void toplama() {
        System.out.println("toplama metodu cagrildi");
        System.out.println("merhabalar");
    }

    public static void toplama(int sayi1, int sayi2) {
        int toplam = sayi1 + sayi2;
        System.out.println("Toplam : " + toplam);
    }
}
