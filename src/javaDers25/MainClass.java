package javaDers25;

public class MainClass {
    public static void main(String[] args) {
        String cinsiyet = "Kadin";
        int yas = 15;

        if (cinsiyet.equals("Erkek")) {
            if (yas >= 20) {
                System.out.println("Askere gitmelisin!");
            }else {
                System.out.println("Askerlik yasindan kucuksun!");
            }
        }else {
            System.out.println("Erkek olmadigin icin askere gitmeyeceksin!");
        }
    }
}
