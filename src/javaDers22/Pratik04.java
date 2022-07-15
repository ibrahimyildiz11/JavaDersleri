package javaDers22;

import java.util.Scanner;

public class Pratik04 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Kimlik numarasini giriniz");

        long tcNo = input.nextLong();

        long ilkHane = tcNo / 10000000000l;

        boolean uzunlukDogruMu = ("" + tcNo).length() == 11;

        int sonRakam = (int) (tcNo % 10);

        if (ilkHane !=0 && uzunlukDogruMu && sonRakam % 2 ==0) {
            System.out.println("Tebrikler!");
        }

        if (ilkHane == 0) {
            System.out.println("Ilk hane 0 olamaz");
        }

        if (uzunlukDogruMu == false) {
            System.out.println("TC No 11 hane olmalidir.");
        }

        if (sonRakam % 2 != 0) {
            System.out.println("Son rakam cift olmalidir.");
        }



    }
}
