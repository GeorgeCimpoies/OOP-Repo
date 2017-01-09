import java.util.*;


/**
 * Created by George Cimpoies on 1/9/2017.
 */
public class PassengerCompartment extends Compartment {

    public final int ticketPrice = 100;
    public final int maximumCompartmentCapacity = 100;
    private String passengerCompartmentId;
    private LinkedHashSet<Passenger> passengerList;

    public String getPassengerCompartmentId() {
        return passengerCompartmentId;
    }

    public HashSet<Passenger> getPassengerList() {
        return passengerList;
    }

    public PassengerCompartment(){
        this.passengerCompartmentId = UniqueIdProvider.getInstance().getUniqueId();
        this.passengerList  = new LinkedHashSet<>();
    }

    public int computeProfit() {
        return passengerList.size()*ticketPrice;
    }

}
