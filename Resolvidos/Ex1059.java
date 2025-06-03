
import java.io.IOException;

public class Ex1059 {

    public static void main(String[] args) throws IOException {

        int par = 0;

        while (par <= 101) {

            par = par + 2;

            if (par >= 101) {

                break;
            }
            System.out.println(par);

        }

    }
}
