import java.io.IOException;
import java.util.Scanner;

public class Ex1038 {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            String[] inputVetor = input.split(" ");
            
            int codigo = Integer.parseInt(inputVetor[0]);
            
            int quantidade = Integer.parseInt(inputVetor[1]);
            
            if (codigo == 1) 
            {
                
                System.out.printf("Total: R$ %.2f\n", quantidade * 4.00);
                
            }
            
            else if (codigo == 2) {
                
                System.out.printf("Total: R$ %.2f\n", quantidade * 4.50);
                
            } else if (codigo == 3) {
                
                System.out.printf("Total: R$ %.2f\n", quantidade * 5.00);
                
            } else if (codigo == 4) {
                
                System.out.printf("Total: R$ %.2f\n", quantidade * 2.00);
                
            } else if (codigo == 5) {
                
                System.out.printf("Total: R$ %.2f\n", quantidade * 1.50);
                
            }
        }
    }

}