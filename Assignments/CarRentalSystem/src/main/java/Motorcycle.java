import java.util.UUID;

/**
 * Created by George Cimpoies on 11/17/2016.
 */
public class Motorcycle extends Vehicle {

    public Motorcycle() {
        this.setVehicleId(UUID.randomUUID().hashCode());
        this.setStatus(Vehicle.status.AVAILABLE);
        this.setFuelType(Vehicle.fuelType.ELECTRIC);
        this.setRentalPrice(80);
        this.setVehicleMake("Suzuki");
        this.setVehicleModel("A9");
        this.setVehicleType(Vehicle.vehicleType.MOTORCYCLE);
    }
}
