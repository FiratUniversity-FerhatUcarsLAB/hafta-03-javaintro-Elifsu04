import java.util.HashMap;
import java.util.Map;

public class ElifsuAsciSanati {

    public static void main(String[] args) {
        String isim = "ELIFSU";
        
        System.out.println("---------------------------------------------------------");
        System.out.println("|           Elifsu'nun ASCII Aşcı Sanatı                |");
        System.out.println("---------------------------------------------------------");

        drawAsciDecoration();
        
        drawAsciName(isim);
        
        drawAsciDecoration();
        
        System.out.println("\nAfiyet Olsun!...");
    }

    private static void drawAsciDecoration() {
        System.out.println("      ()   ()  (~)      * * * _ _ _   * * *");
        System.out.println("     / /   / /  / /       | | |  (O) (O)  | | |");
        System.out.println("    / /   / /  / /       / / /  \\_/  \\ \\ \\");
        System.out.println("   //\\  //\\ //_\\      / / /    | |    \\ \\ \\");
        System.out.println("  (Tencere/Duman)       (Baharat/Sebze Dilimi) ");
    }
    
    private static void drawAsciName(String isim) {
        String E =
            " _____ \n" +
            "|  ___|\n" +
            "| |__  \n" +
            "|  __|\n" +
            "| |___ \n" +
            "|_|";
        
        String L = 
            " _     \n" +
            "| |    \n" +
            "| |    \n" +
            "| |    \n" +
            "| |___ \n" +
            "|_|";
            
        String I = 
            " _____ \n" +
            "|_   _|\n" +
            "  | |  \n" +
            "  | |  \n" +
            " | | \n" +
            "|_|";
            
        String F =
            " ______ \n" +
            "|  ____|\n" +
            "| |__   \n" +
            "|  __|  \n" +
            "| |     \n" +
            "|_|     ";
            
        String S =
            " _____ \n" +
            "/ ____|\n" +
            "| (___  \n" +
            " \\___ \\ \n" +
            " ____) |\n" +
            "|_/ ";
            
        String U =
            " _    _ \n" +
            "| |  | |\n" +
            "| |  | |\n" +
            "| |  | |\n" +
            "| || |\n" +
            " \\/ ";

        Map<Character, String> harfMap = new HashMap<>();
        harfMap.put('E', E);
        harfMap.put('L', L);
        harfMap.put('I', I);
        harfMap.put('F', F);
        harfMap.put('S', S);
        harfMap.put('U', U);

        String[] eSatir = E.split("\n");
        String[] lSatir = L.split("\n");
        String[] iSatir = I.split("\n");
        String[] fSatir = F.split("\n");
        String[] sSatir = S.split("\n");
        String[] uSatir = U.split("\n");

        int satirSayisi = eSatir.length;

        for (int i = 0; i < satirSayisi; i++) {
            StringBuilder satir = new StringBuilder();
            
            satir.append(eSatir[i]).append("   ");
            satir.append(lSatir[i]).append("   ");
            satir.append(iSatir[i]).append("   ");
            satir.append(fSatir[i]).append("   ");
            satir.append(sSatir[i]).append("   ");
            satir.append(uSatir[i]);

            System.out.println(satir.toString());
        }
    }
}
---------------------------------------------------------
|           Elifsu'nun ASCII A?c? Sanat?                |
---------------------------------------------------------
      ()   ()  (~)      * * * _ _ _   * * *
     / /   / /  / /       | | |  (O) (O)  | | |
    / /   / /  / /       / / /  \_/  \ \ \
   //\  //\ //_\      / / /    | |    \ \ \
  (Tencere/Duman)       (Baharat/Sebze Dilimi) 
 _____     _         _____     ______     _____     _    _ 
|  ___|   | |       |_   _|   |  ____|   / ____|   | |  | |
| |__     | |         | |     | |__      | (___     | |  | |
|  __|   | |         | |     |  __|      \___ \    | |  | |
| |___    | |___     | |    | |         ____) |   | || |
|_|   |_|   |_|   |_|        |_/     \/ 
      ()   ()  (~)      * * * _ _ _   * * *
     / /   / /  / /       | | |  (O) (O)  | | |
    / /   / /  / /       / / /  \_/  \ \ \
   //\  //\ //_\      / / /    | |    \ \ \
  (Tencere/Duman)       (Baharat/Sebze Dilimi) 

Afiyet Olsun!...

=== Code Execution Successful ===
