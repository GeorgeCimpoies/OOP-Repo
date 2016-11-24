/**
 * Created by George Cimpoies on 11/17/2016.
 */
public class Employee {

    public static void addNewVehicle(Vehicle.vehicleType vehicleType) {

        switch (vehicleType) {
            case CAR:
                RentalSystem.listOfVehicles.add(new Car());
                break;
            case MOTORCYCLE:
                RentalSystem.listOfVehicles.add(new Motorcycle());
                break;
            case TRUCK:
                RentalSystem.listOfVehicles.add(new Truck());
                break;
            default:
                throw new IllegalArgumentException("Illegal vehicle type");
        }
    }

    public static void addNewCustomer() {

        RentalSystem.listOfCustomers.add(new Customer());
    }
}
