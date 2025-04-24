import java.io.IOException;
import java.util.Scanner;

public class Ex1011 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double R = sc.nextDouble();

        double pi = (3.14159);

        double VOLUME = ((4 / 3.0) * pi * (R * R * R));

        System.out.printf("VOLUME = %.3f\n", VOLUME);
        sc.close();
    }

}
