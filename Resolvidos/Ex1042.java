import java.io.IOException;
import java.util.Scanner;

public class Ex1042 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String input = sc.nextLine();
        String[] inputVetor = input.split(" ");

        int valor1 = Integer.parseInt(inputVetor[0]);

        int valor2 = Integer.parseInt(inputVetor[1]);

        int valor3 = Integer.parseInt(inputVetor[2]);
    
     if (valor1 < valor2 && valor2 < valor3)  {

        System.out.println(valor1);

        System.out.println(valor2);

        System.out.println(valor3);
     
        System.out.println();

        System.out.println(valor1);

        System.out.println(valor2);

        System.out.println(valor3);

     }
     else if (valor1 < valor3 && valor3 < valor2)  {

        System.out.println(valor1);

        System.out.println(valor3);

        System.out.println(valor2);

        System.out.println();

        System.out.println(valor1);

        System.out.println(valor2);

        System.out.println(valor3);
     }
     
     else if (valor2 < valor1 && valor1 < valor3){

        System.out.println(valor2);

        System.out.println(valor1);

        System.out.println(valor3);   
        
        System.out.println();

        System.out.println(valor1);

        System.out.println(valor2);

        System.out.println(valor3);

     }

     else if (valor2 < valor3 && valor3 < valor1){

        System.out.println(valor2);

        System.out.println(valor3);

        System.out.println(valor1);   
        
        System.out.println();

        System.out.println(valor1);

        System.out.println(valor2);

        System.out.println(valor3);

     }
     else if (valor3 < valor2 && valor2 < valor1){

        System.out.println(valor3);

        System.out.println(valor2);

        System.out.println(valor1);  
        
        System.out.println();

        System.out.println(valor1);

        System.out.println(valor2);

        System.out.println(valor3);
    }
     else if (valor3 < valor1 && valor1 < valor2){

        System.out.println(valor3);

        System.out.println(valor1);

        System.out.println(valor2);  
        
        System.out.println();

        System.out.println(valor1);

        System.out.println(valor2);

        System.out.println(valor3);
    }

    sc.close();
    }
}
