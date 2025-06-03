
import java.io.IOException;
import java.util.Scanner;

public class Ex1060 {

    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);

        double input0 = sc.nextDouble();
        double input1 = sc.nextDouble();
        double input2 = sc.nextDouble();
        double input3 = sc.nextDouble();
        double input4 = sc.nextDouble();
        double input5 = sc.nextDouble();

        int positivos = 0;

        if (input0 > 0) {

            positivos++;

            if (input1 > 0) {
                positivos++;
            }

            if (input2 > 0) {
                positivos++;
            }

            if (input3 > 0) {
                positivos++;
            }

            if (input4 > 0) {
                positivos++;
            }

            if (input5 > 0) {
                positivos++;
            }

        }
        System.out.println(positivos + " valores positivos");

        sc.close();
    }
}
