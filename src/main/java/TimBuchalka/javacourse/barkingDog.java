package main.java.TimBuchalka.javacourse;

public class barkingDog {

    public static void main(String[] args) {
        System.out.println(bark(true, 1));
        System.out.println(bark(false, 2));
        System.out.println(bark(true, 8));
        System.out.println(bark(true, -1));
    }

    public static boolean bark(boolean barking, int hourOfTheDay) {
        if (hourOfTheDay > 23 || hourOfTheDay < 0) {
            return false;
        } else if (barking && ((hourOfTheDay < 8) || (hourOfTheDay > 22))) {
            return true;
        }
        return false;

    }

}
