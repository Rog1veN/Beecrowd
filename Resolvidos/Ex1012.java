import java.io.IOException;
import java.util.Scanner;

public class Ex1012 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputVetor = input.split(" ");

        double A = Double.parseDouble(inputVetor[0]);
        double B = Double.parseDouble(inputVetor[1]);
        double C = Double.parseDouble(inputVetor[2]);

        double soma = A + B;

        System.out.printf("TRIANGULO: %.3f\n", A * C / 2);
        System.out.printf("CIRCULO: %.3f\n", C * C * 3.14159);
        System.out.printf("TRAPEZIO: %.3f\n", soma * C / 2);
        System.out.printf("QUADRADO: %.3f\n", B * B);
        System.out.printf("RETANGULO: %.3f\n", A * B);
        sc.close();
    }

}
