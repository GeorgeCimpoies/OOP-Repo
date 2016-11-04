package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class Dolphin extends Aquatic {

    public Dolphin() {
        this.setName("Sarah");
        this.setNrOfLegs(0);
        this.setAvgSwimDepth(30);
        this.setWaterType(WaterType.SALTWATER);
    }

    public Dolphin(String name, int nrOfLegs, int avgSwimDepth, WaterType waterType){
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setAvgSwimDepth(avgSwimDepth);
        this.setWaterType(waterType);
    }

}
