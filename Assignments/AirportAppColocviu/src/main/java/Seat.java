/**
 * Created by George Cimpoies on 1/17/2017.
 */
public class Seat {

    public enum SeatType {
        PASSENGER,
        CREWSTUFF
    }

    public boolean isTaken;

    private SeatType seatType;

    public SeatType getSeatType() {
        return seatType;
    }

    public String getSeatId() {
        return seatId;
    }

    private final String seatId;

    public Seat(SeatType type) {
        this.seatId = UniqueIdProvider.getInstance().getUniqueId();
        this.seatType = type;
    }

    public static Seat creatPassengerSeat() {
        return new Seat(SeatType.PASSENGER);
    }

    public static Seat crewStuffSeat() {
        return new Seat(SeatType.CREWSTUFF);
    }

}
