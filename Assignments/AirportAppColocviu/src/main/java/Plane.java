

import java.util.HashSet;
import java.util.LinkedHashSet;

/**
 * Created by cimpo_keyo3s2 on 20/12/2016.
 */


public class Plane {

    public int getNumberOfSeats() {
        return numberOfSeats;
    }

    public PlaneStatus getPlaneStatus() {
        return planeStatus;
    }

    public String getName() {
        return name;
    }

    private String name;

    private int numberOfSeats;

    public enum PlaneStatus {
        LANDED,
        DEPARTED,
        INAIRPORT
    }

    public PlaneStatus getplaneStatus() {
        return planeStatus;
    }

    public void setPlaneStatus(PlaneStatus planeStatus) {
        this.planeStatus = planeStatus;
    }

    private PlaneStatus planeStatus;

    private HashSet<Passenger> passengerList;

    public HashSet<Passenger> getPassengerList() {
        return passengerList;
    }

    private HashSet<Seat> seatList;

    public HashSet<Seat> getSeatList() {
        return seatList;
    }


    private String planeIdentification;

    public String getPlaneIdentification() {
        return planeIdentification;
    }

    public Plane(String name, int numberOfSeats) {
        this.name = name;
        this.planeIdentification = UniqueIdProvider.getInstance().getUniqueId();
        this.passengerList = new LinkedHashSet<Passenger>();
        this.seatList = new LinkedHashSet<Seat>();
        this.numberOfSeats = numberOfSeats;
    }



    public int computeProfit() {
        int profit = 0;
        int numberOfVacantSeats = 0;
        for (Seat seat:this.getSeatList()) {
            if(!seat.isTaken) numberOfVacantSeats += 1;
        }
        for (Ticket ticket : Airport.tickets) {
            profit += ticket.getPrice() - 0.3*(numberOfVacantSeats);
        }
        return profit;
    }


}
