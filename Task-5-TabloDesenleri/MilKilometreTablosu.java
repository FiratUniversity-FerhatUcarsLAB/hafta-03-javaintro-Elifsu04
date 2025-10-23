public class DonusumTablosu {

    private static final double KM_ORANI = 1.609;

    public static void main(String[] args) {
        
        int[] milDegerleri = {1, 5, 10, 20, 50};
        
        System.out.println("-------------------------");
        System.out.printf("%-10s | %-10s%n", "Mil", "Kilometre");
        System.out.println("-------------------------");
        
        for (int mil : milDegerleri) {
            
            double kilometre = mil * KM_ORANI;
            
            System.out.printf("%-10d | %-10.3f%n", mil, kilometre);
        }
        
        System.out.println("-------------------------");
    }
}
-------------------------
Mil        | Kilometre 
-------------------------
1          | 1.609     
5          | 8.045     
10         | 16.090    
20         | 32.180    
50         | 80.450    
-------------------------

=== Code Execution Successful ===
