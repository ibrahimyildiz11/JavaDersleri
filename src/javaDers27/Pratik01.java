package javaDers27;

import java.util.Scanner;

public class Pratik01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("ilk sayi: ");
        int num1 = scanner.nextInt();

        System.out.println("ikinci sayi: ");
        int num2 = scanner.nextInt();

        int buyukSayi = num1 > num2 ? num1 : num2;

        System.out.println("buyuk sayi " + buyukSayi);
    }
}
