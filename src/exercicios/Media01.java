package exercicios;

import java.util.Scanner;

public class Media01 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int number1 = scan.nextInt(); int number2 = scan.nextInt(); int number3 = scan.nextInt();
        int media = ((number1 + number2 + number3) / 3);

        System.out.println(media);
    }
}