package exercicios;

import java.util.Scanner;

public class AreaQuadrado {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Informe o lado do quadrado");
        float lado = scan.nextFloat();

        float areaQuadrado = lado * lado;

        System.out.println("Área do quadrado: " + areaQuadrado);
    }
}
