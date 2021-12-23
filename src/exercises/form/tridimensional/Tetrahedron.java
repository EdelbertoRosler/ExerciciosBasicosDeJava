package exercises.form.tridimensional;

public class Tetrahedron extends FormTridimensional{

    public Tetrahedron(double edge){super(edge);}//aresta

    @Override
    public double volumeCalculation() {
        double volume;
        volume = Math.pow(super.base, 3) * Math.sqrt(2) / 12;
        return volume;
    }

    @Override
    public double areaCalculation() {
        double area;
        area = Math.pow(super.base, 2) * Math.sqrt(3);
        return area;
    }

    @Override
    public String toString() {
        return String.format("<<<< Tetrahedron >>>>\nEdge: " + super.base + "\n" +
                String.format("Area: %.2f\n", areaCalculation()) +
                String.format("Volume: %.2f\n", volumeCalculation()));
    }
}
