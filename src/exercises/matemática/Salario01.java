package exercises.matemática;

import java.util.Scanner;

public class Salario01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float salarioBase = scan.nextFloat();
        float bonus = (float) 0.05;
        float imposto = (float) 0.07;

        float salarioTotal = ((salarioBase * (1 + bonus)) - (100 - (salarioBase * (1 - imposto))));
        System.out.println(salarioTotal);

    }
}
