package t2.gevorderdecursusttwo.les01.overerving;

public class Circle extends Shape {
    public Circle(int height) {
        super(height, 0);
    }

    @Override
    public double getArea() {
        double radius = getHeight()/2.0;
        return Math.pow(radius,2) * Math.PI;
    }
}
