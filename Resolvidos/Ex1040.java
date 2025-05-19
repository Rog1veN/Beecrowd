import java.io.IOException;
import java.util.Scanner;

public class Ex1040 {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            String[] inputVetor = input.split(" ");
            
            double n1 = Double.parseDouble(inputVetor[0]);
            
            double n2 = Double.parseDouble(inputVetor[1]);
            
            double n3 = Double.parseDouble(inputVetor[2]);
            
            double n4 = Double.parseDouble(inputVetor[3]);
            
            double media = ((n1 * 2 + n2 * 3 + n3 * 4 + n4 * 1) / 10);
            
            if (media == 4.85) {
                
                System.out.printf("Media: %.1f\n", media - 0.1);
                System.out.println("Aluno reprovado.");
            }
            
            else if (media <= 4.9) {
                
                System.out.printf("Media: %.1f\n", media);
                System.out.println("Aluno reprovado.");
            }
            
            else if (media >= 7.0) {
                
                System.out.printf("Media: %.1f\n", media);
                System.out.println("Aluno aprovado.");

            }
            
            else {
                
                System.out.printf("Media: %.1f\n", media);
                System.out.println("Aluno em exame.");
                
                double exame = sc.nextDouble();
                
                System.out.printf("Nota do exame: %.1f\n", exame);
                
                double mediaFinal = (media + exame) / 2;
                
                if (mediaFinal >= 5.0) {
                    
                    System.out.println("Aluno aprovado.");
                    System.out.printf("Media final: %.1f\n", mediaFinal);
                }
                else {
                    
                    System.out.println("Aluno reprovado.");
                    System.out.printf("Media final: %.1f\n", mediaFinal);
                }
                
            }
        }

 }
}