package javaDers42;

public class Pratik02 {
    public static void main(String[] args) {
        int[] sayilar = {20, 40, 50};

        kontrol(sayilar, 70);
        kontrol(sayilar, 40);
    }

    public static void kontrol(int[] array, int arananSayi) {
        boolean varMi = false;
        for (int sayi:array) {
            if (sayi == arananSayi) {
                varMi = true;
                break;
            }
        }
        System.out.println(arananSayi +" Var mi ? : " + varMi);
    }
}
