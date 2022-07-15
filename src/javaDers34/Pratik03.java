package javaDers34;

public class Pratik03 {
    public static void main(String[] args) {
        int[] array = {20, 50, 60, 70};
        int count = 0;
        int sum = 0;
        while (count < array.length) {
            sum+= array[count];
            count++;
        }
        System.out.println("Toplam " + sum);
     }
}
