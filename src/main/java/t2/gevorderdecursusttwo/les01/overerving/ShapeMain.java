package t2.gevorderdecursusttwo.les01.overerving;

public class ShapeMain {



    public static void main(String[] args) {
        Shape shape = new Shape();
        shape.setHeight(3);
        shape.setWidth(4);

        Rectangle rectangle = new Rectangle();
        rectangle.setHeight(2);
        rectangle.setWidth(5);

        Circle circle = new Circle();
        circle.setHeight(30);
        circle.setWidth(30);
        //->getting the same elements in rectangle and circle-> overgeërft


    }
}
