package t2.gevorderdecursusttwo.les02.abstractvehicles;

import java.util.ArrayList;

public class VehicleMain {

    public static void main(String[] args) {
        ArrayList<Vehicle> vehicles = new ArrayList<>();

        vehicles.add(new Car());
        vehicles.add(new Bus());
        vehicles.add(new Ship());
        vehicles.add(new Submarine());
        vehicles.add(new Airplane());
        vehicles.add(new Baloon());

        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle.getType() + " is a vehicle for on " + vehicle.getSurface());
        }
    }
}
