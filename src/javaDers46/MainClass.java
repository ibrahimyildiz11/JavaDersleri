package javaDers46;

public class MainClass {
    public static void main(String[] args) {

        Araba toyota = new Araba();

        toyota.hiz =280;
        toyota.isim = "toyota";
        System.out.println(toyota.hiz);
        System.out.println(toyota.isim);

        Araba audi = new Araba();
        audi.hiz = 300;
        audi.isim = "audi";
        System.out.println(audi.hiz);
        System.out.println(audi.isim);


        /*HesapMakinesi hesapMakinesi = new HesapMakinesi();
        int toplam = hesapMakinesi.toplama(40, 90);
        int fark = hesapMakinesi.cikarma(40, 90);
        int carpim = hesapMakinesi.carpma(40, 90);
        int bolum = hesapMakinesi.bolme(40, 90);*/


        /*Ogretmen ogretmen1 = new Ogretmen();
        ogretmen1.bilgiYazdir();*/


        /*Kutuphane nesne = new Kutuphane();
        System.out.println(nesne.acilisSaati);
        System.out.println(nesne.kitapSayisi);
        System.out.println(nesne.kapanisSaati);*/

        /*Ogrenciler nesne = new Ogrenciler();
        System.out.println("Ogrenci sayisi : " + nesne.ogrenciSayisi);

        nesne.kayitEkle();
        nesne.kayitEkle();
        nesne.kayitEkle();

        System.out.println("Ogrenci sayisi : " + nesne.ogrenciSayisi);

        nesne.kayitSil();
        nesne.kayitSil();

        System.out.println("Ogrenci sayisi : " + nesne.ogrenciSayisi);*/


    }


}
