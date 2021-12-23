package exercises.sensediadesafios;

import java.util.*;

public class ChallengeOne {

        public static void main(String[] args){
            List<Integer> numeros = Arrays.asList(88, 53, 68, 48, 72, 69, 11, 53, 81, 7, 4, 11, 70, 8, 69, 75, 37, 81,
                    34, 46, 93, 34, 4, 0, 42, 99, 4, 62, 39, 95, 14, 92, 48, 0, 21, 69, 32, 53, 39, 77, 88, 92, 94, 99,
                    90, 16, 98, 52, 52, 87, 58, 77, 66, 27, 26, 56, 26, 59, 34, 37, 28, 25, 73, 62, 44, 21, 87, 89, 29,
                    40, 81, 60, 48, 25, 83, 67, 98, 81, 73, 88, 54, 84, 27, 7, 85, 57, 24, 2, 93, 34, 67, 66, 45, 39, 14,
                    54, 49, 9, 4, 58);

            Set<Integer> set = new HashSet<>(numeros);//a Set "set" recebe, ordena e exclui os elementos duplicados

            //iteração para adicionar os elementos da Set na List "teste"
            List<Integer> teste = new LinkedList<>(set);

            System.out.println("menor valor: " + teste.get(0) +
                               "\nmaior valor: " + teste.get(teste.size()-1) );//pegando o menor e o maior valor da list


        }

}
