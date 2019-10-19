package t2.gevorderdecursusttwo.les04generieken;

import t2.gevorderdecursusttwo.les02.zoo.animals.Animal;
import t2.gevorderdecursusttwo.les02.zoo.persons.Person;

public class MixedRelation<T extends Animal, S extends Person> extends MixedPairGeneric<T, S> {
}
