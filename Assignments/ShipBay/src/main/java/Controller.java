/**
 * Created by George Cimpoies on 1/9/2017.
 */
import java.util.*;

public class Controller {

    public static void main(String[] args){
        Ship ship1 = new Ship("HMS Titanic", ShipType.PASSENGER);
        Ship ship2 = new Ship("HMS Aubrey", ShipType.PASSENGER);
        Ship ship3 = new Ship("Santa Maria", ShipType.CARGO);


        ShipBay.getInstance().receiveShip(ship1);
        ShipBay.getInstance().receiveShip(ship2);
        ShipBay.getInstance().receiveShip(ship3);

        CargoItem sugar = new CargoItem("Sugar", 20);

        PassengerCompartment passengerCompartment1 = new PassengerCompartment();
        PassengerCompartment passengerCompartment2= new PassengerCompartment();
        PassengerCompartment passengerCompartment3 = new PassengerCompartment();
        CargoCompartment cargoCompartment1 = new CargoCompartment(sugar, 40);

        ship1.getCompartmentList().add(passengerCompartment1);
        ship1.getCompartmentList().add(passengerCompartment2);
        ship2.getCompartmentList().add(passengerCompartment3);
        ship3.getCompartmentList().add(cargoCompartment1);

        passengerCompartment1.addPassenger("Michael");
        passengerCompartment1.addPassenger("Sarah");
        passengerCompartment1.addPassenger("David");
        passengerCompartment2.addPassenger("Peter");

        Administrator admin = new Administrator();
        admin.getShipSummary(ship1.getShipIdentification());
        admin.getShipSummary(ship3.getShipIdentification());
        admin.returnShipsSortedByName();
        admin.returnShipsSortedByProfit();


    }

}
