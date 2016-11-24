import java.util.UUID;

/**
 * Created by George Cimpoies on 11/17/2016.
 */
public class Truck extends Vehicle {

    public Truck() {
        this.setVehicleId(UUID.randomUUID().hashCode());
        this.setStatus(Vehicle.status.AVAILABLE);
        this.setFuelType(Vehicle.fuelType.ELECTRIC);
        this.setRentalPrice(120);
        this.setVehicleMake("Volvo");
        this.setVehicleModel("P8");
        this.setVehicleType(Vehicle.vehicleType.TRUCK);
    }
}
