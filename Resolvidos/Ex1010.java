import java.io.IOException;
import java.util.Scanner;

public class Ex1010 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String peca1 = sc.nextLine();
        String[] peca1Vetor = peca1.split(" ");

        int codigo = Integer.parseInt(peca1Vetor[0]);
        int numero = Integer.parseInt(peca1Vetor[1]);
        double valor = Double.parseDouble(peca1Vetor[2]);
        double total = numero * valor;

        String peca2 = sc.nextLine();
        String[] peca2Vetor = peca2.split(" ");

        int codigo2 = Integer.parseInt(peca2Vetor[0]);
        int numero2 = Integer.parseInt(peca2Vetor[1]);
        double valor2 = Double.parseDouble(peca2Vetor[2]);
        double total2 = numero2 * valor2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total + total2);
        sc.close();
    }

}
