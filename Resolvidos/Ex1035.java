import java.io.IOException;
import java.util.Scanner;

public class Ex1035 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputVetor = input.split(" ");

        double A = Double.parseDouble(inputVetor[0]);

        double B = Double.parseDouble(inputVetor[1]);

        double C = Double.parseDouble(inputVetor[2]);

        double D = Double.parseDouble(inputVetor[3]);

        if (B > C && D > A && C + D > A + B && (A % 2 <= 0)) {

            System.out.println("Valores aceitos");

        }

        else {

            System.out.println("Valores nao aceitos");
        }

        sc.close();
    }
}
