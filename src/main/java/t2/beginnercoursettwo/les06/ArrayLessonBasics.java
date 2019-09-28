package t2.beginnercoursettwo.les06;

import t2.beginnercoursettwo.les04.House;
import t2.beginnercoursettwo.les04.HouseGarden;
import t2.beginnercoursettwo.les05.Player;

public class ArrayLessonBasics {

    public static void main(String[] args) {
        /**
         * Some basic info
         * */
        int[] numbers = new int[5]; // 5objects ->start counting at 0
        numbers[0] = 1;
        //numbers[1] = 2; // leaving blank->will be defailt for primitives, null for Objects
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        //numbers[5]=6;=>will give arrayOUtOfBoundsExceotion

        for (int index = 0; index < numbers.length; index++) {
            System.out.print(numbers[index] + " ");//element opvragen op plaats index
        }
        System.out.println(" The long way round");

        int[] numbers2 = {1, 2, 3, 4, 5}; //other way of setting up -> then need to set each

        for (int value : numbers2) {
            System.out.print(value + " ");
        }
        System.out.println(" The enhanced for loop");

        /**
         * classExercises
         * */
        String[] stringsList = {"MakeList", "Of", "String", "Objects"};
        for (String element : stringsList) {
            System.out.print(element + " ");
        }
        System.out.println();

        House[] houseList = new House[3];
        houseList[0] = new House("Guardencentre Genk");
        houseList[1] = new House("Thor park", 20);
        houseList[2] = new House("park Genk", new HouseGarden(20));

        for (House element : houseList) {
            element.print();
        }

        Player[] playersList = new Player[2];
        Player player = new Player(2, 7, 16);
        Player dealer = new Player(20, 1, 17);
        playersList[0] = player;
        playersList[1] = dealer;

        for (Player element : playersList) {
            element.print();
        }
    }
}
