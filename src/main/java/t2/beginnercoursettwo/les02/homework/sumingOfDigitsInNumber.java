package t2.beginnercoursettwo.les02.homework;

public class sumingOfDigitsInNumber {
    //    maak een applicatie waarbij je een getal tussen 0 en 10000 ingeeft,
    //    de cijfers van het getal optelt en resultaat afdrukt
    public static void main(String[] args) {
        System.out.println(sumOfDigitsInNumber(1));
        System.out.println(sumOfDigitsInNumber(2000));
        System.out.println(sumOfDigitsInNumber(2001));
        System.out.println(sumOfDigitsInNumber(2143));
        System.out.println(sumOfDigitsInNumber(4572));
        System.out.println(sumOfDigitsInNumber(999));
        System.out.println(sumOfDigitsInNumber(0));
        System.out.println(sumOfDigitsInNumber(-12));
        System.out.println(sumOfDigitsInNumber(120000000));


    }

    protected static int sumOfDigitsInNumber(int number) {
        if (number<0 || number>10000){
            return -1;
        }

        String numberstring = String.valueOf(number);
        int length = numberstring.length();
        int sumTotalAllDigits = 0;
        for (int place = 0; place < length; place++) {
            sumTotalAllDigits += Integer.valueOf(numberstring.substring(place, place + 1));
        }
        return sumTotalAllDigits;
    }


}