
import java.io.IOException;
import java.util.Scanner;

public class Ex1044 {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            String[] inputVetor = input.split(" ");
            
            int B = Integer.parseInt(inputVetor[0]);
            
            int A = Integer.parseInt(inputVetor[1]);
            
            
            
            if (A % B == 0 || B % A == 0) {
                
                System.out.println("Sao Multiplos");
                
            }
            else {
                
                System.out.println("Nao sao Multiplos");
            }
        }

    }

}            