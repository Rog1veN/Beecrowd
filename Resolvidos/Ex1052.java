
import java.io.IOException;
import java.util.Scanner;

public class Ex1052 {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {

            Double test3 = (1000 * 0.08);

            Double salario = sc.nextDouble();

            if (salario >= 0.00 && salario <= 2000.00) {

                System.out.println("Isento");
            
            } else if (salario >= 2000.01 && salario <= 3000.00) {

                System.out.printf("R$ %.2f\n", (salario - 2000) * 0.08);

            } else if (salario >= 3000.01 && salario <= 4500.00) {

                Double test2 = test3 + (salario - 3000) * 0.18;

                System.out.printf("R$ %.2f\n", test2);

            } else {

                Double part1 = test3 + 1500 * 0.18;
                Double part2 = part1 + (salario - 4500) * 0.28;

                System.out.printf("R$ %.2f\n", part2);

            }
        }
        {

        }

    }
}
