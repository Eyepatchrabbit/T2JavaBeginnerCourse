package t2.beginnercoursettwo.les02;

public class ShortcutOperators {
    public static void main(String[] args) {
        int firstNumber = 6;
        int secondNumber = 10;

        System.out.println(firstNumber+ "+="+secondNumber);
        firstNumber += secondNumber;
        System.out.println(firstNumber);

        System.out.println(firstNumber+ "-="+secondNumber);
        firstNumber -= secondNumber;
        System.out.println(firstNumber);

        System.out.println(firstNumber+ "*="+secondNumber);
        firstNumber *= secondNumber;
        System.out.println(firstNumber);

        System.out.println(firstNumber+ "/="+secondNumber);
        firstNumber /= secondNumber;
        System.out.println(firstNumber);

    }


}
