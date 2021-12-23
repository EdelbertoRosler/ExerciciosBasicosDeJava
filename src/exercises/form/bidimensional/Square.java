package exercises.form.bidimensional;

import exercises.form.MyInterface;

public class Square extends FormBidimensional implements MyInterface {


    public Square(double side) { super(side); }

    @Override
    public double areaCalculation(){
        double area;
        area = Math.pow(super.base, 2);//lado^2
        return area;
    }

    @Override
    public String toString() {
        return String.format("<<<< Square >>>>\nSide: " + super.base + "\n" +
                String.format("Area: %.2f\n", areaCalculation()));
    }

}
