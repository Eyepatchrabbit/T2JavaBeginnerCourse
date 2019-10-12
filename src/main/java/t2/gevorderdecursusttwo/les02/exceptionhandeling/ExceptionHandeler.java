package t2.gevorderdecursusttwo.les02.exceptionhandeling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandeler {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        try {
            System.out.println("Give in a number");
            int teller = scanner.nextInt();
            System.out.println("Give in second number");
            int noemer = scanner.nextInt();

            if (noemer == 0){
                throw new ArithmeticException("You can't divide by 0!");
            }

            System.out.println(teller + " / " + noemer + "= " + teller / noemer);
        } catch (InputMismatchException e) {
            System.out.println("Please try again and enter a number.");
            main(args);
        } catch (ArithmeticException ex) {
            System.out.println(ex.getMessage());
            main(args);
        } finally {
            //this will be executed always!!!!
            System.out.println("Thank you, come again");
        }
        //meest generieke->zet deze als laatste ->"Exception" als 'else'
    }
}
