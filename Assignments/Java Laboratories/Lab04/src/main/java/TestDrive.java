import java.awt.Color;

/**
 * TestDrive demonstrates creating and calling
 * methods on Car  object.
 *
 * @author Laboratory Team
 */
public class TestDrive {
    Car cars[];
    /**
     * Default number of cars in a test drive
     */
    public static final int NUM_CARS = 5;

    /**
     * Constuctor for class TestDrive
     * makes a test drive for NUM_CARS cars
     */
    TestDrive() {
        this(NUM_CARS);
    }

    /**
     * Constuctor for class TestDrive
     * makes a test drive for numCars cars
     *
     * @param numCars number of cars in atest drive
     */

    TestDrive(int numCars) {
        if (numCars > 0)
            cars = new Car[numCars];
        else
            cars = new Car[NUM_CARS];
    }

    //The Java virtual machine (JVM) always starts
    //execution with the 'main' method of the class passed
    //as a argument to the java command
    public static void main(String[] args) {
        TestDrive td = new TestDrive();
        td.start();
        //exit TestDrive
    }

    public void start() {
        FuelTank fuelTank1 = new FuelTank(120f, 1f);
        Car bmw = new Car("BMW M4", Color.blue, 280, 290, 30, fuelTank1);
        //Take it for a drive
        System.out.println("Starting BMW M4 test drive!");
        driveCar(bmw);
    }

    /**
     * Factory method to create a Car object with valid parameters
     *
     * @param brand            name or manufacturer.
     * @param color            color of the Car object - one of Java color constants
     * @param power            engine power
     * @param accelerationStep increase in speed when gas pedal pushed
     */
    private Car createCar(String brand, Color color, int power, int maxSpeed, int accelerationStep, FuelTank fuelTank1) {
        // TODO validate parameters. If wrong, then give message and create a default configured car
        Car c = new Car(brand, color, power, maxSpeed, accelerationStep, fuelTank1);
        return c;
    }

    /**
     * Displays a list of known cars
     * and allows user to select one using a text-based menu
     *
     * @return the id of the car, nonnegative integer
     */
    private int selectCar() {
        // TODO
        return 0;
    }

    /*
     * Asks for user input for a car identificated by carId
     * and shows the effect of controlling it
     *
     * @param carId id of car; noinnegative integer
     */
    private void driveCar(Car c) {
        // TODO: change to get input from the user
        // TODO: show effect of commands from user
        // former contents
        System.out.print("Car is a " + c.getBrandName());
        System.out.println(" colored  " + c.getColor());
        System.out.print("\t engine power is " + c.getPower());
        System.out.println(" speeding step is " + c.getAcceleration());
        System.out.println(" tank capacity is " + c.getFuelTank().getCapacity());
        System.out.println(" tank level is " + c.getFuelTank().getLevel());
        //press the accelerator 15 "times"
        for (int i = 0; i < 15; i++) {
            System.out.println("accelerating: " + c.accelerate());
            System.out.println("remaining tank level is " + c.getFuelTank().getLevel());
        }
        //release the accelerator 5 "times"
        for (int i = 0; i < 5; i++) {
            ;
            System.out.println("decelerating: " + c.decelerate());
        }
        System.out.println("final cruising speed: " + c.getSpeed());
    }
    /**
     * Provides for controlling what operation to be performed
     * createCar, selectCar, driveCar
     * TODO: decide on parameters and return value
     */

}
