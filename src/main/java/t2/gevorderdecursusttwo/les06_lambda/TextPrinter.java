package t2.gevorderdecursusttwo.les06_lambda;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;

public class TextPrinter {

    private String words;

    public TextPrinter(String words) {
        this.words = words;
    }

    public void printFilteredWords(WordFilter wordFilter) {
        String[] wordArray = words.split(" ");
        for (String word : wordArray) {
            if (wordFilter.isValid(word)) {
                System.out.println(word);
            }
        }
    }

    //met predicate -> hoe normaal correct gedaan !!!!
    public void printFilteredWordsWithPredicate(Predicate<String> predicate) {
        String[] wordArray = words.split(" ");
        for (String word : wordArray) {
            if (predicate.test(word)) {
                System.out.println(word);
            }
        }
    }

    //combineren van de 2
    public void printFilteredWordsWithPredicate(Predicate<String> predicate, Consumer<String> consumer) {
        String[] wordArray = words.split(" ");
        for (String word : wordArray) {
            if (predicate.test(word)) {
                consumer.accept(word);
            }
        }
    }




    public void printScrambledWords(WordScrambler wordScrambler) {
        System.out.println(wordScrambler.scramble(this.words));
    }

    public void printNumbers(Function<String, Long> function, String number) {
        System.out.println(function.apply(number));
    }

}