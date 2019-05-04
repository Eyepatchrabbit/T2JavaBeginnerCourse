package beginnercoursettwo.les04;

import java.util.Scanner;

public class Fibonachi {
    /**
     * De rij (ook wel reeks van Fibonacci genoemd) begint met 0 en 1 en vervolgens is elk volgende element van de rij steeds de som van de twee voorgaande elementen. De eerste elementen van de rij[1] zijn dan als volgt:
     * <p>
     * 0, 1, 1, 2, 3, 5, 8, 13, 21, 34, 55, 89, 144, 233, 377, 610, 987, 1597, 2584, 4181, 6765, 10946, ...
     */

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        try {
            System.out.println("geef nummer tot waar fibonatchi moet komen");
            int highest = input.nextInt();

            int first = 0;
            int second = 1;
            int som = first + second;

            System.out.println(first);

            while (som <= highest) {
                System.out.println(som);
                first = second;
                second = som;
                som = first + second;
            }

        } finally {
            input.close();
        }


    }
}
