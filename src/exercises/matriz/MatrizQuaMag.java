package exercises.matriz;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Objects;

public class MatrizQuaMag {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    private static int[][] matriz;
    private static int size;
    private static final ArrayList<Integer> somaColunas = new ArrayList<>();
    private static final ArrayList<Integer> somaLinhas = new ArrayList<>();


    public static void main(String[] args) throws IOException {
        size = lerInt("Informe a quantidade de lados da matriz quadrada: ");
        matriz = new int [size][size];
        System.out.println("prencha a matriz: ");
        prencherMatriz();
        somaLinha();
        somaColuna();

        System.out.println(quadradoMagico());

    }

    public static int lerInt(String txt) throws IOException {
        System.out.print(txt);
        return Integer.parseInt(bf.readLine());
    }

    public static void prencherMatriz() throws IOException {
        for(int i = 0; i < size; i++){
            for(int j = 0; j < size; j++){
                matriz[i][j] = lerInt("");
            }
        }
    }


    public static ArrayList somaLinha(){
        for(int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = 0; j < size; j++) {
                sum += matriz[i][j];
            }
            somaLinhas.add(sum);
        }
        return somaLinhas;
    }

    public static ArrayList somaColuna(){
        for(int i = 0; i < size; i++) {
            int sum = 0;
            for (int j = 0; j < size; j++) {
                sum += matriz[j][i];
            }
            somaColunas.add(sum);
        }
        return somaColunas;
    }

    public static Integer somaDiagonalPrincipal(){
        int sum = 0;
        for(int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                if (i == j) {
                    sum += matriz[i][j];
                }
            }
        }//somaDiagonalPrincipal.add(sum);
        return sum;
    }

    public static Integer somaDiagonalSecundaria(){
        int sum = 0;
        for(int i = size - 1; i >= 0; i--) {
            for (int j = size -1; j >= 0; j--) {
                if (i + j == size - 1) {
                    sum += matriz[i][j];
                }
            }
        }//somaDiagonalSecundaria.add(sum);
        return sum;
    }

    public static String quadradoMagico(){
        int validacao = 0;
        for (int i = 0; i < size; i++) {
            if (Objects.equals(somaLinhas.get(i), somaDiagonalPrincipal())) {
                validacao += 1;
            }
        }
        for (int j = 0; j < size; j++) {
            if (Objects.equals(somaColunas.get(j), somaDiagonalPrincipal())) {
                validacao += 1;
            }
        }
        if(somaDiagonalPrincipal().equals(somaDiagonalSecundaria()) && (size * 2 == validacao)){
            return "Quadrado mágico!";
        }
        return "Quadrado não mágico!";
    }
}
