package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class Tiger extends Mammal {

    public Tiger() {
        this.setName("Leus");
        this.setNormalBodyTemp(38.6f);
        this.setNrOfLegs(4);
        this.setPercBodyHair(0.98f);
    }

    public Tiger(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair){
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setNormalBodyTemp(normalBodyTemp);
        this.setPercBodyHair(percBodyHair);
    }

}
