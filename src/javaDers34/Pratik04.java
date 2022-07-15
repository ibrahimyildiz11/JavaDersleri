package javaDers34;

public class Pratik04 {
    public static void main(String[] args) {
        int sayi = 0;

        while (true) {
            sayi++;

            if (sayi > 99) {
                break;
            }

            if (sayi == 20) {
                continue;
            }
            System.out.println("Sayi : " + sayi);
        }
    }
}
