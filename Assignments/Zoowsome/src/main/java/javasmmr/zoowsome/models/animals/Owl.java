package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class Owl extends Bird {

    public Owl() {
        this.setName("Smartie");
        this.setNrOfLegs(2);
        this.setAvgFlightAltitude(100);
        this.setMigratory(false);
    }

    public Owl(String name, int nrOfLegs, int avgFlightAltitude, boolean migrates) {
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setAvgFlightAltitude(avgFlightAltitude);
        this.setMigratory(migrates);
    }

}
