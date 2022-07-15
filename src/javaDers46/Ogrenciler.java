package javaDers46;

public class Ogrenciler {
    int ogrenciSayisi = 0;

    void kayitEkle() {
        System.out.println("Yeni kayit eklendi..");
        ogrenciSayisi++;
    }
    void kayitSil() {
        System.out.println("Kayit silindi");
        ogrenciSayisi--;
    }
}
