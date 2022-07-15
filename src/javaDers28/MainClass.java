package javaDers28;

public class MainClass {
    public static void main(String[] args) {
        int gun = 3;

        switch (gun) {
            case 1 -> System.out.println("pazartesi");
            case 2 -> System.out.println("sali");
            case 3 -> System.out.println("carsamba");
            case 4 -> System.out.println("persembe");
            case 5 -> System.out.println("cuma");
            case 6 -> System.out.println("cumartesi");
            case 7 -> System.out.println("pazar");
            default -> System.out.println("yanlis sayi");
        }
    }
}
