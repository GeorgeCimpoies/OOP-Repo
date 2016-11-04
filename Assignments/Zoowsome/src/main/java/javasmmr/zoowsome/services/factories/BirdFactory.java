package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.Constants;
import javasmmr.zoowsome.models.animals.Eagle;
import javasmmr.zoowsome.models.animals.Flamingo;
import javasmmr.zoowsome.models.animals.Owl;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class BirdFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Birds.Owl.equals(type)) {
            return new Owl(); // leave empty constructor, for now!
        } else if (Constants.Animals.Birds.Eagle.equals(type)) {
            return new Eagle();
        } else if (Constants.Animals.Birds.Flamingo.equals(type)) {
            return new Flamingo();
        } else  return null;
    }
}
