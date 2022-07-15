package javaDers22;

public class MainClass {
    public static void main(String[] args) {
        int sayi = 95;
        if (sayi > 50) {
            System.out.println("Sayi 50'den buyuktur");
        }

        if (sayi <50) {
            System.out.println("Sayi 50'den kucuktur");
        }


        String diller = "arapca, ingilizce, fransizca";

        if (diller.contains("turkce")) {
            System.out.println("turkce biliyorsunuz!");
        }
    }
}
