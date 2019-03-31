package main.TimBuchalka.javacourse;

public class AreaCalculator {

    public static void main(String[] args) {
        System.out.println(area(5.0));
        System.out.println(area(-1));
        System.out.println(area(5.0, 5.0));
        System.out.println(area(-1.0, 4.0));
    }

    public static double area(double radius) {
        if (radius < 0) {
            return -1.0;
        }
        return radius * radius * 3.14159;
    }

    public static double area(double sideA, double sideB) {
        if (sideA < 0 || sideB < 0) {
            return -1.0;
        }
        return sideA * sideB;
    }


}
