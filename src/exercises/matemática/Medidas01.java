package exercises.matemática;

import java.util.Scanner;

public class Medidas01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int pe = 12;//1 pe = 12 polegadas
        int jarda = 3;//1 jarda = 3 pés
        int milha = 1760;//1 milha = 1760 jardas

        System.out.println("Informe a medida em pés ");
        float valorRecebido = scan.nextFloat();

        System.out.println((valorRecebido * pe) + " Polegadas");
        System.out.println((valorRecebido / jarda) + " Jardas");
        System.out.println((valorRecebido / milha / jarda) + " Milhas");


    }
}
