package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class Cockroach extends Insect {

    public Cockroach() {
        this.setName("Spike");
        this.setDangerous(false);
        this.setNrOfLegs(8);
        this.setCanFly(false);
    }

    public Cockroach(String name, int nrOfLegs, boolean isDangerous, boolean canFly){
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setDangerous(isDangerous);
        this.setCanFly(canFly);

    }

}
