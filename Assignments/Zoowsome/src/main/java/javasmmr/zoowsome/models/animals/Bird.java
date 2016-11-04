package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public abstract class Bird extends Animal {

    private boolean migrates;
    private int avgFlightAltitude;

    public boolean isMigratory() {
        return migrates;
    }

    public void setMigratory(boolean migrates) {
        this.migrates = migrates;
    }

    public int getAvgFlightAltitude() {
        return avgFlightAltitude;
    }

    public void setAvgFlightAltitude(int avgFlightAltitude) {
        this.avgFlightAltitude = avgFlightAltitude;
    }
}
