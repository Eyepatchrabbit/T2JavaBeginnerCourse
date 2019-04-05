package TimBuchalka.javacourse;

public class LeapOfYear {
    public static void main(String[] args) {
        System.out.println(isLeapYear(-1600));
        System.out.println(isLeapYear(1600));
        System.out.println(isLeapYear(2017));
        System.out.println(isLeapYear(2000));
        System.out.println(isLeapYear(10000));

    }

    public static boolean isLeapYear(int year) {
        if (year >= 10000 || year < 1) {
            return false;
        } else if (((year % 4 == 0) && (year % 100 != 0)) || year % 400 == 0) {
            return true;
        }

        return false;

    }
}
