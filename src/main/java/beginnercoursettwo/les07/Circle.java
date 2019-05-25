package beginnercoursettwo.les07;

import java.text.DecimalFormat;

public class Circle {

    private static DecimalFormat df2 = new DecimalFormat("#.####");

    private double straal;

    public Circle(double straal) {
        this.straal = straal;

    }

    public double getOmtrek() {
        return 2 * straal * Math.PI;
    }

    public  double getOppervlakte() {
        return Math.pow(straal,2) * Math.PI;
    }

    public double getStraal() {
        return straal;
    }

    public void print() {
        System.out.println("De circle met straal " + getStraal() + " heeft een omtrek van " + df2.format(getOmtrek()) + " en oppervlakte is " + df2.format(getOppervlakte()));
    }
}
