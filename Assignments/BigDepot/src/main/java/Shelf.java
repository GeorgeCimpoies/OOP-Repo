import java.util.ArrayList;

/**
 * Created by George Cimpoies on 11/16/2016.
 */
public class Shelf {

    private ArrayList<Item> listOfItems;
    private String shelfId;
    private final int slotCount;

    public Shelf(String shelfId, int slotCount) {

        this.slotCount = slotCount;
        this.shelfId = shelfId;
        listOfItems = new ArrayList<>();

        if (shelfId.length() == 4) this.shelfId = shelfId;
        else {
            throw new IllegalArgumentException("Invalid Shelf Identification Key: " + shelfId);
        }
    }

    public String getStorageAreaIdentification() {
        return shelfId;
    }

    public void AddItem() {

    }

}
