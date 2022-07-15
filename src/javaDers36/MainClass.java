package javaDers36;

public class MainClass {
    public static void main(String[] args) {

        for (int i = 0; i < 10; i++) {
            System.out.println("Merhaba " + i);
        }

        for (int i = 10; i > 0; i--) {
            System.out.println("Hello " + i);
        }

        String[] isimler = {"Ali", "Veli", "Gokhan", "Ahmet", "Mehmet"};

        for (int i = isimler.length-1; i >= 0 ; i--) {
            System.out.println(isimler[i]);

        }
    }
}
