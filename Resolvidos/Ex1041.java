import java.io.IOException;
import java.util.Scanner;

public class Ex1041 {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            String[] inputVetor = input.split(" ");
            
            double x = Double.parseDouble(inputVetor[0]);
            
            double y = Double.parseDouble(inputVetor[1]);
            
            if (x == 0.0 && y == 0) {
                
                System.out.println("Origem");
                
            } else if (x == 0.0) {
                
                System.out.println("Eixo Y");
                
            }
            
            else if (y == 0.0) {
                
                System.out.println("Eixo X");
                
            }
            
            else if (x > 0.0 && y > 0.0) {
                
                System.out.println("Q1");
                
            } else if (x > 0.0 && y < 0.0) {
                
                System.out.println("Q4");
                
            } else if (x < 0.0 && y < 0.0) {
                
                System.out.println("Q3");
                
            } else if (x < 0.0 && y > 0.0) {
                
                System.out.println("Q2");
                
            }
        }
    }
}