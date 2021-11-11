package exercicios.frequencia_de_caracteres;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class frequrnciaCaracteres {
    public static BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
    public static String [] textList;//para o método stringReplace
    public static char[] charList;//para o método newCharList
    public static String newText = "";//para o método stringConcatenation
    public static char[] alphabetArray = new char[] {'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i',
            'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};



    public static void main(String[] args) throws IOException {
        stringReplace(readText("Diga: "));
        stringConcatenation();
        newCharList(newText);
        System.out.println("Total de letras: "+ newText.length()+"\nPercentuais:");
        countCharacters(charList);

    }


    public static String readText(String txt) throws IOException {
        System.out.println(txt);
        return bf.readLine();
    }//Lê uma String

    public static void stringReplace (String text) {
        textList = text.split(" ");
    }//Coloca cada palavra de um texto em um Array

    public static void stringConcatenation(){
        for (String s : textList) newText += s;
    }//concatena uma array de string em uma string única

    public static void newCharList (String text){
        charList = text.toCharArray();
    }//preenche uma array de caracteres, passando uma string

    /*Este método vai contar os caracteres de uma string e imprimir a porcentagem
     que cada caractere aparece na string
     */
    public static void countCharacters(char[] list){
        double totalString = list.length;
        for (char c : alphabetArray) {
            int contChar = 0;
            for (char value : list) {
                if (c == value) {
                    contChar += 1;
                }
            }
            System.out.printf("%c\t%s\t%.2f\n", c, "=", (100 / totalString * contChar));
        }//c=char; s=string; d=int; 2.f(2 casas decimais); \t=tabulação; \n=quebra de linha
    }
}

