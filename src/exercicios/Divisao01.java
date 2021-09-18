package exercicios;

import java.util.Scanner;

public class Divisao01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt(); int number2 = scan.nextInt();
        int result = (number1 / number2);

        System.out.println(result);
    }
}