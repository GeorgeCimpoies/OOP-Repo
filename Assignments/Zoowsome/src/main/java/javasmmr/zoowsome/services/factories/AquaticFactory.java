package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.Constants;
import javasmmr.zoowsome.models.animals.Dolphin;
import javasmmr.zoowsome.models.animals.Shark;
import javasmmr.zoowsome.models.animals.Whale;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class AquaticFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Aquatics.Dolphin.equals(type)) {
            return new Dolphin();
        } else if (Constants.Animals.Aquatics.Shark.equals(type)) {
            return new Shark();
        } else if (Constants.Animals.Aquatics.Whale.equals(type)) {
            return new Whale();
        } else  return null;
    }
}