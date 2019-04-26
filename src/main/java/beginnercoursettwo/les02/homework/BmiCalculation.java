package beginnercoursettwo.les02.homework;

import java.math.BigDecimal;
import java.util.Scanner;

public class BmiCalculation {
    //make a app to calculate your own BMI

    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        try{
            System.out.print("geef gewicht in kg: ");
            Double bodyWeight= scanner.nextDouble();

            System.out.print("geef je length in m: ");
            Double length= scanner.nextDouble();

            Double bmi= bmiCalculator (bodyWeight,length);

            System.out.println("Je BMI is : "+bmi);

            System.out.println("je hebt dus " + bmiIndex(bmi));
        }finally {
            scanner.close();
        }

    }


    private static Double bmiCalculator(Double bodyWeight, Double length){
        return  bodyWeight/(length*length);
    }



    private static String bmiIndex(Double bmi){
        if(bmi>30.0){
            return "Obesitas";
        } else if (bmi>=25.0){
            return "overgewicht";
        }else if (bmi>=18.5){
            return "gezond normaal gewicht";
        }else if (bmi>0.0){
            return "ondergewicht";
        }
        return "onbekend";
    }

}
