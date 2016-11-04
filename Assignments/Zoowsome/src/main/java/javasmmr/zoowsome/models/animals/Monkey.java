package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class Monkey extends Mammal {

    public Monkey() {
        this.setName("Gaspar");
        this.setNormalBodyTemp(35.6f);
        this.setNrOfLegs(2);
        this.setPercBodyHair(0.95f);
    }

    public Monkey(String name, int nrOfLegs, float normalBodyTemp, float percBodyHair){
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setNormalBodyTemp(normalBodyTemp);
        this.setPercBodyHair(percBodyHair);

    }
}
