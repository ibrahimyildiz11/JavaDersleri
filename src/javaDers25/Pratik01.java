package javaDers25;

import java.util.Scanner;

public class Pratik01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bugun hangi gun ?");
        String gun = scanner.next();

        if (gun.equalsIgnoreCase("cumartesi") || gun.equalsIgnoreCase("pazar")) {
            System.out.println("Hafta sonu! iyi tatiller!");
        }else {
            System.out.println("Hafta ici! Hayirli isler!");
        }
    }
}
