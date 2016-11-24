import java.lang.*;
import java.util.ArrayList;
import java.util.UUID;


/**
 * Created by George Cimpoies on 11/17/2016.
 */
public class Customer {

    private int customerId;
    private String name;
    private ArrayList<Vehicle> rentedVehicles;

    public Customer(){
        this.customerId = UUID.randomUUID().hashCode();
        this.name = UUID.randomUUID().toString().substring(0, 4);
    }

    public Customer(int customerId, String name) {
        
        rentedVehicles = new ArrayList<>();
        
        this.customerId = customerId;
        this.name = name;
    }

    public int getCustomerId() {
        return customerId;
    }

    public void setCustomerId(int customerId) {
        this.customerId = customerId;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void rentVehicle(int vehicleId){

        for (Vehicle vehicle:RentalSystem.listOfVehicles
                ) {
            if(vehicle.getVehicleId() == vehicleId){
                rentedVehicles.add(vehicle);
                vehicle.setStatus(Vehicle.status.RENTED);
            }
        }

    }
    
    public void returnVehicle(int vehicleId){

        for (Vehicle vehicle:rentedVehicles
             ) {
            if(vehicle.getVehicleId() == vehicleId){
                rentedVehicles.remove(vehicle);
                vehicle.setStatus(Vehicle.status.AVAILABLE);
            }
        }

    }

}
