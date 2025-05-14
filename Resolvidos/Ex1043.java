
import java.io.IOException;
import java.util.Scanner;

public class Ex1043 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputVetor = input.split(" ");

        double A = Double.parseDouble(inputVetor[0]);

        double B = Double.parseDouble(inputVetor[1]);

        double C = Double.parseDouble(inputVetor[2]);

        if (A < B + C && B < A + C && C < A + B) {

            System.out.println("Perimetro = "  +  (A + B + C));

        } 
        else {

            System.out.println("Area = " + ((A + B) * C)/2);
        }
      
        sc.close();

    }

}            