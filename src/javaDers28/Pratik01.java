package javaDers28;

import java.util.Scanner;

public class Pratik01 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("ay bilgisini rakam olarak giriniz:  1 - 12 arasi");
        int ay = scanner.nextInt();

        switch (ay) {
            case 1 -> System.out.println("ocak");
            case 2 -> System.out.println("subat");
            case 3 -> System.out.println("mart");
            case 4 -> System.out.println("nisan");
            case 5 -> System.out.println("mayis");
            case 6 -> System.out.println("haziran");
            case 7 -> System.out.println("temmuz");
            case 8 -> System.out.println("agustos");
            case 9 -> System.out.println("eylul");
            case 10 -> System.out.println("ekim");
            case 11 -> System.out.println("kasim");
            case 12 -> System.out.println("aralik");
            default -> System.out.println("yanlis sayi");
        }
    }
}
