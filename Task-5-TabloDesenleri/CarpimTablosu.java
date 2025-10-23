public class CarpimTablosu {

    public static void main(String[] args) {
        
        int carpan = 2;
        int baslangic = 1; 
        int bitis = 10;
        
        System.out.println(carpan + "'nin Çarpım Tablosu (" + baslangic + " - " + bitis + ")");
        System.out.println("---------------------------------");
        
        for (int i = baslangic; i <= bitis; i++) {
            
            int sonuc = carpan * i;
            
            System.out.printf("%d x %-2d = %d%n", carpan, i, sonuc);
        }
        
        System.out.println("---------------------------------");
    }
}
2'nin ?arp?m Tablosu (1 - 10)
---------------------------------
2 x 1  = 2
2 x 2  = 4
2 x 3  = 6
2 x 4  = 8
2 x 5  = 10
2 x 6  = 12
2 x 7  = 14
2 x 8  = 16
2 x 9  = 18
2 x 10 = 20
---------------------------------

=== Code Execution Successful ===
