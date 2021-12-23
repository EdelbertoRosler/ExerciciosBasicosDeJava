package exercises.form.superclass;

import exercises.form.MyInterface;

public abstract class Form implements MyInterface {//abstract class
    protected double base;
    protected static double pi = 3.14159;

    public Form(double base) { this.base = base; }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getPi() {
        return pi;
    }

//    public String toString(){
//        return String.format("%s\n", getClass().getName());
//    }

}
