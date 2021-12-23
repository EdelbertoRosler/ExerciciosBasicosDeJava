package exercises.matemática;

import java.util.Scanner;

public class Media02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float nota1 = scan.nextFloat();
        float nota2 = scan.nextFloat();
        float nota3 = scan.nextFloat();

        float media = (((nota1 * 2) + (nota2 * 3) + (nota3 * 5)) / 10);
        String formated = String.format("MEDIA = %,.1f", media);
        System.out.println(formated);
    }
}
