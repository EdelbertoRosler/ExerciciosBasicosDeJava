package exercicios.matemática;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Idade {
    public static void main(String[] args) throws IOException {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));

        System.out.println("Ano atual: ");
        int anoAtual = Integer.parseInt(bf.readLine());

        System.out.println("Ano de nascimento: ");
        int anoNascimento = Integer.parseInt(bf.readLine());

        int idadeAnos = anoAtual - anoNascimento;
        int idadeMeses = idadeAnos * 12;
        int idadeSemanas = idadeAnos * 52;
        int idadeDias = idadeAnos * 365;

        System.out.println("Idade em anos: " + idadeAnos);
        System.out.println("Idade em meses: " + idadeMeses);
        System.out.println("Idade em semanas: " + idadeSemanas);
        System.out.println("Idade em dias: " + idadeDias);
    }
}
