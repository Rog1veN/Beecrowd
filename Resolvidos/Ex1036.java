import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Ex1036 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputVetor = input.split(" ");

        double A = Double.parseDouble(inputVetor[0]);

        double B = Double.parseDouble(inputVetor[1]);

        double C = Double.parseDouble(inputVetor[2]);

        double delta = (B * B) - (4 * A * C);

        if (A == 0.0 || delta < 0) {

            System.out.println("Impossivel calcular");

            System.exit(0);
        }

        double xisum = (-B + Math.sqrt(delta)) / (2 * A);

        double xisdois = (-B - Math.sqrt(delta)) / (2 * A);

        System.out.printf("R1 = %.5f\n", xisum);

        System.out.printf("R2 = %.5f\n", xisdois);

        sc.close();

    }
}
