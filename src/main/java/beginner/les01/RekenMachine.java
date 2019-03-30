package beginner.les01;

public class RekenMachine {

    public static void main(String[] args) {
        int firstNumber=7;
        int secondNumber=2;

        System.out.println("Operation '" + firstNumber+ " + " +secondNumber + "' gives: " + (firstNumber + secondNumber) );
        System.out.println("Operation '" + firstNumber+ " - " +secondNumber + "' gives: " + (firstNumber - secondNumber) );
        System.out.println("Operation '" + firstNumber+ " * " +secondNumber + "' gives: " + (firstNumber * secondNumber) );
        System.out.println("Operation '" + firstNumber+ " / " +secondNumber + "' gives: " + (firstNumber / secondNumber) );
        System.out.println("Operation '" + firstNumber+ " % " +secondNumber + "' gives: " + (firstNumber % secondNumber) );

        //special
        System.out.println("\nSpecial case");
        System.out.println("Operation With Double'" + firstNumber+ " / " + 2.0 + "' gives: " + (firstNumber / 2.0) );

    }


}
