package javaDers23;

import java.util.Scanner;

public class Pratik01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Lutfen e-mail adresinizi giriniz");
        String email = scanner.next();

        int index = email.indexOf("@");
        String gmail = email.substring(index+1);

        if (!email.contains("@")){
            System.out.println("E-mail adresi @ isaretini icermelidir");
        }

        if (!gmail.equals("gmail.com")) {
            System.out.println("Lutfen gmail hesabi giriniz!");
        }

        if (email.contains("@") && gmail.equals("gmail.com")){
            System.out.println("Hesabiniz dogrulandi hosgeldiniz..");
        }
    }
}
