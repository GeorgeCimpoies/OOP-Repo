import java.util.*;
/**
 * Created by cimpo_keyo3s2 on 20/12/2016.
 */
public class ShipBay {

    private static ShipBay ourInstance = new ShipBay();

    public static ShipBay getInstance() {
        return ourInstance;
    }

    private ShipBay() {
    }

    static ArrayList<Ship> shipsInBay = new ArrayList<>();

    public void departShip(String shipId) {

        for (Ship ship : shipsInBay
                ) {
            if (ship.getShipIdentification().equals(shipId)) {
                shipsInBay.remove(ship);
            }
        }
    }

    public void receiveShip(Ship ship) {

        shipsInBay.add(ship);

    }

    public boolean isInBay(String shipId) {

        for (Ship ship : shipsInBay
                ) {
            if (ship.getShipIdentification().equals(shipId)) return true;
        }
        return false;
    }
}
