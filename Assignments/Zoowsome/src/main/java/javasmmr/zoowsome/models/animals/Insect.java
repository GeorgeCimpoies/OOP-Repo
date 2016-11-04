package javasmmr.zoowsome.models.animals;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public abstract class Insect extends Animal {

    private boolean canFly;
    private boolean isDangerous;

    public boolean isFlying() {
        return canFly;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean isDangerous() {
        return isDangerous;
    }

    public void setDangerous(boolean dangerous) {
        isDangerous = dangerous;
    }
}
