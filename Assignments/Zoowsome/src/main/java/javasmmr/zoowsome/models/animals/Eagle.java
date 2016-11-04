package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class Eagle extends Bird {

    public Eagle() {
        this.setName("Arnold");
        this.setNrOfLegs(2);
        this.setAvgFlightAltitude(320);
        this.setMigratory(false);
    }

    public Eagle(String name, int nrOfLegs, int avgFlightAltitude, boolean migrates) {
        this.setName(name);
        this.setNrOfLegs(nrOfLegs);
        this.setAvgFlightAltitude(avgFlightAltitude);
        this.setMigratory(migrates);
    }
}