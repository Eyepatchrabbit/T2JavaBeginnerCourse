package t2course.gevorderdencursusttwo.beginnercoursettwo.les02.homework;

import java.util.Scanner;

public class BmiCalculation {
    //make a app to calculate your own BMI

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        try {
            System.out.print("geef gewicht in kg: ");
            Double bodyWeight = scanner.nextDouble();

            System.out.print("geef je length in m: ");
            Double length = scanner.nextDouble();

            Double bmi = bmiCalculator(bodyWeight, length);

            System.out.println("Je BMI is : " + bmi);

            System.out.println("Je hebt dus " + bmiIndex(bmi));
        } finally {
            scanner.close();
        }

    }


    protected static Double bmiCalculator(Double bodyWeight, Double length) {
        return bodyWeight / (length * length);
    }


    private static String bmiIndex(Double bmi) {
        if (bmi > 30.0) {
            return "Obesitas (Je bent veel te zwaar)";
        } else if (bmi >= 25.0) {
            return "overgewicht (Je bent te zwaar voor jouw lengte)";
        } else if (bmi >= 18.5) {
            return "gezond normaal gewicht (Je hebt een gezond gewicht)";
        } else if (bmi > 0.0) {
            return "ondergewicht (Je bent te licht voor jouw lengte)";
        }
        return "onbekend (je hebt iets verkeerd ingegeven)";
    }

}
