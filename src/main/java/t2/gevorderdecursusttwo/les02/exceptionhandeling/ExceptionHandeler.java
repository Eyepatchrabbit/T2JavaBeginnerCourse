package t2.gevorderdecursusttwo.les02.exceptionhandeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandeler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give in a number");
        try {
            int x = scanner.nextInt();
            System.out.println("you entered: "+x);
        } catch (InputMismatchException e) {
            System.out.println("Please try again and enter a number.");
            main(args);
        }
    }
}
