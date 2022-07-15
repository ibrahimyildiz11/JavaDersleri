package javaDers28;

import java.util.Scanner;

public class Pratik03 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("uc basamakli bir sayi giriniz: ");
        int sayi = scanner.nextInt();

        int birler = sayi %10; // 123 %10 = 3
        sayi = sayi/10; // 123/10 = 12

        int onlar = sayi %10; // 12 %10 = 2
        sayi = sayi / 10; // 12/10= 1

        int yuzler = sayi % 10; // 1 % 10 = 1

        System.out.print("Girdiginiz sayi: ");

        switch (yuzler) {
            case 1 -> System.out.print("yuz");
            case 2 -> System.out.print("ikiyuz");
            case 3 -> System.out.print("ucyuz");
            case 4 -> System.out.print("dortyuz");
            case 5 -> System.out.print("besyuz");
            case 6 -> System.out.print("altiyuz");
            case 7 -> System.out.print("yediyuz");
            case 8 -> System.out.print("sekizyuz");
            case 9 -> System.out.print("dokuzyuz");
        }

        System.out.print(" ");

        switch (onlar) {
            case 1 -> System.out.print("on");
            case 2 -> System.out.print("yirmi");
            case 3 -> System.out.print("otuz");
            case 4 -> System.out.print("kirk");
            case 5 -> System.out.print("elli");
            case 6 -> System.out.print("altmis");
            case 7 -> System.out.print("yetmis");
            case 8 -> System.out.print("seksen");
            case 9 -> System.out.print("doksan");
        }

        System.out.print(" ");

        switch (birler) {
            case 1 -> System.out.print("bir");
            case 2 -> System.out.print("iki");
            case 3 -> System.out.print("uc");
            case 4 -> System.out.print("dort");
            case 5 -> System.out.print("bes");
            case 6 -> System.out.print("alti");
            case 7 -> System.out.print("yedi");
            case 8 -> System.out.print("sekiz");
            case 9 -> System.out.print("dokuz");
        }

    }
}
