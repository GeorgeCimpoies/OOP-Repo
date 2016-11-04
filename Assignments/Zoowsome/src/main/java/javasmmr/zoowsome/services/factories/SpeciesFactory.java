package javasmmr.zoowsome.services.factories;

import javasmmr.zoowsome.models.animals.Animal;

/**
 * Created by George Cimpoies on 11/4/2016.
 */
    public abstract class SpeciesFactory {
        public abstract Animal getAnimal(String type);
    }