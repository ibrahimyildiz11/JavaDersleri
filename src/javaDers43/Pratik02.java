package javaDers43;

public class Pratik02 {
    public static void main(String[] args) {

        int sayi = 20;
        System.out.println(sayi + "! = " + getFaktoriyel(sayi));
    }

    public static long getFaktoriyel(int sayi) {
        long sonuc = 1;
        for (int i = 1; i <= sayi ; i++) {
            sonuc*= i;
        }
        return sonuc;
    }
}
