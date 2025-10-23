import java.util.HashMap;
import java.util.Map;

public class TlParaBozma {
    
    public static Map<Integer, Integer> bozukParaVer(int miktarBozulacak) {
        int[] paraBirimleriKrş = {
            20000,  
            10000,  
            5000,   
            2000,   
            1000,   
            500,    
            100,    
            50,     
            25,     
            10,     
            5,      
            1       
        };

        Map<Integer, Integer> paraSayilari = new HashMap<>();

        int kalanMiktar = miktarBozulacak;

        for (int deger : paraBirimleriKrş) {
            if (kalanMiktar >= deger) {
                int adet = kalanMiktar / deger;

                if (adet > 0) {
                    paraSayilari.put(deger, adet);
                }

                kalanMiktar %= deger;
            }
            if (kalanMiktar == 0) {
                break;
            }
        }

        return paraSayilari;
    }

    private static String formatKrşDegeri(int kuruş) {
        if (kuruş >= 100) {
            return (kuruş / 100) + " TL";
        } else {
            return kuruş + " Kuruş";
        }
    }

    public static void main(String[] args) {
        int miktarTL = 278; 
        int miktarKurus = miktarTL * 100;

        Map<Integer, Integer> bozmaSonucu = bozukParaVer(miktarKurus);

        System.out.println("--- " + miktarTL + " TL için Para Bozma Sonucu (En Az Adet) ---");
        
        int[] siraliDegerler = {20000, 10000, 5000, 2000, 1000, 500, 100, 50, 25, 10, 5, 1};
        int toplamAdet = 0;

        for (int deger : siraliDegerler) {
            if (bozmaSonucu.containsKey(deger)) {
                int adet = bozmaSonucu.get(deger);
                toplamAdet += adet;
                
                System.out.println(formatKrşDegeri(deger) + ": " + adet + " adet");
            }
        }
        
        System.out.println("-------------------------------------------------");
        System.out.println("Kullanılan Toplam Para Birimi (Banknot + Madeni Para) Adedi: " + toplamAdet);
    }
}
-- 278 TL i?in Para Bozma Sonucu (En Az Adet) ---
200 TL: 1 adet
50 TL: 1 adet
20 TL: 1 adet
5 TL: 1 adet
1 TL: 3 adet
-------------------------------------------------
Kullan?lan Toplam Para Birimi (Banknot + Madeni Para) Adedi: 7

=== Code Execution Successful ===
