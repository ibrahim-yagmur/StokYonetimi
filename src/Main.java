import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Magaza magaza = new Magaza();
        Scanner scanner = new Scanner(System.in);
        int secin = 0;

        while (secin != 5) {
            System.out.println("1. Yeni Ürün Ekle: ");
            System.out.println("2. Stok güncelle: ");
            System.out.println("3. Ürün Ara: ");
            System.out.println("4. Ürünleri Görüntüle: ");
            System.out.println("5. Çıkış: ");
            System.out.println("seçiminiz: ");
            secin = scanner.nextInt();


            switch (secin) {
                case 1:
                    System.out.print("Ürün kodu: ");
                    String urunkodu = scanner.next();

                    System.out.print("Ürün Adı: ");
                    String urunAdi = scanner.next();

                    System.out.print("Ürün Fiyatı: ");
                    double urunFiyati = scanner.nextDouble();

                    System.out.print("Stok: ");
                    int stok = scanner.nextInt();
                    magaza.yeniUrunEkle(urunkodu, urunAdi, urunFiyati, stok);
                    break;
                case 2:
                    System.out.print("Stok u Güncellencek Ürün Kodu");
                    urunkodu = scanner.next();

                    System.out.print("Yeni Stok: ");
                    int yeniStok = scanner.nextInt();

                    magaza.stokGuncelle(urunkodu, yeniStok);
                    break;
                case 3:
                    System.out.print("Aranacak Ürün Kodu: ");
                    urunkodu = scanner.next();
                    magaza.urunAra(urunkodu);
                    break;
                case 4:
                    magaza.urunleriGoruntule();
                    break;
                case 5:
                    System.out.println("Çıkış Yapılıyor... ");
                    break;
                default:
                    System.out.println("Seçim Bulunamadı: ");


            }
        }

    }
}