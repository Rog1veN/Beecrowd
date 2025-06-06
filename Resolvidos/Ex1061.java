
import java.io.IOException;
import java.util.Scanner;

public class Ex1061{

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            String input = sc.nextLine();
            String input1 = sc.nextLine();
            String input2 = sc.nextLine();
            String input3 = sc.nextLine();

            String[] inputVetor = input.split(" ");
            String[] inputVetor1 = input1.split(" ");
            String[] inputVetor2 = input2.split(" ");
            String[] inputVetor3 = input3.split(" ");

            int vetorDia1 = Integer.parseInt(inputVetor[1]);
            int vetorHora1 = Integer.parseInt(inputVetor1[0]);
            int vetorMin1 = Integer.parseInt(inputVetor1[2]);
            int vetorSeg1 = Integer.parseInt(inputVetor1[4]);

            int vetorDia2 = Integer.parseInt(inputVetor2[1]);
            int vetorHora2 = Integer.parseInt(inputVetor3[0]);
            int vetorMin2 = Integer.parseInt(inputVetor3[2]);
            int vetorSeg2 = Integer.parseInt(inputVetor3[4]);

            int daySeg1 = vetorDia1 * 86400;
            int daySeg2 = vetorDia2 * 86400;

            int horaSeg1 = vetorHora1 * 3600;
            int minSeg1 = vetorMin1 * 60;

            int horaSeg2 = vetorHora2 * 3600;
            int minSeg2 = vetorMin2 * 60;

            int totalSeg1 = daySeg1 + horaSeg1 + minSeg1 + vetorSeg1;

            int totalSeg2 = daySeg2 + horaSeg2 + minSeg2 + vetorSeg2;

            int dif = totalSeg2 - totalSeg1;

            int totalDia = dif / 86400;
            int totalHora = (dif % 86400) / 3600;
            int totalMin = (dif % 86400) % 3600 / 60;
            int totalSeg = (dif % 86400) % 3600 % 60;

            System.out.println(totalDia + " dia(s)");
            System.out.println(totalHora + " hora(s)");
            System.out.println(totalMin + " minuto(s)");
            System.out.println(totalSeg + " segundo(s)");

        }
    }
}
