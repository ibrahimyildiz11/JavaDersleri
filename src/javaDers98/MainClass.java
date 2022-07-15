package javaDers98;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ilk sayi: ");
        int ilkSayi = scanner.nextInt();
        System.out.println("Ikinci sayi: ");
        int ikinciSayi = scanner.nextInt();
        int sonuc = 0;
        try {
            sonuc = ilkSayi/ikinciSayi;
        }catch (ArithmeticException ex){
            System.out.println("Hata olustu!  " + ex);
        }finally {
            System.out.println("finally! ");
        }

        System.out.println("Sonuc : " + sonuc);
        System.out.println("Merhabalar..!");
    }
}
