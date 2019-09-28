package t2.gevorderdecursusttwo.les01.overerving;

public class ShapeMain {

    public static void main(String[] args) {
        Shape shape = new Shape(30, 40) {
            @Override
            public double getArea() {
                return 0;
            }
        };
//        shape.setHeight(3);
//        shape.setWidth(4);
        System.out.println("the area of the shape is: "+shape.getArea());

        Rectangle rectangle = new Rectangle(20,40);
//        rectangle.setHeight(2);
//        rectangle.setWidth(5);
        System.out.println("the area of the rectangle is: "+rectangle.getArea());

        Circle circle = new Circle(30);
//        circle.setHeight(30);
//        circle.setWidth(30);
        //->getting the same elements in rectangle and circle-> overgeërft
        System.out.println("the area of the circle is: "+circle.getArea());

        Square square = new Square(10);
        //square.setHeight(10);
        System.out.println("The height of square is: " + square.getHeight() + ". And width is equally: " + square.getWidth());
        System.out.println("the area of the square is: "+square.getArea());

    }
}
