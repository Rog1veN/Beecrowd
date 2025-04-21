import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double valor = sc.nextDouble();

        System.out.printf("TOTAL = R$ %.2f\n", valor);
        sc.close();
    }

} 