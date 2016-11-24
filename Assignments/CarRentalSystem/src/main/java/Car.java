import sun.security.x509.AVA;

import java.util.UUID;

/**
 * Created by George Cimpoies on 11/17/2016.
 */
public class Car extends Vehicle {

    public Car() {
        this.setVehicleId(UUID.randomUUID().hashCode());
        this.setStatus(Vehicle.status.AVAILABLE);
        this.setFuelType(Vehicle.fuelType.ELECTRIC);
        this.setRentalPrice(50);
        this.setVehicleMake("Audi");
        this.setVehicleModel("RS8");
        this.setVehicleType(Vehicle.vehicleType.CAR);
    }
}
