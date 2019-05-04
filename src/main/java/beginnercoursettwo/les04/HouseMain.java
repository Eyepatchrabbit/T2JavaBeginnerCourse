package beginnercoursettwo.les04;

public class HouseMain {
    public static void main(String[] args) {

        House starthouse = new House("Groenstraat 25");
        starthouse.setRooms(6);
        System.out.println("For starthouse: The adress is " + starthouse.getAdress() + " and has " + starthouse.getRooms() + " rooms");

        House thorpark = new House("Thor Park Genk");
        thorpark.setRooms(20);
        System.out.println("For Thorpark: The adress is " + thorpark.getAdress() + " and has " + thorpark.getRooms() + " rooms");

        House stadionGenk = new House("Stadion Genk");
        System.out.println("For stadionGenk: The adress is " + stadionGenk.getAdress() + " and has " + stadionGenk.getRooms() + " rooms");
        stadionGenk.setRooms(10);
        System.out.println("For stadionGenk: The adress is " + stadionGenk.getAdress() + " and has " + stadionGenk.getRooms() + " rooms");

        thorpark.print();
        stadionGenk.print();

        HouseGarden thorGarden = new HouseGarden(8);
        thorpark.setHouseGarden(thorGarden);
        thorpark.print();

        House parkRestaurant = new House("Park Genk", 4);
        parkRestaurant.print();

        HouseGarden chineseGarden = new HouseGarden(100);
        House chinesePark = new House("Haselt Ring", chineseGarden);

        House library = new House("Genk centrum", null);
        library.print();
    }
}
