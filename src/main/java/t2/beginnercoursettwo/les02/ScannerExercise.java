package t2.beginnercoursettwo.les02;

import java.util.Scanner;

public class ScannerExercise {
    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);

        System.out.println("give in a number");
        int recievedFirstNumber=keyboard.nextInt();

        System.out.println("give in a number");
        int recievedSecondNumber=keyboard.nextInt();

        System.out.println(recievedFirstNumber+" + " +recievedSecondNumber+" = "+ (recievedFirstNumber+recievedSecondNumber));

        keyboard.close();
    }

}
