package exercicios.matemática;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Quilowatt {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Salário mínimo: ");
        double salarioMinimo = Double.parseDouble(bf.readLine());

        System.out.println("Quantidade de Quilowatts consumida : ");
        double qntQuilowatts = Double.parseDouble(bf.readLine());

        double valorQuilowatts = salarioMinimo / 5;
        double valorGasto = qntQuilowatts * valorQuilowatts;
        double desconto = 0.15;

        System.out.println("valor do Quilowatts : R$ " + valorQuilowatts);
        System.out.println("valor a ser pago : R$ " + valorGasto);
        System.out.println("valor a ser pago com desconto de 15% : R$ " + (valorGasto - (valorGasto * desconto)));
    }
}
