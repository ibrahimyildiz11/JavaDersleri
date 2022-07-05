package javaDers21;

import java.util.Scanner;

public class Pratik03 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Gunde kac saat uyuyorsunuz ? :");

        int saat = input.nextInt();

        int ay = 30*saat/24;
        int yil = 365*saat/24;
        int omur = 365*saat*20/24;

        System.out.println("Ayda " + ay + " gununuz uykuda geciyor.");
        System.out.println("Yilda " + yil + " gununuz uykuda geciyor.");
        System.out.println("Yirmi yillik bir omurde  " + omur/365 + " yiliniz uykuda geciyor.");
    }
}
