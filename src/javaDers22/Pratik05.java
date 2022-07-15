package javaDers22;

import java.util.Scanner;

public class Pratik05 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kullanici adinizi giriniz : ");
        String username = input.next();

        System.out.println("Sifrenizi giriniz : ");
        String password = input.next();

        if (username.equals("admin") && password.equals("123456")) {
            System.out.println("Hosgeldiniz!");
        }

        if (!username.equals("admin")) {
            System.out.println("Kullanici adiniz yanlis!");
        }

        if (!password.equals("123456")) {
            System.out.println("Password yanlis!");
        }
    }
}
