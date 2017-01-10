package compartments;

import carriables.CargoItem;
import uniqueIdProvider.UniqueIdProvider;

/**
 * Created by George Cimpoies on 1/9/2017.
 */
public class CargoCompartment implements Compartment {

    private String cargoCompartmentId;
    private CargoItem cargoItem;
    private int numberOfItems;

    public String getCargoCompartmentId() {
        return cargoCompartmentId;
    }

    public CargoItem getCargoItem() {
        return cargoItem;
    }

    public CargoCompartment() {
        this.cargoCompartmentId = UniqueIdProvider.getInstance().getUniqueId();
    }

    public int computeProfit() {
        return cargoItem.getProfit()*numberOfItems;
    }

    public void addCargoItem(CargoItem cargoItem, int numberOfItems){
        this.cargoItem = cargoItem;
        this.numberOfItems = numberOfItems;
    }

}
