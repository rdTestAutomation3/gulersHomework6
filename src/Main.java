public class Main {

    public static void main(String[] args) {
        // Test kelime dizisi
        String[] kelimeDizisi = {"kelam", "okullu", "çiçekçi", "defter", "telefon", "monitor", "klavye", "kozalak"};

        // TekrarlayanHarfKontrol sınıfı örneği oluştur
        tekrarlayanHarfKontrol kontrol = new tekrarlayanHarfKontrol();

        // Tekrarlı harf içeren kelimelerden metin oluştur
        String sonuc = kontrol.tekrarlayanHarfliKelimeleriBulVeBirlestir(kelimeDizisi);
        System.out.println("Oluşturulan metin: '" + sonuc + "'");
    }
}
