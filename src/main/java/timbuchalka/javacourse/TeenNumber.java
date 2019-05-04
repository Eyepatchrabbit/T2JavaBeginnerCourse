package timbuchalka.javacourse;

public class TeenNumber {

    public static void main(String[] args) {
        System.out.println(hasTeen(9, 99, 19));
        System.out.println(hasTeen(23, 15, 42));
        System.out.println(hasTeen(22, 23, 34));

    }


    public static boolean hasTeen(int first, int second, int third) {
        int[] listNumbers = {first, second, third};

        for (int numberToCheck : listNumbers) {
            if (numberToCheck > 12 && numberToCheck < 20) {
                return true;
            }
        }
        return false;

    }


}
