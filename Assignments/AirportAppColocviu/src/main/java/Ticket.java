/**
 * Created by George Cimpoies on 1/17/2017.
 */


public class Ticket {

    private final String ticketId;
    private int price;
    private Seat seat;
    private Passenger passenger;

    public void setPrice(int price) {
        this.price = price;
    }

    public Ticket(Passenger passenger, Seat seat){
        this.ticketId = UniqueIdProvider.getInstance().getUniqueId();
        this.price = 50 + (int)(Math.random() * 51);
        this.passenger = passenger;
        this.seat = seat;

    }

    public Ticket(Passenger passenger, Seat seat, int aditionalPrice){
        this.ticketId = UniqueIdProvider.getInstance().getUniqueId();
        this.price = 50 + (int)(Math.random() * 51) + aditionalPrice;
        this.passenger = passenger;
        this.seat = seat;

    }

    public Seat getSeat() {
        return seat;
    }

    public void setSeat(Seat seat) {
        this.seat = seat;
    }

    public Passenger getPassenger() {
        return passenger;
    }

    public void setPassenger(Passenger passenger) {
        this.passenger = passenger;
    }

    public String getTicketId() {
        return ticketId;
    }

    public int getPrice() {
        return price;
    }
}
