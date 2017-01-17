

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * Created by cimpo_keyo3s2 on 20/12/2016.
 */
public class Airport {

    private static Airport ourInstance = new Airport();

    public static Airport getInstance() {
        return ourInstance;
    }

    private Airport() {
    }

    static ArrayList<Plane> planesInAirport = new ArrayList<Plane>();
    static ArrayList<Ticket> tickets = new ArrayList<Ticket>();

    public void departPlane(String planeId) {

        for (Plane Plane : planesInAirport
                ) {
            if (Plane.getPlaneIdentification().equals(planeId)) {
                planesInAirport.remove(Plane);
            }
        }
    }

    public void receivePlane(Plane Plane) {

        planesInAirport.add(Plane);

    }

    public boolean isInBay(String planeId) {

        for (Plane Plane : planesInAirport
                ) {
            if (Plane.getPlaneIdentification().equals(planeId)) return true;
        }
        return false;
    }

    public int computeProfit() {
        int profit = 0;
        for (Plane plane : planesInAirport) {
            profit += plane.computeProfit();
        }
        return profit;
    }

    public void statusOfOne(String planeId){
        for (Plane plane:Airport.planesInAirport) {
            if(plane.getPlaneIdentification().equals(planeId)){
                System.out.println("//////////////////////////////////////");
                System.out.println("Name: "+plane.getName());
                System.out.println("Status: "+plane.getplaneStatus());
                System.out.println("Profit: "+plane.computeProfit());
                System.out.println("//////////////////////////////////////");
            }
        }
    }
    public void statusOfAll(){
        for (Plane plane:Airport.planesInAirport) {
            System.out.println("//////////////////////////////////////");
                System.out.println("Name "+plane.getName());
                System.out.println("Status "+plane.getplaneStatus());
                System.out.println("profit "+plane.computeProfit());
            System.out.println("//////////////////////////////////////");
        }
    }

    public void returnPlanesSortedByName() {
        Collections.sort(Airport.planesInAirport, new SortBasedOnName());
        System.out.println("//////////////////////////////////////");
        System.out.println("Planes ordered alphabetically: ");
        for (Plane plane : Airport.planesInAirport
                ) {
            System.out.println(plane.getName());
        }
        System.out.println("//////////////////////////////////////");
    }

    public void returnPlanesSortedByProfit() {
        Collections.sort(Airport.planesInAirport, new Comparator<Plane>() {

            public int compare(Plane z1, Plane z2) {
                return z2.computeProfit() - z1.computeProfit();
            }
        });
        System.out.println("//////////////////////////////////////");
        System.out.println("Planes ordered by their profit: ");
        for (Plane plane : Airport.planesInAirport
                ) {
            System.out.println("Name: " + plane.getName() + " Profit: " + plane.computeProfit());
        }
        System.out.println("//////////////////////////////////////");
    }

    public void listAllPassengers(String planeId){
        for (Ticket ticket:Airport.tickets) {
            for (Plane plane:Airport.planesInAirport) {
                if(plane.getPlaneIdentification().equals(planeId)){
                    for (Seat seat:plane.getSeatList()) {
                        if(seat == ticket.getSeat()){
                            System.out.println("Passenger Name: "+ticket.getPassenger().getName());
                        }
                    }
                }
            }
        }
    }

    public void changePlaneStatus(String planeId, Plane.PlaneStatus status){
        for (Plane plane:Airport.planesInAirport) {
            if(plane.getPlaneIdentification().equals(planeId)){
                plane.setPlaneStatus(status);
            }
        }
    }


}
