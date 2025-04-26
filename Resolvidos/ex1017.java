import java.io.IOException;
import java.util.Scanner;

public class ex1017 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int tempoViagem = sc.nextInt();
        int velMedia = sc.nextInt();

        double km = (double) tempoViagem * velMedia;

        System.out.printf("%.3f\n", km / 12);

        sc.close();
    }

}
