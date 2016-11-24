
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.UUID;
/**
 * Created by George Cimpoies on 11/17/2016.
 */
public class RentalSystem {

    public RentalSystem() {

        listOfVehicles = new ArrayList<>();
        listOfCustomers = new ArrayList<>();

        Employee.addNewCustomer();
        Employee.addNewCustomer();
        Employee.addNewCustomer();
        Employee.addNewCustomer();
        Employee.addNewVehicle(Vehicle.vehicleType.CAR);
        Employee.addNewVehicle(Vehicle.vehicleType.CAR);
        Employee.addNewVehicle(Vehicle.vehicleType.TRUCK);
        Employee.addNewVehicle(Vehicle.vehicleType.MOTORCYCLE);
    }

    static ArrayList<Vehicle> listOfVehicles;
    static ArrayList<Customer> listOfCustomers;

    public Vehicle returnCar(int carId) throws Exception{
        boolean found = false;
        for (Vehicle car:RentalSystem.listOfVehicles
             ) {
            if(car.getVehicleId() == carId) return car;
            else throw new Exception("The car with the provided ID does not exist");
        }
        return null;
    }

}
