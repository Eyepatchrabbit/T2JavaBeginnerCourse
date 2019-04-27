package beginnercoursettwo.les03;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("give in first number:");
            int firstNumber = scanner.nextInt();

            System.out.print("give in first number:");
            int secondNumber = scanner.nextInt();

            printResults(firstNumber, secondNumber);

        } finally {
            scanner.close();
        }
    }

    private static void printResults(int firstNumber, int secondNumber) {
        System.out.println("The sum give: " + sum(firstNumber, secondNumber));
        System.out.println("The substraction gives: " + subtract(firstNumber, secondNumber));
        System.out.println("The multiplication gives: " + multiply(firstNumber, secondNumber));
        System.out.println("The division gives: " + divide(firstNumber, secondNumber));
    }

    private static int sum(int firstNumber, int secondNumber) {
        return firstNumber + secondNumber;
    }

    private static int subtract(int firstNumber, int secondNumber) {
        return firstNumber - secondNumber;

    }


    private static int multiply(int firstNumber, int secondNumber) {
        return firstNumber * secondNumber;
    }

    private static int divide(int firstNumber, int secondNumber) {
        return firstNumber / secondNumber;
    }

}
