import java.util.ArrayList;
import java.util.List;

public class Envanter {
    private List<Urun> urunListesi;


    Envanter() {
        urunListesi = new ArrayList<>();

    }

    // TODO ÜRÜN EKLEME METODU
    public void urunEkle(Urun urun) {
        urunListesi.add(urun);


    }

    // TODO STOK GÜNCELLEME METODU
    public void stokGuncelle(String urunKodu, int yeniStok) {


    }

    // TODO ÜRÜN ARAMA METODU
    public Urun urunAra(String urunKodu) {

        return null;

    }

    // TODO ÜRÜN GÖRÜNTÜLEME METODU.
    public void urunleriGoruntule() {
        for (Urun urun : urunListesi) {
            System.out.println(urun);
        }

    }


}
