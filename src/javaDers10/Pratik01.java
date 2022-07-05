package javaDers10;

public class Pratik01 {
    public static void main(String[] args) {
        int sayi = 345;

        int birler = sayi % 10; //5
        sayi /= 10; //34

        int onlar = sayi % 10; //4

        sayi /= 10; //3
        int yuzler = sayi % 10; //3

        System.out.println("Birler :" + birler);
        System.out.println("Onlar :" + onlar);
        System.out.println("Yuzler :" + yuzler);

        System.out.println("toplam : " + (birler+onlar+yuzler));

    }
}
