package t2.gevorderdecursusttwo.les02.zoo;

import t2.gevorderdecursusttwo.les02.zoo.animals.Animal;
import t2.gevorderdecursusttwo.les02.zoo.animals.Monkey;
import t2.gevorderdecursusttwo.les02.zoo.animals.Snake;
import t2.gevorderdecursusttwo.les02.zoo.animals.Tiger;
import t2.gevorderdecursusttwo.les02.zoo.persons.Person;
import t2.gevorderdecursusttwo.les02.zoo.persons.Vetrinarian;
import t2.gevorderdecursusttwo.les02.zoo.persons.ZooWarden;
import t2.gevorderdecursusttwo.les02.zoo.persons.Zookeeper;

import java.util.ArrayList;
import java.util.List;

public class ZooMain {
    public static void main(String[] args) {
        List<Animal> animals = new ArrayList<>();
        List<Person> persons = new ArrayList<>();

        animals.add(new Monkey());
        animals.add(new Snake());
        animals.add(new Tiger());

        persons.add(new Zookeeper());
        persons.add(new ZooWarden());
        persons.add(new Vetrinarian());

        for (Animal animal : animals) {
            System.out.println("The noise the animal makes: " + animal.makeNoise());
        }

        for (Person person : persons) {
            System.out.println("The job the person does: " + person.doJob());
        }

    }
}
