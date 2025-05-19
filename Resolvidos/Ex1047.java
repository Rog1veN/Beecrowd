
import java.io.IOException;
import java.util.Scanner;

public class Ex1047 {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            String[] inputVetor = input.split(" ");

            int horaInicial = Integer.parseInt(inputVetor[0]);
            int minutoInicial = Integer.parseInt(inputVetor[1]);
            int horaFinal = Integer.parseInt(inputVetor[2]);
            int minutoFinal = Integer.parseInt(inputVetor[3]);

            if (horaInicial == horaFinal && horaInicial == minutoInicial && minutoInicial == minutoFinal) {

                System.out.println("O JOGO DUROU 24 HORA(S) E 0 MINUTO(S)");

            }
            if (horaInicial > horaFinal && minutoInicial > minutoFinal) {

                System.out.println("O JOGO DUROU " + ((23 - horaInicial) + (0 + horaFinal)) + " HORA(S) E " + (60 + minutoFinal - minutoInicial) + " MINUTO(S)");

            }

            if (horaFinal > horaInicial && minutoFinal > minutoInicial) {

                System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S) E " + (minutoFinal - minutoInicial) + " MINUTO(S)");
            }

            if (horaInicial > horaFinal && minutoFinal > minutoInicial) {

                System.out.println("O JOGO DUROU " + ((24 - horaInicial) + (0 + horaFinal)) + " HORA(S) E " + (minutoFinal - minutoInicial) + " MINUTO(S)");
            }

            if (horaFinal > horaInicial && minutoFinal < minutoInicial) 
                //// aqui está o problema, por mais que a hora mude, não chega a dar 1 hora
            {
           
                System.out.println("O JOGO DUROU " + ((horaFinal - 1) - horaInicial) + " HORA(S) E " + (60 + minutoFinal - minutoInicial) + " MINUTO(S)");
            }

            if (horaFinal == horaInicial && minutoFinal > minutoInicial) {

                System.out.println("O JOGO DUROU " + (horaFinal - horaInicial) + " HORA(S) E " + (minutoFinal - minutoInicial) + " MINUTO(S)");
            }

            if (horaFinal == horaInicial && minutoFinal < minutoInicial) {

                System.out.println("O JOGO DUROU " + (23 + horaInicial - horaFinal) + " HORA(S) E " + (60 + minutoFinal - minutoInicial) + " MINUTO(S)");
            }

        }
    }
}
