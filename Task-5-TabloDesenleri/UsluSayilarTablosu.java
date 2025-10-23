public class UsluSayilarTablosu {

    public static void main(String[] args) {
        
        System.out.println("---------------------------------------");
        System.out.printf("%-10s | %-10s | %-10s%n", "a", "a^2", "a^3");
        System.out.println("---------------------------------------");
        
        for (int a = 1; a <= 5; a++) {

            double aKare = Math.pow(a, 2); 
            
            double aKup = Math.pow(a, 3);
            
            System.out.printf("%-10d | %-10.0f | %-10.0f%n", a, aKare, aKup);
        }
        
        System.out.println("---------------------------------------");
    }
}
---------------------------------------
a          | a^2        | a^3       
---------------------------------------
1          | 1          | 1         
2          | 4          | 8         
3          | 9          | 27        
4          | 16         | 64        
5          | 25         | 125       
---------------------------------------

=== Code Execution Successful ===
