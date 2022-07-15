package javaDers36;

public class Pratik04 {
    public static void main(String[] args) {
        String[] array = {"Hamza", "Ali", "Hamza", "Ahmet", "Ahmet", "Ahmet", "Ali",  "Ayse"};
        String okunanIsimler = "";

        for (int i = 0; i < array.length ; i++) {
            if (!okunanIsimler.contains(array[i])) {
                int sayi = 1;
                for (int j = i +1; j < array.length; j++) {
                    if (array[i].equals(array[j])) {
                        sayi++;
                    }
                }
                System.out.println(array[i] + " : " + sayi);
                okunanIsimler+= array[i];
            }
        }
    }
}
