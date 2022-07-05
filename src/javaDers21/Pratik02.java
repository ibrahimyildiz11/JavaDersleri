package javaDers21;

import java.util.Scanner;

public class Pratik02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Ilk sayiyi giriniz : ");

        int num1 = input.nextInt();

        System.out.println("Ikinci sayiyi giriniz : ");

        int num2 = input.nextInt();

        System.out.println("Toplam : " + (num1 + num2));
        System.out.println("Fark : " + (num1 - num2));
        System.out.println("Carpim : " + (num1 * num2));
        System.out.println("Bolum : " + (num1 / num2));
    }
}
