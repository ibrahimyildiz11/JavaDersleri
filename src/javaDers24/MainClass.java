package javaDers24;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen yasinizi giriniz: ");
        int yas = scanner.nextInt();

        System.out.println("Lutfen cinsiyetinizi giriniz: ");
        String cinsiyet = scanner.next();

        if (cinsiyet.toLowerCase().equals("erkek") ) {
            if (yas >= 20 ) {
                System.out.println("Askere gidebilirsiniz.");
            }
        }

        int sayi = 80;

        if (sayi >= 50) {
            System.out.println("sayi 50'den buyuk!");
            if (sayi % 10 == 0) {
                System.out.println("sayi 10'a tam bolunuyor");
            }
        }
    }
}
