package exercises.circulo;

public class Circulo {
    private double raio, area, perimetro;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public void calcularArea(){
        System.out.println("Área: " + Math.PI * Math.pow(this.raio, 2));
    }

    public void calcularPerimetro(){
        System.out.println("Perímetro: " + 2 * Math.PI * this.raio);
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    public double getArea() {
        return area;
    }

    public void setArea(double area) {
        this.area = area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    public void setPerimetro(double perimetro) {
        this.perimetro = perimetro;
    }
}
