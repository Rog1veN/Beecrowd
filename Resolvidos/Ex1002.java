import java.io.IOException;
import java.util.Scanner;

public class Ex1002 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double N = 3.14159;

        double raio = sc.nextDouble();

        double area = N * (raio * raio);

        System.out.printf("A=%.4f\n", area);
        sc.close();
    }

}