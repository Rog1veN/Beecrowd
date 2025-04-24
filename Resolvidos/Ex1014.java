import java.io.IOException;
import java.util.Scanner;

public class Ex1014 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double X = sc.nextInt();
        double Y = sc.nextDouble();
        double km = X / Y;

        System.out.printf("%.3f km/l\n", km);
        sc.close();
    }

}