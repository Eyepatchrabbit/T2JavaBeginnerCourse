package t2.gevorderdecursusttwo.les04generieken;

import t2.gevorderdecursusttwo.les02.zoo.animals.Animal;
import t2.gevorderdecursusttwo.les02.zoo.animals.Monkey;
import t2.gevorderdecursusttwo.les02.zoo.animals.Snake;
import t2.gevorderdecursusttwo.les02.zoo.animals.Tiger;

public class ObjectUtil {

    //public static <s> void print(s param) {
    public static <s extends Animal> s print(s param) {//Hier meer rechtlijnene geven
        System.out.println(param.getClass() + " - " + param);
        return param;
    }

    public static <s, t> s print(s param, t param2) {
        System.out.println(param.getClass() + " - " + param);
        System.out.println(param2.getClass() + " - " + param2);
        return param;
    }

    public static void main(String[] args) {
        //print("hello");
        print(5, "hello");

        print(new Snake());
        print(new Tiger());
        print(new Animal() {
            @Override
            public String makeNoise() {
                return "noise";//->dit doen omdat in origineel niet is aangezet wat noise is, pas in overervende klassen
            }//hier maak anonieme klasse->dus in print zal $1 krijgen ->java compiler zal nieuwe klasse toevoegen die Animal extends
        });

        System.out.println(print(new Monkey()).makeNoise()); //can then use all the methods later for the object done
    }


}
