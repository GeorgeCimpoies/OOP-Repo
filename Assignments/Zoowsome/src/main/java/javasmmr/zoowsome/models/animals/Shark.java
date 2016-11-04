package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class Shark extends Aquatic {

    public Shark() {
        this.setName("Titan");
        this.setNrOfLegs(0);
        this.setAvgSwimDepth(20);
        this.setWaterType(WaterType.SALTWATER);
    }

    public Shark(String name, int nrOfLegs, int avgSwimDepth, WaterType waterType){
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setAvgSwimDepth(avgSwimDepth);
        this.setWaterType(waterType);
    }


}
