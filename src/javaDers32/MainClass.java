package javaDers32;

public class MainClass {
    public static void main(String[] args) {
        int[][] sayilar1 = new int[2][3]; // 2 boyutlu
        int[][][] sayilar2 = new int[2][3][2]; // 2 boyutlu

        sayilar1[0][0] = 5;
        sayilar1[0][1] = 7;
        sayilar1[0][2] = 4;

        sayilar1[1][0] = 10;
        sayilar1[1][1] = 20;
        sayilar1[1][2] = 30;

        System.out.println(sayilar1[0][0]);
        System.out.println(sayilar1[1][1]);
        System.out.println(sayilar1[1][2]);
    }
}
