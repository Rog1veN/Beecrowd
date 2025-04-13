import java.io.IOException;
import java.util.Scanner;

public class Ex1016 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int Distancia = sc.nextInt();
        
        int TEMPO = (Distancia * 2);

        System.out.println(TEMPO + " minutos");
        sc.close();
    }

}