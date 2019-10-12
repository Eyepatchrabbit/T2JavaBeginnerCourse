package t2.gevorderdecursusttwo.les03;

import java.io.IOException;
import java.util.Scanner;

public class ExceptionCatcher {

    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Give in numerator");
        int numerator = scanner.nextInt();

        System.out.println("Give in denomirator");
        int denomirator = scanner.nextInt();
        try {
            System.out.println(divide(numerator, denomirator));
        } finally {
            scanner.close();
        }
    }


    private static double divide(int numerator, int denominator) throws IOException {
        if (denominator == 0) {
            throw new IOException("The denominator is 0!");
        }
        return (double)numerator /  denominator;

    }
}
