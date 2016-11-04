package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class Flamingo extends Bird {

    public Flamingo() {
        this.setName("Pinkie");
        this.setNrOfLegs(2);
        this.setAvgFlightAltitude(100);
        this.setMigratory(false);
    }

    public Flamingo(String name, int nrOfLegs, int avgFlightAltitude, boolean migrates) {
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setAvgFlightAltitude(avgFlightAltitude);
        this.setMigratory(migrates);
    }

}
