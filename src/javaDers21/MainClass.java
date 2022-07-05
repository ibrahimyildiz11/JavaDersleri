package javaDers21;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Lutfen isminizi giriniz :");
        String isim = input.next();

        System.out.println("Lutfen yasinizi giriniz :");
        int yas = input.nextInt();

        System.out.println("Girilen isim : " + isim +"\nGirilen yas : " + yas);

    }
}
