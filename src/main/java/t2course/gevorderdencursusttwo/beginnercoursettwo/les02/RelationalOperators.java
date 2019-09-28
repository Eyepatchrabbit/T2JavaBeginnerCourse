package t2course.gevorderdencursusttwo.beginnercoursettwo.les02;

public class RelationalOperators {
    public static void main(String[] args) {
        //Scanner scanner = new Scanner(System.in);
        String equalsTo = " = ";

        System.out.print("geef eerste getal in: ");
        int firstNumber = 2;// scanner.nextInt();

        System.out.print("geef tweede getal in: ");
        int secondNumber = 3;// scanner.nextInt();

        System.out.println(+firstNumber + " >  " + secondNumber + equalsTo + (firstNumber > secondNumber));
        System.out.println(+firstNumber + " >= " + secondNumber + equalsTo + (firstNumber >= secondNumber));
        System.out.println(+firstNumber + " <  " + secondNumber + equalsTo + (firstNumber < secondNumber));
        System.out.println(+firstNumber + " <= " + secondNumber + equalsTo + (firstNumber <= secondNumber));
        System.out.println(+firstNumber + " == " + secondNumber + equalsTo + (firstNumber == secondNumber) + "\t(Is gelijk aan)");
        System.out.println(+firstNumber + " != " + secondNumber + equalsTo + (firstNumber != secondNumber) + "\t(Is NIET gelijk aan)");


        String firstString = "same";
        String secondString = "same";

        System.out.println(firstString + " == " + secondString + "' = " + (firstString == secondString));
        System.out.println( firstString + ".equals(" + secondString + ") = " + (firstString.equals( secondString)));


    }
}
