package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.Constants;
import javasmmr.zoowsome.models.animals.Aligator;
import javasmmr.zoowsome.models.animals.Snake;
import javasmmr.zoowsome.models.animals.Turtle;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class ReptileFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Reptiles.Aligator.equals(type)) {
            return new Aligator();
        } else if (Constants.Animals.Reptiles.Snake.equals(type)) {
            return new Snake();
        } else if (Constants.Animals.Reptiles.Turtle.equals(type)) {
            return new Turtle();
        } else  return null;
    }
}
