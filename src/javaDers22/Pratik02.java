package javaDers22;

import java.util.Scanner;

public class Pratik02 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Bir gunde kac bardak cay iciyorsunuz? ");
        double bardak = input.nextDouble();

        System.out.println("Bir cay bardagina kac adet seker atiyorsun?");
        double seker = input.nextDouble();

        double yillik = bardak * seker * 3 * 365/1000;

        double yillik60 = bardak * seker * 3 * 365 * 60 /1000;

        if (yillik == 0) {
            System.out.println("Tebrikler seker tuketmediginiz icin daha sagliklisiniz..");
        }

        System.out.println("Bir yilda tukettigin seker miktari " + yillik + " kg.");
        System.out.println("60 yilda tukettigin seker miktari " + yillik60 + " kg.");
    }
}
