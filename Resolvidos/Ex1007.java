import java.io.IOException;
import java.util.Scanner;

public class Ex1007 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();
        int D = sc.nextInt();
        int prodAB = A * B;
        int prodCD = C * D;

        int DIFERENCA = prodAB - prodCD;

        System.out.println("DIFERENCA = " + DIFERENCA);
        sc.close();
    }
}
