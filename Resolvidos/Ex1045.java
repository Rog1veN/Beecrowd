
import java.io.IOException;
import java.util.Scanner;

public class Ex1045 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputVetor = input.split(" ");

        double A = Double.parseDouble(inputVetor[0]);

        double B = Double.parseDouble(inputVetor[1]);

        double C = Double.parseDouble(inputVetor[2]);

        if (A >= B && A >= C) {

            if (A >= B + C) {
                System.out.println("NAO FORMA TRIANGULO");

                System.exit(0);
            }

            if ((A * A) == (B * B) + (C * C)) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if ((A * A) > (B * B) + (C * C)) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if ((A * A) < (B * B) + (C * C)) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (A == B && B == C && C == A) {
                System.out.println("TRIANGULO EQUILATERO");
            }
           
            if ((A == B && A != C) || (A == C && A != B) || (B == C && A != C)) {
                
                System.out.println("TRIANGULO ISOSCELES");
            }   

        
        } else if (B >= A && B >= C) {

            if (B >= A + C) {
                System.out.println("NAO FORMA TRIANGULO");

                System.exit(0);

            }

            if (B * B == A * A + C * C) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (B * B > A * A + C * C) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if (B * B < A * A + C * C) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (B == A && A == C && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }
           
            if ((A == B && A != C) || (A == C && A != B) || (B == C && A != C)) {
                
                System.out.println("TRIANGULO ISOSCELES");
            }   
            
                
        } else if (C >= B && C >= A) {

            if (C >= A + B) {
                System.out.println("NAO FORMA TRIANGULO");

                System.exit(0);

            }

            if (C * C == B * B + A * A) {
                System.out.println("TRIANGULO RETANGULO");
            }

            if (C * C > B * B + A * A) {
                System.out.println("TRIANGULO OBTUSANGULO");
            }

            if (C * C < B * B + A * A) {
                System.out.println("TRIANGULO ACUTANGULO");
            }

            if (B == A && A == C && B == C) {
                System.out.println("TRIANGULO EQUILATERO");
            }

            if ((A == B && A != C) || (A == C && A != B) || (B == C && A != C)) {
                System.out.println("TRIANGULO ISOSCELES");
            }
            
        }

        sc.close();

    }

}
