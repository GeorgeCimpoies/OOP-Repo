package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class Aligator extends Reptile {

    public Aligator() {
        this.setName("Chainsaw");
        this.setNrOfLegs(6);
        this.setLaysEggs(true);
    }

    public Aligator(String name, int nrOfLegs, boolean laysEggs){
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setLaysEggs(laysEggs);
    }

}
