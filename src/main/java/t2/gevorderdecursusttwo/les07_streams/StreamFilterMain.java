package t2.gevorderdecursusttwo.les07_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamFilterMain {
    public static void main(String[] args) {
        //using filter -> Predicate
        List<String> wordList = Arrays.asList("Bear", "Wolf", "Giraf", "Bat", "Cricket");
        List<String> filteredWords = wordList.stream().filter(word -> word.contains("a")).collect(Collectors.toList());
        filteredWords.forEach(System.out::println);

        Function<String, String> replaceWithAlt = word -> word.replaceAll("a", "@");

        //Now atering the contence of the elements -> using "map"
        List<String> newWords = Arrays.asList("ichi", "ni", "san", "yon", "go", "roku", "nana", "hachi", "kyuu", "juu");
        List<String> altered = newWords.stream().map(words -> words.replaceAll("a", "@")).collect(Collectors.toList());
        altered.forEach(System.out::println);

        //with function variable used:
        List<String> altered2 = wordList.stream().map(replaceWithAlt).collect(Collectors.toList());
        altered2.forEach(System.out::println);

        //transformations from one form to another
        List<String> numbers = Arrays.asList("123", "563", "982", "433", "199");
        List<Integer> actualNumbers = numbers.stream().map(number -> Integer.parseInt(number)).collect(Collectors.toList());
        actualNumbers.forEach(System.out::println);

        //first here intermediate sum =>first time = 0
        int sum = actualNumbers.stream().reduce(0, (first, second) -> first + second);
        System.out.println(sum);
    }
}
