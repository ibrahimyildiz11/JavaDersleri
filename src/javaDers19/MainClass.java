package javaDers19;

public class MainClass {
    public static void main(String[] args) {
        String diller = "ingilizce, fransizca, ispanyolca, turkce";

        String dil1 = diller.substring(0,9);
        String dil2 = diller.substring(11,20);
        String dil3 = diller.substring(22,32);
        String dil4 = diller.substring(34,40);

        System.out.println(dil1);
        System.out.println(dil2);
        System.out.println(dil3);
        System.out.println(dil4);

        System.out.println(diller.substring(0));
        System.out.println(diller.substring(13));
    }
}
