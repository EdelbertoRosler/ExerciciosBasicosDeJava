package exercicios.matemática;

import java.util.Scanner;

public class Salario02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float comissao, vendas, salarioBase, salarioTotal;
        salarioBase = scan.nextFloat();
        vendas = scan.nextFloat();
        comissao = (float) (vendas * 0.04);
        salarioTotal = (salarioBase + comissao);

        System.out.println("Comissão: R$ " + comissao);
        System.out.println("Salário Total: R$ " + salarioTotal);
    }
}
