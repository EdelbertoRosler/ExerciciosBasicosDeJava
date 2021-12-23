package exercises.matemática;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PrecoDeProduto {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Preço de fábrica do veículo: ");
        double precoFabrica = Double.parseDouble(bf.readLine());
        System.out.println("Lucro do distribuidor: ");
        double lucroDistribuidor = Double.parseDouble(bf.readLine());
        System.out.println("Impostos: ");
        double impostos = Double.parseDouble(bf.readLine());
        double lucro = precoFabrica * (lucroDistribuidor / 100);
        double impost = precoFabrica * (impostos / 100);

        System.out.printf("Valor do lucro do distribuidor: R$ %.2f ", lucro);
        System.out.println();
        System.out.printf("Valor dos impostos: R$ %.2f ", impost);
        System.out.println();
        System.out.printf("Valor final do produto: R$ %.2f ", (precoFabrica + impost + lucro));

    }
}
