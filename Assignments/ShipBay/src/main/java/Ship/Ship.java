package ship;

import compartments.CargoCompartment;
import compartments.Compartment;
import compartments.PassengerCompartment;
import uniqueIdProvider.UniqueIdProvider;

import java.util.LinkedHashSet;

/**
 * Created by cimpo_keyo3s2 on 20/12/2016.
 */


public class Ship {

    public enum ShipType {
        PASSENGER,
        CARGO
    }

    public Ship.ShipType getShipType() {
        return shipType;
    }

    private Ship.ShipType shipType;

    public LinkedHashSet<? extends Compartment> getCompartmentList() {
        return compartmentList;
    }

    private LinkedHashSet<Compartment> compartmentList;
    private String shipIdentification;

    public String getName() {
        return name;
    }

    private String name;

    public String getShipIdentification() {
        return shipIdentification;
    }

    public Ship(String name, Ship.ShipType type, int numberOfCompartments) {
        this.name = name;
        this.shipIdentification = UniqueIdProvider.getInstance().getUniqueId();
        this.shipType = type;
        this.compartmentList = new LinkedHashSet<>();
        for (int i = 0; i < numberOfCompartments; i++) {
            if (type == Ship.ShipType.PASSENGER) {
                compartmentList.add(new PassengerCompartment());
            } else compartmentList.add(new CargoCompartment());
        }
    }

    public static Ship createCargoShip(String name, int numberOfCompartments) {
        return new Ship(name, Ship.ShipType.CARGO, numberOfCompartments);
    }

    public static Ship createPassengerShip(String name, int numberOfCompartments) {
        return new Ship(name, Ship.ShipType.PASSENGER, numberOfCompartments);
    }

    public int computeProfit() {
        int profit = 0;
        for (Compartment compartment : compartmentList) {
            profit += compartment.computeProfit();
        }
        return profit;
    }


}
