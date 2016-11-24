import java.util.ArrayList;
import java.util.HashMap;
import java.util.UUID;

/**
 * Created by George Cimpoies on 11/16/2016.
 */
public class StorageArea {

    private HashMap<Integer, ArrayList<Shelf>> shelves;
    private String storageAreaId;
    private final int numberOfShelves = 10;
    private final int floorCount = 4;
    private final int slotCount = 40;

    public StorageArea(String storageAreaIdentification) {
        shelves = new HashMap<>();

        for(int i = 1; i<= floorCount; i++){
            shelves.put(i, new ArrayList<Shelf>());
            shelves.get(i).add(new Shelf(UniqueIdProvider.getInstance().getUniqueId(), slotCount));
            shelves.get(i).add(new Shelf(UniqueIdProvider.getInstance().getUniqueId(), slotCount));
        }

        if(storageAreaIdentification.length() == 4) {
            this.storageAreaId = storageAreaIdentification;
        }
        else{
            throw new IllegalArgumentException("Invalid Storage Area Identification Key");
        }
    }

    public String getStorageAreaId() {
        return storageAreaId;
    }

}
