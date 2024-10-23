import java.util.*;

public class tekrarlayanHarfKontrol {

    // Bir kelimede tekrar eden harf olup olmadığını kontrol eden metod
    public boolean tekrarlayanHarfVarMi(String kelime) {
        Set<Character> gorulenHarfler = new HashSet<>();
        //set ve hashset ile tekrarlı harfleri kontrol edelim
        for (char c : kelime.toCharArray()) {
            if (!gorulenHarfler.add(c)) {
                return true;
            }
        }
        //görülen harfleri de dizinin içine ekleyelim
        return false;
    }

    // Tekrarlı harfleri olan kelimeleri bulup, harflerini karıştıran metod
    public String tekrarlayanHarfliKelimeleriBulVeBirlestir(String[] kelimeler) {
        //bılunan kelimeleri yeni bir listeye ekleyelim
        List<String> bulunanKelimeler = new ArrayList<>();
        for (String kelime : kelimeler) {
            if (tekrarlayanHarfVarMi(kelime)) {
                bulunanKelimeler.add(kelime);

            }
            if (bulunanKelimeler.size() == 2) {
                System.out.println("Tekrar eden harf içeren kelimeler: "+ bulunanKelimeler);
                break;

            }
        }
        if (bulunanKelimeler.size() < 2) {
            return "Yeterli kelime bulunamadı.";
        }

        // Kelimelerin harflerini birleştirip karıştıralım
        String birlesik = bulunanKelimeler.get(0) + bulunanKelimeler.get(1);
        List<Character> harfler = new ArrayList<>();
        for (char c : birlesik.toCharArray()) {
            harfler.add(c);
        }
        // Harfleri karıştırıyoruz
        Collections.shuffle(harfler);

        // Karışık harflerden yeni metin oluşturuyoruz
        StringBuilder sonuc = new StringBuilder();
        for (char c : harfler) {
            sonuc.append(c);
        }
        return sonuc.toString();
    }
}
