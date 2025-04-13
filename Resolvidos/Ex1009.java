import java.io.IOException;
import java.util.Scanner;

public class Ex1009 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String Vendedor = sc.nextLine();
        double Salario = sc.nextDouble();
        double Vendas = sc.nextDouble();

        double TOTAL = (Salario + Vendas * 0.15);

        System.out.printf("TOTAL = R$ %.2f\n", TOTAL);
        sc.close();
    }

}