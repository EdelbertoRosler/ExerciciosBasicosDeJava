package exercises.circulo;

public class Principal {
    public static void main(String[] args) {
        Circulo circulo1 = new Circulo(10);
        Circulo circulo2 = new Circulo(4);
        Circulo circulo3 = new Circulo(15);
        Circulo circulo4 = new Circulo(6);

        System.out.println("circulo1 : ");
        circulo1.calcularArea();
        circulo1.calcularPerimetro();System.out.println("\n");

        System.out.println("circulo2 : ");
        circulo2.calcularArea();
        circulo2.calcularPerimetro();System.out.println("\n");

        System.out.println("circulo3 : ");
        circulo3.calcularArea();
        circulo3.calcularPerimetro();System.out.println("\n");

        System.out.println("circulo4 : ");
        circulo4.calcularArea();
        circulo4.calcularPerimetro();

    }
}
