package codekata.wars;

import java.util.Map;

public class DescendingOrder {

    public static void main(String[] args) {
        System.out.println(sortDesc(20));
    }

    //Your task is to make a function that can take any non-negative integer as a argument
    // and return it with its digits in descending order.
    // Essentially, rearrange the digits to create the highest possible number.

    //Examples:
    //Input: 21445 Output: 54421

    //Input: 145263 Output: 654321

    //Input: 1254859723 Output: 9875543221

    public static int sortDesc(final int num) {
        //Your code

        //make listing/dict of all numbers->go over the numbers and make count of them->then can concatinate in tring->to integer

        if (num >= 0) {
           return Integer.parseInt(orderedNumbers(Integer.toString(num)));
        }

        return -1;
    }

    private static String orderedNumbers(String numString) {
        String orderedNumbersString = "";

        char[] numbersToLookFor = {'9', '8', '7', '6', '5', '4', '3', '2', '1', '0'};

        for (char num : numbersToLookFor) {
            orderedNumbersString = orderedNumbersString + numberOfRepeatedElements(numString, num);
        }

        return orderedNumbersString;
    }

    private static String numberOfRepeatedElements(String fullNumbers, char numberToFind) {
        String repeatedString = "";
        String fullNumberToInvestigate = fullNumbers;

        while (fullNumberToInvestigate.contains(Character.toString( numberToFind))) {
            fullNumberToInvestigate = fullNumberToInvestigate.substring(fullNumberToInvestigate.indexOf(numberToFind)+1);
            repeatedString = repeatedString + numberToFind;
        }

        return repeatedString;
    }


}
