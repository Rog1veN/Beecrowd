
import java.io.IOException;
import java.util.Scanner;

public class Ex1049 {

    public static void main(String[] args) throws IOException {

        Scanner sc = new Scanner(System.in);

        String input0 = sc.nextLine();
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();

        String[] vertebraVetor = {"vertebrado", "invertebrado"};

        String[] tipoAnimalVetor = {"ave", "mamifero", "inseto", "anelideo"};

        String[] dietaVetor = {"carnivoro", "onivoro", "onivoro", "herbivoro", "hematofago", "herbivoro", "hematofago", "onivoro"};

        if (input0.compareTo(vertebraVetor[0]) == 0) {

            if (input1.compareTo(tipoAnimalVetor[0]) == 0) {

                if (input2.compareTo(dietaVetor[0]) == 0) {

                    System.out.println("aguia");

                } else {
                    System.out.println("pomba");
                }

            } else {

                if (input1.compareTo(tipoAnimalVetor[1]) == 0) {

                    if (input2.compareTo(dietaVetor[2]) == 0) {

                        System.out.println("homem");

                    } else {
                        System.out.println("vaca");
                    }

                }

            }

        } else {

            if (input1.compareTo(tipoAnimalVetor[2]) == 0) {

                if (input2.compareTo(dietaVetor[4]) == 0) {

                    System.out.println("pulga");

                } else {
                    System.out.println("lagarta");
                }

            } else {
                    
                if (input1.compareTo(tipoAnimalVetor[3]) == 0) {

                    if (input2.compareTo(dietaVetor[6]) == 0) {
                        System.out.println("sanguessuga");
                    } else {
                        System.out.println("minhoca");
                    }

                }

            }

        }

    }
}
