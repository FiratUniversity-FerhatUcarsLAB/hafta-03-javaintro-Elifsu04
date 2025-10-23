import java.util.ArrayList;
import java.util.List;

public class AlisverisListesi {
    public static void main(String[] args) {
        List<Urun> urunler = new ArrayList<>(); 
        
        urunler.add(new Urun("Elma", 2, 3.5));
        urunler.add(new Urun("Süt", 1, 5.0));
        urunler.add(new Urun("Ekmek", 3, 1.5));
        urunler.add(new Urun("Peynir", 1, 10.0));
        
        System.out.println("----------------------------------------");
        System.out.printf("%-15s %-10s %-10s%n", "Ürün", "Miktar", "Fiyat");
        System.out.println("----------------------------------------");

        for (Urun urun : urunler) {
            System.out.printf("%-15s %-10d %-10.2f%n", urun.ad, urun.miktar, urun.fiyat);
        }
    }
} 

class Urun { 
    String ad;
    int miktar;
    double fiyat;

    Urun(String ad, int miktar, double fiyat) {
        this.ad = ad;
        this.miktar = miktar;
        this.fiyat = fiyat;
    } 
}
----------------------------------------
?r?n            Miktar     Fiyat     
----------------------------------------
Elma            2          3.50      
S?t             1          5.00      
Ekmek           3          1.50      
Peynir          1          10.00     

=== Code Execution Successful ===
