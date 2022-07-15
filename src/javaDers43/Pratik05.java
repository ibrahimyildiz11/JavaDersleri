package javaDers43;

public class Pratik05 {
    public static void main(String[] args) {
        String sifre = "ADERe12";
        System.out.println("Girilen sifrenin sonucu : " + checkPassword(sifre));
    }

    public static boolean checkPassword (String sifre) {
        boolean buyukHarfVarMi = false;
        boolean kucukHarfVarMi = false;
        boolean rakamVarMi = false;
        for (int i = 0; i < sifre.length(); i++) {
            if (sifre.charAt(i) >= '0' && sifre.charAt(i) <= '9') {
                rakamVarMi = true;
            } else if (sifre.charAt(i) >= 'A' && sifre.charAt(i) <= 'Z') {
                buyukHarfVarMi = true;
            }else if (sifre.charAt(i) >= 'a' && sifre.charAt(i) <='z') {
                kucukHarfVarMi = true;
            }
        }

        boolean sonuc = buyukHarfVarMi && kucukHarfVarMi && rakamVarMi;
        return sonuc;
    }
}
