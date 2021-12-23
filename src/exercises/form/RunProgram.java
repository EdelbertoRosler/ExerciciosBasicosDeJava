package exercises.form;

import exercises.form.bidimensional.Circle;
import exercises.form.bidimensional.Square;
import exercises.form.bidimensional.Triangle;
import exercises.form.superclass.Form;
import exercises.form.tridimensional.Ball;
import exercises.form.tridimensional.Cube;
import exercises.form.tridimensional.Tetrahedron;


import java.util.ArrayList;

public class RunProgram {
    public static void main(String[] args) {

        ArrayList<Form> forms = new ArrayList();

        forms.add(new Square(2.3));
        forms.add(new Triangle(3, 9));
        forms.add(new Circle(2.5));
        forms.add(new Cube(2.3));
        forms.add(new Ball(2));
        forms.add(new Tetrahedron(3));


        System.out.println("----------------------------------");
        for (Form f : forms) {
            System.out.printf(f.toString());
            System.out.println("----------------------------------");
        }



    }
}
