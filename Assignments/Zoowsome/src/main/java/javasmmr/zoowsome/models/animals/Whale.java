package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class Whale extends Aquatic {

    public Whale() {
        this.setName("Julie");
        this.setNrOfLegs(0);
        this.setAvgSwimDepth(80);
        this.setWaterType(WaterType.SALTWATER);
    }

    public Whale(String name, int nrOfLegs, int avgSwimDepth, WaterType waterType){
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setAvgSwimDepth(avgSwimDepth);
        this.setWaterType(waterType);
    }

}
