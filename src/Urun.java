public class Urun {
    private String urunKodu;
    private String urunAdi;
    private double urunFiyati;
    private int stokAdedi;

    public String getUrunKodu() {
        return urunKodu;
    }

    public void setUrunKodu(String urunKodu) {
        this.urunKodu = urunKodu;
    }

    public String getUrunAdi() {
        return urunAdi;
    }

    public void setUrunAdi(String urunAdi) {
        this.urunAdi = urunAdi;
    }

    public double getUrunFiyati() {
        return urunFiyati;
    }

    public void setUrunFiyati(double urunFiyati) {
        this.urunFiyati = urunFiyati;
    }

    public int getStokAdedi() {
        return stokAdedi;
    }

    public void setStokAdedi(int stokAdedi) {
        this.stokAdedi = stokAdedi;
    }

    Urun(String urunKodu, String urunAadi, double urunFiyati, int stokAdedi) {
        this.urunKodu = urunKodu;
        this.urunAdi = urunAadi;
        this.urunFiyati = urunFiyati;
        this.stokAdedi = stokAdedi;


    }

    @Override
    public String toString() {
        return "Urun{" +
                "urunKodu=" + urunKodu +
                ", urunAadi='" + urunAdi + '\'' +
                ", urunFiyati=" + urunFiyati +
                ", stokAdedi=" + stokAdedi +
                '}';
    }
}
