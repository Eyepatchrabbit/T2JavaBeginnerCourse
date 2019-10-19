package t2.gevorderdecursusttwo.les04generieken;

import t2.gevorderdecursusttwo.les02.zoo.animals.Monkey;
import t2.gevorderdecursusttwo.les02.zoo.persons.Zookeeper;

public class GenericMain {
    public static void main(String[] args) {

        SingleTon<String> singleTon = new SingleTon<>("This is a generic!");
        System.out.println(singleTon.getSingle());

        SingleTon<Integer> newSingle = new SingleTon<>(1);
        System.out.println(newSingle.getSingle().floatValue()); //so compiler sees what will be used and then allows you to use the methods


        MixedPairGeneric<String, Integer> mixedPairGeneric = new MixedPairGeneric<>();
        mixedPairGeneric.setFirst("Try");
        mixedPairGeneric.setSecond(1);
        System.out.println(mixedPairGeneric.getFirst() + " " + mixedPairGeneric.getSecond());

        MixedPairGeneric<String, Integer> mixedPairGeneric2 = new MixedPairGeneric<>("Attempt", 2);
        System.out.println(mixedPairGeneric2.getFirst() + " " + mixedPairGeneric2.getSecond());

        MixedPairGeneric<String, SingleTon<Integer>> mixedWithSingleTon = new MixedPairGeneric<>(); // Take good look here!!!

        mixedWithSingleTon.setFirst("Second mixed first parameter");
        //mixedWithSingleTon.setSecond(singleTon);//->this will give error because expect a generic for Integer
        mixedWithSingleTon.setSecond(new SingleTon<>(98765));

        System.out.println(mixedWithSingleTon.getFirst() + " : " + mixedWithSingleTon.getSecond().toString());

        System.out.println(singleTon.toString());
        System.out.println(newSingle.toString());


        MixedRelation<Monkey, Zookeeper> mixedRelation = new MixedRelation<>();
        mixedRelation.getFirst();
        mixedRelation.getSecond();

    }
}