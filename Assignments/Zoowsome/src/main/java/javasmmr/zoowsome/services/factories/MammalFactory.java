package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.Constants;
import javasmmr.zoowsome.models.animals.Cow;
import javasmmr.zoowsome.models.animals.Monkey;
import javasmmr.zoowsome.models.animals.Tiger;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class MammalFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Mammals.Cow.equals(type)) {
            return new Cow();
        } else if (Constants.Animals.Mammals.Monkey.equals(type)) {
            return new Monkey();
        } else if (Constants.Animals.Mammals.Tiger.equals(type)) {
            return new Tiger();
        } else  return null;
    }
}
