package javaDers34;

public class MainClass {
    public static void main(String[] args) {
        /*int sayi = 1;
        while (sayi < 10) {
            System.out.println(sayi);
            sayi++;
        }

        System.out.println("Alt satir");*/

        String[] isimler = {"Hamza", "Mehmet", "Sefa", "Bartu", "Ahmet", "Ayse"};

        int index = 0;

        while (index < isimler.length) {
            if (isimler[index].equals("Ayse")) {
                System.out.println("Ayse listede var.");
            }
            index++;
        }
    }
}
