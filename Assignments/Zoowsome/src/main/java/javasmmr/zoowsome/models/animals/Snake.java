package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class Snake extends Reptile {

    public Snake() {
        this.setName("DJ");
        this.setNrOfLegs(0);
        this.setLaysEggs(true);
    }

    public Snake(String name, int nrOfLegs, boolean laysEggs){
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setLaysEggs(laysEggs);
    }

}
