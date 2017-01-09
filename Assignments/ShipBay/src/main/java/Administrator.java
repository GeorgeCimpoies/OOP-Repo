/**
 * Created by George Cimpoies on 1/9/2017.
 */
import java.util.*;

public class Administrator {


    public void returnShipsSortedByName(){
        Collections.sort(ShipBay.shipsInBay, new SortBasedOnName());
        System.out.println("//////////////////////////////////////");
        System.out.println("Ships ordered alphabetically: ");
        for (Ship ship:ShipBay.shipsInBay
             ) {
            System.out.println(ship.getName());
        }
        System.out.println("//////////////////////////////////////");
    }

    public void returnShipsSortedByProfit(){
        Collections.sort(ShipBay.shipsInBay, new Comparator<Ship>() {
            @Override
            public int compare(Ship z1, Ship z2) {
                    return z2.computeProfit() - z1.computeProfit();
            }
        });
        System.out.println("//////////////////////////////////////");
        System.out.println("Ships ordered by their profit: ");
        for (Ship ship:ShipBay.shipsInBay
                ) {
            System.out.println("Ship Name: "+ship.getName()+" Profit: "+ship.computeProfit());
        }
        System.out.println("//////////////////////////////////////");
    }

    public void getShipSummary(String shipId){
        for (Ship ship:ShipBay.shipsInBay) {
            if(ship.getShipIdentification().equals(shipId)){
                System.out.println("//////////////////////////////////////");
                System.out.println("Ship Name: "+ship.getName());
                System.out.println("Ship ID: "+ship.getShipIdentification());
                System.out.println("Number of compartments: "+ship.getCompartmentList().size());
                System.out.println("Profit: "+ship.computeProfit());
                System.out.println("//////////////////////////////////////");
            }
        }
    }

    public void addPassenger(String shipId, String passengerName){
        for (Ship ship:ShipBay.shipsInBay) {
            if(ship.getShipIdentification().equals(shipId)){
                for (PassengerCompartment compartment: (LinkedHashSet<PassengerCompartment>) ship.getCompartmentList()
                        ) {
                    compartment.getPassengerList().add(new Passenger(passengerName));
                }
            }
        }
    }

    public void addCargoItem(String shipId, String cargoItemName, int cargoItemProfit, int numberOfCargoItems){
        for (Ship ship:ShipBay.shipsInBay) {
            if(ship.getShipIdentification().equals(shipId)){
                for (CargoCompartment compartment: (LinkedHashSet<CargoCompartment>) ship.getCompartmentList()
                        ) {
                    compartment.addCargoItem(new CargoItem(cargoItemName, cargoItemProfit), numberOfCargoItems);
                }
            }
        }
    }

}
