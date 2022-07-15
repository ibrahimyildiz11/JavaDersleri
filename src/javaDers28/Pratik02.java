package javaDers28;

import java.util.Scanner;

public class Pratik02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Birinci sayiyi giriniz: ");
        int num1 = scanner.nextInt();
        System.out.println("Birinci sayiyi giriniz: ");
        int num2 = scanner.nextInt();

        System.out.println("Lutfen islem seciniz\n1 : Toplama\n2 : cikarma\n3 : carpma\n4 : bolme");
        int islem = scanner.nextInt();

        switch (islem) {
            case 1 -> System.out.println("Toplama : " + (num1 + num2));
            case 2 -> System.out.println("cikarma : " + (num1 - num2));
            case 3 -> System.out.println("carpma : " + (num1 * num2));
            case 4 -> System.out.println("bolme : " + (num1 / num2));
            default -> System.out.println("Hatali secim! Lutfen tekrar deneyiniz.");
        }
    }
}
