package javaDers43;

public class Pratik04 {
    public static void main(String[] args) {
        int[] sayilar = {100, 90, 80, 70, 60};
        System.out.println("Sirali mi? " + getSiraliMi(sayilar) );

    }

    public static boolean getSiraliMi(int[] sayilar) {
        boolean siraliMi = true;
        for (int i = 0; i < sayilar.length-1; i++) {
            if (sayilar[i] < sayilar[i+1]) {
                siraliMi = false;
                break;
            }
        }
        return siraliMi;
    }
}
