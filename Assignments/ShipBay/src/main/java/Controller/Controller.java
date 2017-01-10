package controller; /**
 * Created by George Cimpoies on 1/9/2017.
 */

import entities.Administrator;
import entities.ShipBay;
import ship.*;

public class Controller {

    public static void main(String[] args) {

        System.out.println("ship.ship Bay Initialized");

        Ship ship1 = new Ship("HMS Titanic", Ship.ShipType.PASSENGER, 3);
        Ship ship2 = new Ship("HMS Aubrey", Ship.ShipType.PASSENGER, 5);
        Ship ship3 = new Ship("Santa Maria", Ship.ShipType.CARGO, 4);


        ShipBay.getInstance().receiveShip(ship1);
        ShipBay.getInstance().receiveShip(ship2);
        ShipBay.getInstance().receiveShip(ship3);

        Administrator admin = new Administrator();

        admin.addPassenger(ship1.getShipIdentification(), "Michael");
        admin.addPassenger(ship1.getShipIdentification(), "Sarah");
        admin.addPassenger(ship1.getShipIdentification(), "David");
        admin.addPassenger(ship1.getShipIdentification(), "Cornelius");
        admin.addPassenger(ship1.getShipIdentification(), "Irina");

        admin.addCargoItem(ship3.getShipIdentification(), "Sugar", 20, 25);
        admin.addCargoItem(ship3.getShipIdentification(), "Wine", 40, 100);

        admin.getShipSummary(ship1.getShipIdentification());
        admin.getShipSummary(ship3.getShipIdentification());
        admin.returnShipsSortedByName();
        admin.returnShipsSortedByProfit();
    }

}
