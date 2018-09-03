package Animals;

import Contracts.IAnimal;

public class Cow implements IAnimal {
    private final String animalType = "Cow";

    public String getAnimalType(){
        return this.animalType;
    }
}
