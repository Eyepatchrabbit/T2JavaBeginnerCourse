package t2course.gevorderdencursusttwo.beginnercoursettwo.les02;

import java.util.Scanner;

public class RekenMachine3 {
    public static void main(String[] args) {
        Scanner recieveInput = new Scanner(System.in);

        try {
            System.out.print("Give first number: ");
            int firstNumber = recieveInput.nextInt();
            System.out.print("give second number: ");
            int secondNumber = recieveInput.nextInt();
            System.out.print("Operation to use (+,-,x,/): ");
            String operationtToDo = recieveInput.next();

            int result = resultGenerator(firstNumber, secondNumber, operationtToDo);

            System.out.println(firstNumber + " " + operationtToDo + " " + secondNumber + " = " + result);
        }finally {
            recieveInput.close(); // /!\DON'T FORGET TO CLOSE THIS !!!!!!!!!!
        }

    }

    private static int resultGenerator(int firstNumber, int secondNumber, String operation) {
        int result = -1;

        if (operation.equals("+")) {
            return firstNumber + secondNumber;
        } else if (operation.equals("-")) {
            return firstNumber - secondNumber;
        } else if (operation.equals("x")) {
            return firstNumber * secondNumber;
        } else if (operation.equals("/")) {
            return firstNumber / secondNumber;
        }

        return result;
    }


}
