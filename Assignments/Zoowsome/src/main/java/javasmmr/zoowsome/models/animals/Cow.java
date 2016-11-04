package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class Cow extends Mammal {

    public Cow() {
        this.setName("Milka");
        this.setNormalBodyTemp(37.2f);
        this.setNrOfLegs(4);
        this.setPercBodyHair(0.98f);
    }

    public Cow(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair){
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setNormalBodyTemp(normalBodyTemp);
        this.setPercBodyHair(percBodyHair);

    }

}
