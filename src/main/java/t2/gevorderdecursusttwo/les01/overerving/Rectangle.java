package t2.gevorderdecursusttwo.les01.overerving;

public class Rectangle extends Shape {
    public Rectangle(int height, int width) {
        super(height, width);
    }

    @Override
    public double getArea() {
        return getHeight()*getWidth();
    }
}
