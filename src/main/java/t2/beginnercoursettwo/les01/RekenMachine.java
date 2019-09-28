package t2.beginnercoursettwo.les01;

public class RekenMachine {

    public static void main(String[] args) {
        int firstNumber=7;
        int secondNumber=2;
        
        String startString= "Operation '" ;
        String givesString="' gives: ";

        System.out.println(startString + firstNumber+ " + " +secondNumber + givesString + (firstNumber + secondNumber) );
        System.out.println(startString + firstNumber+ " - " +secondNumber + givesString + (firstNumber - secondNumber) );
        System.out.println(startString + firstNumber+ " * " +secondNumber + givesString + (firstNumber * secondNumber) );

        //Divisions
        System.out.println("\nDivisions;");
        System.out.println(startString + firstNumber+ " / " +secondNumber + givesString + (firstNumber / secondNumber) );
        System.out.println(startString + firstNumber+ " % " +secondNumber + givesString + (firstNumber % secondNumber) );
        System.out.println("Operation With Double'" + firstNumber+ " / " + 2.0 + givesString + (firstNumber / 2.0) );
    }


}
