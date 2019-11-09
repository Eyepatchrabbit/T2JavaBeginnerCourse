package t2.gevorderdecursusttwo.les06_lambda;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;

public class TextApp {
    public static void main(String[] args) {
        List<String> wording= Arrays.asList("first","second");

        TextPrinter textPrinter = new TextPrinter("Dit is een test voor het lambda hoofdstuk");

        //using the own construction -> made so could see what is behind it
        System.out.println("first filter");
        textPrinter.printFilteredWords((String word) -> word.contains("e"));
        System.out.println("\nsecond filter");
        textPrinter.printFilteredWords(word -> word.length() > 4);

        System.out.println("\nScrambler");
        textPrinter.printScrambledWords(word -> word.replaceAll("a", "@").replaceAll("i", "1"));

        //->here using the internal functional interfaces!!!!!!
        System.out.println("\nWith Predicate1:");
        textPrinter.printFilteredWordsWithPredicate(word -> word.contains("e"));
        System.out.println("\nWith Predicate2:");
        textPrinter.printFilteredWordsWithPredicate(word -> word.length() > 4);

        //using function ->kunt zo eerst een bewerking doen!
        System.out.println("\nWith Function:");
        textPrinter.printNumbers(numberstring -> Long.parseLong(numberstring) / 2, "7852");

        System.out.println("\nWith predicate and consumer");
        //textPrinter.printFilteredWordsWithPredicate(word -> word.contains("e"), word -> System.out.println(word)); //same as below
        textPrinter.printFilteredWordsWithPredicate(word -> word.contains("e"), System.out::println);//method reference used here


    }
}
