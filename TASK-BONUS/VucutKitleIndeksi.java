public class VucutKitleIndeksi {

    public static void main(String[] args) {
        
        double kilo = 45.0; 
        double boy = 1.65;  
        
        double vki = kilo / (boy * boy);
        
        System.out.println("----------------------------------------");
        System.out.println("Kilo (kg): " + kilo);
        System.out.println("Boy (m): " + boy);
        System.out.println("----------------------------------------");
        
        System.out.printf("Vücut Kitle İndeksi (VKİ): %.2f%n", vki);
        System.out.println("----------------------------------------");
        
        if (vki < 18.5) {
            System.out.println("Kategori: Zayıf");
        } else if (vki >= 18.5 && vki <= 24.9) {
            System.out.println("Kategori: Normal Kilolu");
        } else if (vki >= 25 && vki <= 29.9) {
            System.out.println("Kategori: Fazla Kilolu");
        } else {
            System.out.println("Kategori: Obez");
        }
        System.out.println("----------------------------------------");
    }
}
----------------------------------------
Kilo (kg): 45.0
Boy (m): 1.65
----------------------------------------
V?cut Kitle ?ndeksi (VK?): 16.53
----------------------------------------
Kategori: Zay?f
----------------------------------------

=== Code Execution Successful ===
