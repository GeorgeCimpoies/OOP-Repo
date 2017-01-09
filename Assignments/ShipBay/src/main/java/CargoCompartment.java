import java.util.HashSet;

/**
 * Created by George Cimpoies on 1/9/2017.
 */
public class CargoCompartment extends Compartment {

    private String cargoCompartmentId;
    private CargoItem cargoItem;
    private int numberOfItems;

    public String getCargoCompartmentId() {
        return cargoCompartmentId;
    }

    public CargoItem getCargoItem() {
        return cargoItem;
    }

    public CargoCompartment(CargoItem cargoItem, int numberOfItems) {
        this.cargoCompartmentId = UniqueIdProvider.getInstance().getUniqueId();
        this.cargoItem = cargoItem;
        this.numberOfItems = numberOfItems;
    }

    public int computeProfit() {
        return cargoItem.getProfit()*numberOfItems;
    }

}
