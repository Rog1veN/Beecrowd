import java.io.IOException;
import java.util.Scanner;

public class Ex1008 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double NUMBER = sc.nextDouble();
        double WH = sc.nextDouble();

        double real = sc.nextDouble();

        System.out.println("NUMBER = " + NUMBER);
        System.out.printf("SALARY = U$ %.2f\n", real * WH);
        sc.close();
    }

}
