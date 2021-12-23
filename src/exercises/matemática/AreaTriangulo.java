package exercises.matemática;

import java.util.Scanner;

public class AreaTriangulo {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe a base");
        float base = scan.nextFloat();
        System.out.println("Informe a altura");
        float altura = scan.nextFloat();

        float area = ((base * altura) / 2);

        System.out.println("Área do triangulo: " + area);
    }
}
