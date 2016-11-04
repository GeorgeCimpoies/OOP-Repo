package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class Butterfly extends Insect {

    public Butterfly() {
        this.setName("Fluflu");
        this.setDangerous(false);
        this.setNrOfLegs(6);
        this.setCanFly(true);
    }

    public Butterfly(String name, int nrOfLegs, boolean isDangerous, boolean canFly){
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setDangerous(isDangerous);
        this.setCanFly(canFly);

    }

}
