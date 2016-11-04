package javasmmr.zoowsome.controllers;

import javasmmr.zoowsome.models.Constants;
import javasmmr.zoowsome.models.animals.Animal;
import javasmmr.zoowsome.services.factories.AnimalFactory;
import javasmmr.zoowsome.services.factories.SpeciesFactory;

/**
 * Created by George Cimpoies on 11/4/2016.
 */

public class MainController {

    public static void main(String[] args) throws Exception {
        AnimalFactory abstractFactory = new AnimalFactory();
        SpeciesFactory speciesFactory1 = abstractFactory.getSpeciesFactory(Constants.Species.Mammals);
        Animal a1 = speciesFactory1.getAnimal(Constants.Animals.Mammals.Tiger);
        System.out.printf("We have an animal with %d legs!\n", a1.getNrOfLegs());
    }

}
