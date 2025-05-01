import java.io.IOException;
import java.util.Scanner;

public class Ex1019 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int s = (n);

        int m = (n / 60);

        int h = (n / 60 / 60);


        if (s >= 3600){

        System.out.println(h + ":" + (m - h * 60) + ":" + (s - m * 60));

        }
        
        else if  (s >= 60){ 
        
        System.out.println("0:" + m + ":" + (s - m * 60));

    
    } 
        else if (s < 60){

            System.out.println("0:0:" + s);
        }

        sc.close();
    }
}
