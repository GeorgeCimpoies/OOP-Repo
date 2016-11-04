package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class Turtle extends Reptile {

    public Turtle() {
        this.setName("Roundy");
        this.setNrOfLegs(4);
        this.setLaysEggs(true);
    }

    public Turtle(String name, int nrOfLegs, boolean laysEggs){
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setLaysEggs(laysEggs);
    }

}
