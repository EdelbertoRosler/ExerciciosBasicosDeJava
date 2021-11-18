package exercicios.form;

public class Form {
    static double pi = 3.14159;


    public static void main(String[] args) {
//        System.out.println("área do quadrado com lado 4: " + areaQuadrado(4));
//        System.out.println("área do círculo com raio 3: " + areaCirculo(3));
//        System.out.println("área do triângulo de base 11 e altura 8: " + areaTriangulo(11, 8));
//
//        System.out.println(areaEsfera(4));
//        System.out.println(volumeEsfera(4));

//        System.out.println(areaCubo(4));
//        System.out.println(volumeCubo(4));

//        System.out.println(areaTetraedro(4));
//        System.out.println(volumeTetraedro(4));
    }

    public static double areaQuadrado(double lado){
        return Math.pow(lado, 2);//lado^2
    }

    public static double areaCirculo(double raio){
        return (pi * (Math.pow(raio, 2)));// pi*r^2
    }

    public static double areaTriangulo(double base, double altura){
        return base * altura / 2;//b*a^2
    }

//----------------------------//-------------------------------//

    public static double areaEsfera(double raio){
        return 4 * (pi * Math.pow(raio, 2));//área da superfície da esfera
    }

    public static double volumeEsfera(double raio){
        return 4 * (pi * Math.pow(raio, 3) / 3);//v=4*pi*r^3/3
    }



    public static double areaCubo(double lado){
        return areaQuadrado(lado) * 6;
    }

    public static double volumeCubo(double aresta){
        return Math.pow(aresta, 3);
    }



    public static double areaTetraedro(double aresta){
        return Math.pow(aresta, 2) * Math.sqrt(3);
    }

    public static double volumeTetraedro(double aresta){
        return ( Math.pow(aresta, 3) * Math.sqrt(2) ) / 12;
    }

}
