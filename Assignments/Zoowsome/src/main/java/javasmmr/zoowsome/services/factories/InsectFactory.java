package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.models.Constants;
import javasmmr.zoowsome.models.animals.Butterfly;
import javasmmr.zoowsome.models.animals.Cockroach;
import javasmmr.zoowsome.models.animals.Spider;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
public class InsectFactory extends SpeciesFactory {
    @Override
    public Animal getAnimal(String type) {
        if (Constants.Animals.Insects.Butterfly.equals(type)) {
            return new Butterfly();
        } else if (Constants.Animals.Insects.Cockroach.equals(type)) {
            return new Cockroach();
        } else if (Constants.Animals.Insects.Spider.equals(type)) {
            return new Spider();
        } else  return null;
    }
}
