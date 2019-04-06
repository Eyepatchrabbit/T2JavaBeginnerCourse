package beginnercoursettwo.les02;

public class RekenMachine2 {
    public static void main(String[] args) {
        int firstnumber = 6;
        int secondnumber = 5;

        calculationPrinter(firstnumber, secondnumber, " + ", (firstnumber + secondnumber));
        calculationPrinter(firstnumber, secondnumber, " - ", (firstnumber - secondnumber));
        calculationPrinter(firstnumber, secondnumber, " / ", (firstnumber / secondnumber));
        calculationPrinter(firstnumber, secondnumber, " X ", (firstnumber * secondnumber));


    }


    private static void calculationPrinter(int firstNumber, int secondNumber, String operation, int result) {
        System.out.println(firstNumber + operation + secondNumber + " = " + result);
    }
}
