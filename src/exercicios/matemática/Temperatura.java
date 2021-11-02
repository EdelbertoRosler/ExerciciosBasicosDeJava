package exercicios.matemática;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Temperatura {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Temperatura em Celsius: ");
        double tempC = Double.parseDouble(bf.readLine());

        double tempF = (9 * tempC / 5) + 32;

        System.out.println("Temperatura em Fahrenheit: " + tempF + " Graus");
    }
}
