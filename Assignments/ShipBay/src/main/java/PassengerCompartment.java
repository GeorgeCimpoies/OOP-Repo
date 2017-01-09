import java.util.HashSet;


/**
 * Created by George Cimpoies on 1/9/2017.
 */
public class PassengerCompartment extends Compartment {

    public final int ticketPrice = 100;
    public final int maximumCompartmentCapacity = 100;
    private String passengerCompartmentId;
    private HashSet<Passenger> passengerList;

    public String getPassengerCompartmentId() {
        return passengerCompartmentId;
    }

    public HashSet<Passenger> getPassengerList() {
        return passengerList;
    }

    public PassengerCompartment(){
        this.passengerCompartmentId = UniqueIdProvider.getInstance().getUniqueId();
        this.passengerList  = new HashSet<>();
    }

    public int computeProfit() {
        return passengerList.size()*ticketPrice;
    }

    public void addPassenger(String name){
        passengerList.add(new Passenger(name));
    }
}
