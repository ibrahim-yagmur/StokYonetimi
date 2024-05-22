public class Magaza {
    private Envanter envanter;

    // TODO YAPICI METOD.
    public Magaza() {
        envanter = new Envanter();

    }

    // TODO YENİ ÜRÜN EKLEME
    public void yeniUrunEkle(String urunKodu, String urunAdi, double urunFiyati, int stokAdedi) {
        Urun yeniUrun = new Urun(urunKodu, urunAdi, urunFiyati, stokAdedi);
        envanter.urunEkle(yeniUrun);


    }

    // TODO STOK GÜNCELLEME.
    public void stokGuncelle(String urunKodu, int yeniStok) {
        envanter.stokGuncelle(urunKodu, yeniStok);


    }

    // TODO ÜRÜN ARAMA METODU.
    public void urunAra(String urunKodu) {
        Urun urun = envanter.urunAra(urunKodu);
        if (urun != null) {
            System.out.println(urun);
        } else {
            System.out.println("ürün bulunamadı: ");

        }
    }

    // TODO ÜRÜNLERİ GÖRÜNTÜLEME METODU.
    public void urunleriGoruntule() {
        envanter.urunleriGoruntule();

    }
}
