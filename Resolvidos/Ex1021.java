import java.io.IOException;
import java.util.Scanner;

public class Ex1021 {

    public static void main(String[] args) throws IOException {

        try (Scanner sc = new Scanner(System.in)) {
            double n = sc.nextDouble();
            
            int cem = (int) n / 100;
            
            int cinquenta = (int) (n % 100) / 50;
            
            int vinte = (int) (n % 100 % 50) / 20;
            
            int dez = (int) (n % 100 % 50 % 20) / 10;
            
            int cinco = (int) (n % 100 % 50 % 20 % 10) / 5;
            
            int dois = (int) (n % 100 % 50 % 20 % 10 % 5) / 2;
            
            double resto = n % 100 % 50 % 20 % 10 % 5 % 2;
            
            double dmoeda1 = resto / 1;
            
            double dmoeda2 = (resto % 1) / 0.5;
            
            double dmoeda3 = (resto % 1 % 0.5) / 0.25;
            
            double dmoeda4 = (resto % 1 % 0.5 % 0.25) / 0.10;
            
            double dmoeda5 = (resto % 1 % 0.5 % 0.25 % 0.10) / 0.05;
            
            double dmoeda6 = (resto % 1 % 0.5 % 0.25 % 0.10 % 0.05) / 0.01;
            
            int moeda1 = (int) dmoeda1;
            
            int moeda2 = (int) dmoeda2;
            
            int moeda3 = (int) dmoeda3;
            
            int moeda4 = (int) dmoeda4;
            
            int moeda5 = (int) dmoeda5;
            
            int moedaFinal;
            
            String sophy = Double.toString(dmoeda6 % 1);
            
            if (sophy.startsWith("0.99999")) {
                
                moedaFinal = 1 + (int) ((((((resto % 1) % 0.5) % 0.25) % 0.10) % 0.05) / 0.01);
            }
            
            else {
                
                moedaFinal = (int) ((((((resto % 1) % 0.5) % 0.25) % 0.10) % 0.05) / 0.01);
            }
            
            System.out.println("NOTAS:");
            
            System.out.println(cem + " nota(s) de R$ 100.00");
            
            System.out.println(cinquenta + " nota(s) de R$ 50.00");
            
            System.out.println(vinte + " nota(s) de R$ 20.00");
            
            System.out.println(dez + " nota(s) de R$ 10.00");
            
            System.out.println(cinco + " nota(s) de R$ 5.00");
            
            System.out.println(dois + " nota(s) de R$ 2.00");
            
            System.out.println("MOEDAS:");
            
            System.out.println(moeda1 + " moeda(s) de R$ 1.00");
            
            System.out.println(moeda2 + " moeda(s) de R$ 0.50");
            
            System.out.println(moeda3 + " moeda(s) de R$ 0.25");
            
            System.out.println(moeda4 + " moeda(s) de R$ 0.10");
            
            System.out.println(moeda5 + " moeda(s) de R$ 0.05");
            
            System.out.println(moedaFinal + " moeda(s) de R$ 0.01");
        }

    }

}