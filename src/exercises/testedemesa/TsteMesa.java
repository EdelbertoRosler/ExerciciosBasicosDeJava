package exercises.testedemesa;

public class TsteMesa {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 3;
        String mens = "";

        if ((a < b+c) && (b < a+c) && (c < a+b)){
            if ((a == b ) && (b == c)){
                mens = "Tiângulo Equilátero";
            }
            else
                if ((a == b) || (b == c) || (a == c)){
                mens = "Triângulo Isósceles";
                }
                else mens = "Triângulo Escaleno";
        }
        else mens = "Não é possível formar um triângulo";

        System.out.println(mens);

        //1 - não é possível formar um triângulo (1,2,3)
        //2 - triângulo Escaleno (3,4,5)
        //3 - não é possível formar um triângulo (2,2,4)
        //4 - Triângulo Equilátero (4,4,4)
        //5 - Triângulo Isósceles (5,3,3)

    }
}
