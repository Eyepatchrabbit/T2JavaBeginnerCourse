package main.TimBuchalka.javacourse;

public class NumberOfDaysInMonth {
    public static boolean isLeapYear(int year) {
        if (year > 0 && year < 10000) {
            if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
                return true;
            }
        }
        return false;
    }

    public static int getDaysInMonth(int month, int year) {
        if ((month > 0 && month < 13) && (year > 0 && year < 10000)) {
            if (isLeapYear(year) && month == 2) {
                return 29;
            } else {
                if (month == 1) {
                    return 31;
                } else if (month == 2) {
                    return 28;
                } else if (month == 3) {
                    return 31;
                } else if (month == 4) {
                    return 30;
                } else if (month == 5) {
                    return 31;
                } else if (month == 6) {
                    return 30;
                } else if (month == 7) {
                    return 31;
                } else if (month == 8) {
                    return 31;
                } else if (month == 9) {
                    return 30;
                } else if (month == 10) {
                    return 31;
                } else if (month == 11) {
                    return 30;
                } else if (month == 12) {
                    return 31;
                }
            }
        }
        return -1;
    }


}
