package TimBuchalka.javacourse;

public class HasEqualSum {
    public static void main(String[] args) {
        System.out.println(hasEqualSum(1, 1, 1));
        System.out.println(hasEqualSum(1, 1, 2));
        System.out.println(hasEqualSum(1, -1, 0));
    }


    public static boolean hasEqualSum(int firstNumber, int secondNumber, int possibleSum) {
        if (firstNumber + secondNumber == possibleSum) {
            return true;
        }

        return false;

    }
}
