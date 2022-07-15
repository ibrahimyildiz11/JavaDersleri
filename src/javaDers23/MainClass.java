package javaDers23;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("islem seciniz : (+, -, *, /)");
        String islem = scanner.next();

        System.out.println("birinci sayi: ");
        int num1 = scanner.nextInt();

        System.out.println("ikinci sayi: ");
        int num2 = scanner.nextInt();

        if (islem.equals("+")){
            System.out.println("toplam = " + num1 + num2);
        }

        if (islem.equals("-")){
            System.out.println("fark = " + (num1 + num2));
        }

        if (islem.equals("*")){
            System.out.println("carpim = " + (num1 * num2));
        }

        if (islem.equals("/")){
            System.out.println("bolum = " + (num1 / num2));
        }





        /*System.out.println("Ortalamayi giriniz : ");

        int ortalama = scanner.nextInt();

        if (ortalama >= 45) {
            System.out.println("Dersi gectiniz.");
        }

        if (ortalama < 45) {
            System.out.println("Dersten kaldiniz.");
        }*/
    }
}
