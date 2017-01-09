/**
 * Created by George Cimpoies on 1/9/2017.
 */
public class CargoItem implements Carriable {

    private String name;
    private int profit;

    public String getName() {
        return name;
    }

    public int getProfit() {
        return profit;
    }

    public CargoItem(String name, int profit) {
        this.name = name;
        this.profit = profit;
    }

}
