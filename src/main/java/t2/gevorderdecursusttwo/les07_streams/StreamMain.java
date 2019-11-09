package t2.gevorderdecursusttwo.les07_streams;

import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;
import java.util.stream.Stream;

public class StreamMain {
    public static void main(String[] args) {
        Person person1 = new Person("Bean", "Mister", "M", 55);
        Person person2 = new Person("Donald", "Trump", "M", 53);
        Person person3 = new Person("Helery", "Clinton", "V", 50);

        Person[] persons = {person1, person2, person3};

        //first way to do it
        //Stream<Person> personStream = Arrays.stream(persons);
        Stream<Person> personStream = Stream.of(persons);
        Consumer<Person> consumer = System.out::println;
        personStream.forEach(consumer);

        //second way to do it
        personStream = Arrays.stream(persons);
        personStream.forEach(System.out::println);

        //3th way of doing it
        List<Person> personList = Arrays.asList(person1, person2, person3);
        personList.forEach(System.out::println);

        //bestaat geen "juist" of "fout", enkel voorkeur
    }
}
