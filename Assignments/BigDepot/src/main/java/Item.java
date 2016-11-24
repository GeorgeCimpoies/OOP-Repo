import java.util.Date;

/**
 * Created by George Cimpoies on 11/16/2016.
 */
public class Item {

    private Long itemId;
    private String brand;
    private String name;
    private Date manufacturingDate;
    private boolean isLent;

    public boolean getIsLent() {
        return isLent;
    }

    public void setLent(boolean lent) {
        isLent = lent;
    }

    public Item(Long itemIdentificationKey, String brand, String name, Date manufacturingDate) {

        if(Math.ceil(itemIdentificationKey) != 13)
            throw new IllegalArgumentException("Identification key invalid: "+ itemIdentificationKey);

        this.itemId = itemIdentificationKey;
        this.brand = brand;
        this.name = name;
        this.manufacturingDate = manufacturingDate;
    }

    public Long getItemId() {
        return itemId;
    }

    public String getBrand() {
        return brand;
    }

    public String getName() {
        return name;
    }

    public Date getManufacturingDate() {
        return manufacturingDate;
    }

}
