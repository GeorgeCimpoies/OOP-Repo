package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public abstract class Mammal extends Animal {

    private float normalBodyTemp;
    private float percBodyHair;

    public float getNormalBodyTemp() {
        return normalBodyTemp;
    }

    public void setNormalBodyTemp(float normalBodyTemp) {
        this.normalBodyTemp = normalBodyTemp;
    }

    public float getPercBodyHair() {
        return percBodyHair;
    }

    public void setPercBodyHair(float percBodyHair) {
        this.percBodyHair = percBodyHair;
    }
}
