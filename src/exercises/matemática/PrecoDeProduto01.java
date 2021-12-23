package exercises.matemática;

import java.util.Scanner;

public class PrecoDeProduto01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        float preco = scan.nextFloat();
        float desconto = (float) 0.1;
        float precoReajustado = (preco * (1 - desconto));

        System.out.println(precoReajustado);
    }
}
