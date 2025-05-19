import java.io.IOException;
import java.util.Scanner;

public class Ex1046 {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            String[] inputVetor = input.split(" ");
            
            int horaInicial = Integer.parseInt(inputVetor[0]);
            int horaFinal = Integer.parseInt(inputVetor[1]);
            
            if (horaInicial == horaFinal) {
                
                System.out.println("O JOGO DUROU 24 HORA(S)");
                
            }
            if (horaInicial > horaFinal) {
                
                System.out.println("O JOGO DUROU "   + ((24 - horaInicial) + (0 + horaFinal))+ " HORA(S)");
                
            }
            
            if  (horaFinal > horaInicial)
            {
                
                System.out.println("O JOGO DUROU "  +  ( horaFinal - horaInicial + " HORA(S)"));
            }       }
    }

}

