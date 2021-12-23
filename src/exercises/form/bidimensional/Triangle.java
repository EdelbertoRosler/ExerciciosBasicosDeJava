package exercises.form.bidimensional;

public class Triangle extends FormBidimensional{
    double height;//altura

    public Triangle(double base, double height) {
        super(base);
        this.height = height;
    }

    @Override
    public double areaCalculation() {
        double area ;
        area = base * height / 2;//b*a^2
        return area;
    }

    public double getHeight() { return height; }

    public void setHeight(double height) { this.height = height; }

    @Override
    public String toString() {
        return String.format("<<<< Triangle >>>>\nSide: " + super.base +
                " - height: " + height + "\n" +
                String.format("Area: %.2f\n", areaCalculation()));
    }
}
