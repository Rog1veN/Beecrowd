import java.io.IOException;
import java.util.Scanner;

public class Ex1018 //incompleto 
{

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int cem = n / 100;

        int cinquenta = (n - cem*100)/50;
                        //550 - 5.5*100/50
        int vinte = (n - cinquenta*100)/20/10;

        int dez = (n - vinte*20)/10/5;

        int cinco = n / 5;

        int dois = n / 2;

        int um = n / 1;


        

        System.out.println (cem +  " nota(s) de R$ 100,00");
                
        System.out.println (cinquenta + " nota(s) de R$ 50,00");
        
        System.out.println (vinte +  " nota(s) de R$ 20,00");
        
        System.out.println (dez  +  " nota(s) de R$ 10,00");
        
        System.out.println(((n - cinco*100)/2)  +  " nota(s) de R$ 5,00");
        
        System.out.println(((n - dois*100)/1)  +  " nota(s) de R$ 2,00");
        
        System.out.println(((n - um*100)/1)  +  " nota(s) de R$ 1,00");
        
       
        sc.close();
    } 
    
}