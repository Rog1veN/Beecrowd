import java.io.IOException;
import java.util.Scanner;
import java.lang.Math;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

<<<<<<< HEAD
        String input = sc.nextLine();
        String[] inputVetor = input.split(" ");
        double x1 = Double.parseDouble(inputVetor[0]);
        double y1 = Double.parseDouble(inputVetor[1]);

        String input1 = sc.nextLine();
        String[] inputVetor1 = input1.split(" ");
        double x2 = Double.parseDouble(inputVetor1[0]);
        double y2 = Double.parseDouble(inputVetor1[1]);

        double distancia = ((x2 * x2) - 2 * (x2 * x1) + (x1 * x1)) + ((y2 * y2) - 2 * (y2 * y1) + (y1 * y1));

        double distancia1 = Math.sqrt(distancia);

        System.out.printf("%.4f\n", distancia1);

=======
        double valor = sc.nextDouble();

        System.out.printf("TOTAL = R$ %.2f\n", valor);
>>>>>>> 57087ceafc8a2a81e0ed00930bcecfd465db9228
        sc.close();
    }
}