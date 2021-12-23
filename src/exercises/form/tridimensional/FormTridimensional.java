package exercises.form.tridimensional;

import exercises.form.MyInterface;
import exercises.form.superclass.Form;

public abstract class FormTridimensional extends Form {//abstract class

    public FormTridimensional(double base) { super(base); }

    public abstract double volumeCalculation();
}
