package javaDers21;

import java.util.Scanner;

public class Pratik01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Byte deger giriniz : ");
        byte deger1 = input.nextByte();

        System.out.println("Short deger giriniz : ");
        short deger2 = input.nextShort();

        System.out.println("Integer deger giriniz : ");
        int deger3 = input.nextInt();

        System.out.println("Long deger giriniz : ");
        long deger4 = input.nextLong();

        System.out.println("Float deger giriniz : ");
        float deger5 = input.nextFloat();

        System.out.println("Double deger giriniz : ");
        double deger6 = input.nextDouble();

        System.out.println("Boolean deger giriniz : ");
        boolean deger7 = input.nextBoolean();

        System.out.println("Char deger giriniz : ");
        char deger8 = input.next().charAt(0);

        System.out.println("Byte : " + deger1);
        System.out.println("Short : " + deger2);
        System.out.println("Int : " + deger3);
        System.out.println("Long : " + deger4);
        System.out.println("Float : " + deger5);
        System.out.println("Double : " + deger6);
        System.out.println("Boolean : " + deger7);
        System.out.println("Char : " + deger8);
    }
}
