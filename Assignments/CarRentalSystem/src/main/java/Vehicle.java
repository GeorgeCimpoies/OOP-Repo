/**
 * Created by George Cimpoies on 11/17/2016.
 */
public abstract class Vehicle {

    public enum fuelType {
        DIESEL, PETROL, ELECTRIC
    }

    public enum status {
        AVAILABLE, RENTED
    }

    public enum vehicleType {
        CAR, MOTORCYCLE, TRUCK
    }

    private int vehicleId;
    private String vehicleMake;
    private String vehicleModel;
    private float rentalPrice;
    private fuelType fuelType;
    private status status;
    private vehicleType vehicleType;

    public Vehicle.vehicleType getVehicleType() {
        return vehicleType;
    }

    void setVehicleType(Vehicle.vehicleType vehicleType) {
        this.vehicleType = vehicleType;
    }

    int getVehicleId() {
        return vehicleId;
    }

    void setVehicleId(int vehicleId) {
        this.vehicleId = vehicleId;
    }

    String getVehicleMake() {
        return vehicleMake;
    }

    void setVehicleMake(String vehicleMake) {
        this.vehicleMake = vehicleMake;
    }

    String getVehicleModel() {
        return vehicleModel;
    }

    void setVehicleModel(String vehicleModel) {
        this.vehicleModel = vehicleModel;
    }

    float getRentalPrice() {
        return rentalPrice;
    }

    void setRentalPrice(float rentalPrice) {
        this.rentalPrice = rentalPrice;
    }

    Vehicle.fuelType getFuelType() {
        return fuelType;
    }

    void setFuelType(Vehicle.fuelType fuelType) {
        this.fuelType = fuelType;
    }

    Vehicle.status getStatus() {
        return status;
    }

    void setStatus(Vehicle.status status) {
        this.status = status;
    }
}
