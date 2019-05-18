package beginnercoursettwo.les06;

import beginnercoursettwo.les04.House;
import beginnercoursettwo.les04.HouseGarden;

public class HouseEquals {

    public static void main(String[] args) {
        House house1 = new House("Thor Park");
        House house2 = new House("Thor Park");
        House house3 = new House("Genk Stadion");

        System.out.print("Comparing house1 and house2: ");
        housesEqualPrint(house1, house2);

        System.out.print("Comparing house1 and house3: ");
        housesEqualPrint(house1, house3);

        System.out.print("Set rooms in house1: ");
        house1.setRooms(3);
        housesEqualPrint(house1, house2);

        System.out.print("Set as much rooms in house2: ");
        house2.setRooms(3);
        housesEqualPrint(house1, house2);

        System.out.print("add garden to house1: ");
        house1.setHouseGarden(new HouseGarden(2));
        housesEqualPrint(house1, house2);

    }

    private static void housesEqualPrint(House house1, House house2) {
        if (house1.equals(house2)) {
            System.out.println("De huizen zijn hetzelfde");
        } else {
            System.out.println("De huizen zijn niet hetzelfde");
        }
    }


}
