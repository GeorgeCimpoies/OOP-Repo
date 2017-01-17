/**
 * Created by George Cimpoies on 1/17/2017.
 */
public class Passenger {

    public String getName() {
        return name;
    }

    public Passenger(String name){
        this.name = name;
    }

    private String name;

    public Ticket buySpecificTicket(String seatId, String planeId) {
        for (Plane plane : Airport.planesInAirport) {
            if (plane.getPlaneIdentification().equals(planeId)) {
                if (plane.getPassengerList().size() < 100) {
                    for (Seat seat : plane.getSeatList()) {
                        if (seat.getSeatType() == Seat.SeatType.PASSENGER) {
                            if (seat.getSeatId().equals(seatId)) {
                                if (seat.isTaken == false) {
                                    seat.isTaken = true;
                                    return new Ticket(this, seat, 10);
                                }
                            }
                        }
                    }
                }
            }
        }

        return null;
    }

    public Ticket buyRandomTicket(String planeId) {
        for (Plane plane : Airport.planesInAirport) {
            if (plane.getPlaneIdentification().equals(planeId)) {
                if (plane.getPassengerList().size() < 100) {
                    for (Seat seat : plane.getSeatList()) {
                        if (seat.getSeatType() == Seat.SeatType.PASSENGER) {
                            if (seat.isTaken == false) {
                                seat.isTaken = true;
                                return new Ticket(this, seat);

                            }
                        }
                    }
                }
            }

        }
        return null;
    }

    private void cancelTicket(String ticketId) {

    }

}
