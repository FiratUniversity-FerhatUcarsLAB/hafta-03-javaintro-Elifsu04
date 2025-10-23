public class SaniyeDonusumu {

    public static void main(String[] args) {
        
        int toplamSaniye = 4660; 

        int saat = toplamSaniye / 3600; 
        
        int kalanSaniye = toplamSaniye % 3600; 
        
        int dakika = kalanSaniye / 60;
        
        int saniye = kalanSaniye % 60;
        
        
        System.out.println("---------------------------------");
        System.out.println("Toplam Saniye: " + toplamSaniye);
        System.out.printf("Saat:Dakika:Saniye = %d:%02d:%02d%n", saat, dakika, saniye);
        System.out.println("---------------------------------");
    }
}
---------------------------------
Toplam Saniye: 4660
Saat:Dakika:Saniye = 1:17:40
---------------------------------

=== Code Execution Successful ===
