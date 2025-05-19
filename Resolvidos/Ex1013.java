import java.io.IOException;
import java.util.Scanner;

public class Ex1013 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputVetor = input.split(" ");

        int A = Integer.parseInt(inputVetor[0]);
        int B = Integer.parseInt(inputVetor[1]);
        int C = Integer.parseInt(inputVetor[2]);

        if (A >= B && A >= C) {

            System.out.println(A + " eh o maior");
        }

        else if (B >= A && B >= C) {

            System.out.println(B + " eh o maior");
        
        } else {

            System.out.println(C + " eh o maior");
        }
        sc.close();
    }

}
