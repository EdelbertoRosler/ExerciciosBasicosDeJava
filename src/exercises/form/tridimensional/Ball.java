package exercises.form.tridimensional;

public class Ball extends FormTridimensional{
    double ray;//raio

    public Ball (double ray) {
        super(ray);
        this.ray = ray; }

    @Override
    public double volumeCalculation() {
        double volume;
        volume = 4 * (pi * Math.pow(ray, 3) / 3);
        return volume;
    }

    @Override
    public double areaCalculation() {
        double area;
        area = 4 * pi * Math.pow(ray, 2);
        return area;
    }

    @Override
    public String toString() {
        return String.format("<<<< Ball >>>>\nRay: " + super.base + "\n" +
                String.format("Area: %.2f\n", areaCalculation()) +
                String.format("Volume: %.2f\n", volumeCalculation()));
    }
}
