import java.io.IOException;
import java.util.Scanner;

public class Ex1037 {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            double input = sc.nextDouble();
            
            if (input < 0 || input > 100.00000) {
                
                System.out.println("Fora de intervalo");
                
                System.exit(0);
            }
            
            else if (input >= 0 && input <= 25.00000) {
                
                System.out.println("Intervalo [0,25]");
            }
            
            else if (input >= 25.00001 && input <= 50.00000) {
                
                System.out.println("Intervalo (25,50]");
            }
            
            else if (input >= 50.00001 && input <= 75.00000) {
                
                System.out.println("Intervalo (50,75]");
            }
            
            else {
                
                System.out.println("Intervalo (75,100]");
            }
        }

    }
}
