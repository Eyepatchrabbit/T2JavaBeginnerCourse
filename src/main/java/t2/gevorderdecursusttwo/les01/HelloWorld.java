package t2.gevorderdecursusttwo.les01;

import java.util.Scanner;

public class HelloWorld {
    public static void main(String[] args) {
        System.out.println("hello world");

        String[] stringArray1 = new String[10];
        String[] stringArray2 = {};

        System.out.println("give in a number");
        Scanner scanner = new Scanner(System.in);
        int numberGiven = scanner.nextInt();
        System.out.println("The number you entered is: " + numberGiven);


    }
}
