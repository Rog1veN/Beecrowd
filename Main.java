import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        double totalDias = sc.nextDouble();

        int anos = (int) (totalDias / 365);

        int meses = (int) (totalDias % 365) / 30 ;

        int dias = (int) (totalDias % 365) % 30;

        System.out.println(anos + " ano(s)");
        
        System.out.println(meses + " mes(es)");
        
        System.out.println(dias + " dia(s)");

        sc.close();
    }

}
