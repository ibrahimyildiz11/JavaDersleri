package javaDers34;

import java.util.Scanner;

public class Pratik02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give me a number: ");
        int num = scanner.nextInt();

        int sum = 0;

        System.out.println(num);
        while (num > 0) {
            sum += num % 10;
            num /= 10;
        }

        System.out.println("toplam : " + sum);

    }
}
