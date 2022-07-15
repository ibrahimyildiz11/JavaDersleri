package javaDers41;

public class MainClass {
    public static void main(String[] args) {
        int[] sayilar = { 10, 20, 30, 40, 50};
        int[] sayilar2 = { 100, 200, 300, 400, 500};
        arrayToplam(sayilar);
        arrayToplam(sayilar2);
    }

    public static int arrayToplam(int[] sayilar) {
        int sum = 0;
        for (int sayi:sayilar) {
            sum += sayi;
        }
        System.out.println(sum);
        return sum;
    }
}
