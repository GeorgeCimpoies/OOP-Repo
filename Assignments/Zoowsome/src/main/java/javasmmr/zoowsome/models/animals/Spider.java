package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class Spider extends Insect {

    public Spider() {
        this.setName("The Forsaken One");
        this.setDangerous(true);
        this.setNrOfLegs(8);
        this.setCanFly(false);
    }

    public Spider(String name, int nrOfLegs, boolean isDangerous, boolean canFly){
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setDangerous(isDangerous);
        this.setCanFly(canFly);

    }

}
