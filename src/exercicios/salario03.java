package exercicios;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class salario03 {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Salário mínimo: ");
        double salarioMinimo = Double.parseDouble(bf.readLine());

        System.out.println("Horas Trabalhadas: ");
        double horasTrabalhadas = Double.parseDouble(bf.readLine());

        double valorHora = salarioMinimo / 10;
        double salarioBruto = horasTrabalhadas * valorHora;
        double imposto = salarioBruto * 0.03;
        double salarioLiquido = salarioBruto - imposto;

        System.out.println("valor da hora : R$ " + valorHora);
        System.out.println("salario bruto : R$ " + salarioBruto);
        System.out.println("imposto : R$ " + imposto);
        System.out.println("SALÁRIO LÍQUIDO : R$ " + salarioLiquido);

    }
}
