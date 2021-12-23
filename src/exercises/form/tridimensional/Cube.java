package exercises.form.tridimensional;

public class Cube extends FormTridimensional{

    public Cube(double edge) { super(edge); }//aresta

    @Override
    public double volumeCalculation(){
        double volume;
        volume = Math.pow(super.base, 3);
        return volume;
    }

    @Override
    public double areaCalculation(){
        double area;
        area = 6 * (Math.pow(super.base, 2));
        return area;
    }

    @Override
    public String toString() {
        return String.format("<<<< Cube >>>>\nEdge: " + super.base + "\n" +
                String.format("Area: %.2f\n", areaCalculation()) +
                String.format("Volume: %.2f\n", volumeCalculation()));
    }



}
