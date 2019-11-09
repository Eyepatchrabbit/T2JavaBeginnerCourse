package t2.gevorderdecursusttwo.les07_streams;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamFilterMain {
    public static void main(String[] args) {
        List<String> wordList = Arrays.asList("Bear", "Wolf", "Giraf", "Bat", "Cricket");

        List<String> filteredWords= wordList.stream().filter(word -> word.contains("a")).collect(Collectors.toList());

        filteredWords.forEach(System.out::println);
    }
}
