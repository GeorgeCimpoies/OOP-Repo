/**
 * Created by George Cimpoies on 1/17/2017.
 */
public class Controller {

    public static void main(String[] args) {

        System.out.println("Airport App Initialized");

        Plane plane1 = new Plane("Tarom", 120);
        Plane plane2 = new Plane("Elizabeth", 80);
        Plane plane3 = new Plane("Quatar", 200);

        Passenger passenger1 = new Passenger("Mihai");
        Passenger passenger2 = new Passenger("Andrei");
        Passenger passenger3 = new Passenger("Paul");

        Seat seat1 = new Seat(Seat.SeatType.PASSENGER);
        Seat seat2 = new Seat(Seat.SeatType.PASSENGER);
        Seat seat3 = new Seat(Seat.SeatType.PASSENGER);
        Seat seat4 = new Seat(Seat.SeatType.PASSENGER);

        plane1.getSeatList().add(seat1);
        plane1.getSeatList().add(seat2);
        plane1.getSeatList().add(seat3);
        plane1.getSeatList().add(seat4);

        Ticket ticket = new Ticket(passenger1, seat1);


        Airport.getInstance().receivePlane(plane1);
        Airport.getInstance().receivePlane(plane2);
        Airport.getInstance().receivePlane(plane3);
        Airport.getInstance().returnPlanesSortedByName();
        Airport.getInstance().returnPlanesSortedByProfit();
        Airport.getInstance().statusOfAll();
        Airport.getInstance().statusOfOne(plane2.getPlaneIdentification());

        //Everything works, I just haven't had enough time to instantiate objects & call methods.


    }

}
