package TimBuchalka.javacourse;

public class DecimalComparitor {

    public static void main(String[] args) {
        System.out.println(areEqualByThreeDecimalPlaces(-3.1756, -3.175));
        System.out.println(areEqualByThreeDecimalPlaces(3.175, 3.176));
        System.out.println(areEqualByThreeDecimalPlaces(-3.0, -3.0));
        System.out.println(areEqualByThreeDecimalPlaces(3.174, 3.175));

    }

    public static boolean areEqualByThreeDecimalPlaces(double firstNumber, double secondnumber) {


        int first = (int) (firstNumber * 1000);
        int second = (int) (secondnumber * 1000);

        System.out.println(first + " - " + second);

        if (first == second) {
            return true;
        }

        return false;

    }


}
