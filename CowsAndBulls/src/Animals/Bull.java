package animals;

import contracts.IAnimal;

public class Bull implements IAnimal {
    private final String animalType = "Bull";

    public String getAnimalType(){
        return this.animalType;
    }
}
