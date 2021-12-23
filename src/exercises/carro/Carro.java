package exercises.carro;

public class Carro {

    public String marca;
    public String cor;
    public String placa;
    public Integer velocidadeAtual;
    public char marchaAtual;
    public Boolean freioDeMaoPuxado;
    public Boolean chaveVirada;
    public Boolean radio; // adicionado
    public String nomeEstacao; // adicionado


    public void ligar() {
        chaveVirada = true;
        freioDeMaoPuxado = false;
        marchaAtual = '1';
        radio = false;
    }

    public void aceleraAte(int velocidade) {
        if (chaveVirada && !freioDeMaoPuxado && marchaAtual != 'N')
        velocidadeAtual = velocidade;
    }

    public void  mudarMarcha(char marcha) {
        marchaAtual = marcha;
    }

    public void parar() {
        aceleraAte(0);
        freioDeMaoPuxado = true;
        chaveVirada = false;
        marchaAtual = '1';
    }

    public void desligarCarro() { // método adicionado
        parar();
        marchaAtual = 'N';
        radio = false;
        nomeEstacao = null;
    }

    public String ouvirRadio(String estacao) { // método adicionado
        radio = true;
        switch (estacao) {
            case "1" -> nomeEstacao = "Maisnova FM";
            case "2" -> nomeEstacao = "Rádio Viva";
            case "3" -> nomeEstacao = "Gaúcha Serra";
            case "4" -> nomeEstacao = "Atlântida FM";
            case "5" -> nomeEstacao = "UCS FM";
        }
        return nomeEstacao;
    }

    public String toString() {
        String out = "";
        out += "Marca(" + marca + ") ";
        out += "Cor(" + cor + ") ";
        out += "Placa(" + placa + ") ";
        out += "Chave(" + chaveVirada + ") ";
        out += "Freio(" + freioDeMaoPuxado + ") ";
        out += "Marcha(" + marchaAtual + ") ";
        out += "Veloc(" + velocidadeAtual + ") ";
        out += "Rádio(" + radio + ") ";
        out += "Estação Rádio(" + nomeEstacao + ") ";
        return out;
    }

}

