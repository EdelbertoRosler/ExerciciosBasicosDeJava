package exercicios.anagrama;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Anagrama {
    private static final BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    private static final List<Object> listaDasPalavras = new ArrayList<>();
    private static int cont = 0;
    private static int qntAnagrama = 0;

    public static void main(String[] args) throws IOException {
        prencherLista(lerTexto("Diga: "));
        System.out.println(listaDasPalavras.get(0));
        System.out.println(listaDasPalavras.get(1));
        System.out.println(comparaString(listaDasPalavras.get(0),listaDasPalavras.get(1)));




    }

    public static String lerTexto(String txt) throws IOException {
        System.out.print(txt);
        return bf.readLine();
    }


/**
 * Este metodo recebe um texto, separa as palavras e adiciona cada palavra numa lista
 */
    public static void prencherLista(String texto) {
        String[] arrayPalavras = texto.split(" ");
        Collections.addAll(listaDasPalavras, arrayPalavras);
    }


/**
 * Este metodo recebe 2 objetos, transforma em string, coloca eles em ordem
 * e verifica se são iguais
 */
    public static boolean comparaString(Object a, Object b){
        char aa [] = a.toString().toCharArray();
        Arrays.sort(aa);//ordena a array
        char bb [] = b.toString().toCharArray();
        Arrays.sort(bb);

        if (aa.length == bb.length){
            for (int i = 0; i < aa.length; i ++){
                for (int j = 0; j < bb.length; j ++){
                    if ( aa[i] == bb[j] ){
                        cont += 1;
                        break;
                    }
                }
            }
        }
        return cont == aa.length;
    }


}
