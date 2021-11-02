package exercicios.carro;

public class TestaCarro {
    public static void main(String[] args) {
        Carro gol = new Carro();
        Carro uno = new Carro();
        Carro ka = new Carro();

        gol.marca = "Wolkswagen";
        gol.cor = "branca";
        gol.placa = "XYZ9803";

        uno.marca = "Fiat";
        uno.cor = "vermelha";
        uno.placa = "IGT5114";

        ka.marca = "Ford";
        ka.cor = "preta";
        ka.placa = "IEV9124";

        uno.ligar();
        gol.ligar();
        ka.ligar();
        gol.aceleraAte(20);
        uno.aceleraAte(10);
        ka.aceleraAte(30);
        gol.mudarMarcha('2');
        ka.mudarMarcha('2');
        ka.aceleraAte(50);
        ka.mudarMarcha('3');
        uno.parar();
        uno.ouvirRadio("3");
        gol.ouvirRadio("1");
        System.out.println(gol);
        gol.desligarCarro();
        System.out.println(gol);
        System.out.println(uno);
        uno.desligarCarro();
        System.out.println(uno);
        System.out.println(ka);
    }
}
