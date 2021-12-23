package exercises.form.bidimensional;

public class Circle extends FormBidimensional {

    public Circle(double ray) { super(ray); }

    @Override
    public double areaCalculation() {
        double area;

        area = pi * (Math.pow(base, 2));// pi*r^2
        return area;
    }

    @Override
    public String toString() {
        return String.format("<<<< Circle >>>>\nRay: " + super.base + "\n" +
                String.format("Area: %.2f\n", areaCalculation()));
    }

}
