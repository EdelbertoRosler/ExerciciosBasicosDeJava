package exercises.jogo;

import exercises.jogo.enuns.Posicao;

public class Time {
    public static void main(String[] args) {
        Jogador Alberto = new Jogador(100,
                10,
                8,
                3,
                "Alberto",
                "Matador",
                Posicao.MEIA,
                "21/09/2001");

        Jogador Gabriel = new Jogador(101,
                11,
                9,
                0,
                "Gabriel",
                "Gabo",
                Posicao.CENTROAVANTE,
                "21/09/1999");

        System.out.println(Alberto);
        System.out.println(Gabriel);
    }
}
