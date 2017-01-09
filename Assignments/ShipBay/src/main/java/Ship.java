import java.util.LinkedHashSet;

/**
 * Created by cimpo_keyo3s2 on 20/12/2016.
 */


public class Ship {
    private ShipType shipType;

    public LinkedHashSet<? extends Compartment> getCompartmentList() {
        return compartmentList;
    }

    private LinkedHashSet<Compartment> compartmentList;
    private String shipIdentification;

    public String getName() {
        return name;
    }

    private String name;

    String getShipIdentification() {
        return shipIdentification;
    }

    public Ship(String name, ShipType type, int numberOfCompartments) {
        this.name = name;
        this.shipIdentification = UniqueIdProvider.getInstance().getUniqueId();
        this.shipType = type;
        this.compartmentList = new LinkedHashSet<>();
        for(int i=0; i<numberOfCompartments; i++){
            if(type == ShipType.PASSENGER){
                compartmentList.add(new PassengerCompartment());
            }
            else compartmentList.add(new CargoCompartment());
        }
    }

    public static Ship createCargoShip(String name, int numberOfCompartments) {return new Ship(name, ShipType.CARGO, numberOfCompartments);}
    public static Ship createPassengerShip(String name, int numberOfCompartments) {return new Ship(name, ShipType.PASSENGER, numberOfCompartments);}

    public int computeProfit(){
        int profit = 0;
        for (Compartment compartment: compartmentList) {
            profit += compartment.computeProfit();
        }
        return profit;
    }

}
