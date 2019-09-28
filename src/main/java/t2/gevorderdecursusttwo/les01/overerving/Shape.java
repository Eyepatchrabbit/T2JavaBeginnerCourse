package t2.gevorderdecursusttwo.les01.overerving;

public abstract class Shape {

    private int height; //can also let them directly be set by inherited classes when set protected->then no need to use methods
    private int width;

    public Shape(int height, int width) {
        this.height = height;
        this.width = width;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        System.out.println("The height was set to: " + height);
        this.height = height;
    }

    public int getWidth() {
        return width;
    }

    public void setWidth(int width) {
        this.width = width;
    }

    public abstract double getArea(); // => implementing something that NEEDS to be created in EACH CLASS INHERITING from this one!!!


}
