package javaDers27;

import java.util.Scanner;

public class Pratik02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("vize notu: ");
        int vizeNotu = scanner.nextInt();

        System.out.println("final notu: ");
        int finalNotu = scanner.nextInt();

        int ortalama = vizeNotu*40/100 + finalNotu*60/100;

        String harfNotu = ortalama<50 ? "FF" : ortalama<60 ? "DD" : ortalama<70 ? "CC" : ortalama<85 ? "BB" : "AA";

        System.out.println("Harf Notunuz: " + harfNotu);
    }
}
