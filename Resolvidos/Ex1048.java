
import java.io.IOException;
import java.util.Scanner;

public class Ex1048 {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            String[] inputVetor = input.split(" ");

            double salario = Double.parseDouble(inputVetor[0]);

            if (salario <= 400.00 && salario >= 0.00) {

                System.out.printf("Novo salario: %.2f\n", (salario + (salario * 0.15)));
                System.out.printf("Reajuste ganho: %.2f\n", (salario * 0.15));
                System.out.println("Em percentual: 15 %");
            }

            else if (salario > 400.00 && salario <= 800.00) {

                System.out.printf("Novo salario: %.2f\n", (salario + (salario * 0.12)));
                System.out.printf("Reajuste ganho: %.2f\n", (salario * 0.12));
                System.out.println("Em percentual: 12 %");
            }

            else if (salario > 800.00 && salario <= 1200.00) {

                System.out.printf("Novo salario: %.2f\n", (salario + (salario * 0.10)));
                System.out.printf("Reajuste ganho: %.2f\n", (salario * 0.10));
                System.out.println("Em percentual: 10 %");
            }

            else if (salario > 1200.00 && salario <= 2000.00) {

                System.out.printf("Novo salario: %.2f\n", (salario + (salario * 0.07)));
                System.out.printf("Reajuste ganho: %.2f\n", (salario * 0.07));
                System.out.println("Em percentual: 7 %");

            } 
            else {

                System.out.printf("Novo salario: %.2f\n", (salario + (salario * 0.04)));
                System.out.printf("Reajuste ganho: %.2f\n", (salario * 0.04));
                System.out.println("Em percentual: 4 %");
            }
        }

    }

}
