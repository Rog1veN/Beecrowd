import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double Codigo = sc.nextDouble();
        double Numero = sc.nextDouble();
        double Valor = sc.nextDouble();

        double TOTAL = (Salario + Vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", TOTAL);
        sc.close();
    }

} 