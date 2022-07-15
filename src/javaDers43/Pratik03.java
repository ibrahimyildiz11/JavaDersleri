package javaDers43;

public class Pratik03 {
    public static void main(String[] args) {
        int[] sayilar = {1, 5, 11, 23, 45, 17, 25, 52, 8, 75};
        System.out.println("Listedeki en buyuk sayi: " + buyukSayi(sayilar));

    }

    public static int buyukSayi(int[] sayilar) {
        int buyuk = 0;
        for (int sayi:sayilar) {
            if (sayi >= buyuk) {
                buyuk = sayi;
            }
        }
        return buyuk;
    }
}
