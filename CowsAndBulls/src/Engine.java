import contracts.IAnimal;
import contracts.IGenerator;
import contracts.IWriter;
import entities.Number;
import utils.PlayerUtils;

import java.util.ArrayList;

public class Engine {
    private IWriter writer;
    private IGenerator generator;

    public Engine(IWriter writer, IGenerator generator) {
        this.writer = writer;
        this.generator = generator;
    }

    public void run(){
        Number randomNumber =
                generator.generateNumber();

        System.out.println("The game has started!");
       //System.out.println(randomNumber);

        int bullsCount = 0;
        while(bullsCount < 4) {
            Number playerNumber = PlayerUtils.readNumber();
            ArrayList<IAnimal> animals = playerNumber.compareWith(randomNumber);
            bullsCount = 0;
            int cowsCount = 0;
            for (IAnimal animal:
                 animals) {
                switch (animal.getAnimalType()){
                    case "Bull":{
                        bullsCount++;
                        break;
                    }
                    case "Cow":{
                        cowsCount++;
                        break;
                    }
                }
            }

            if(bullsCount == 3 && cowsCount == 1) break;
            String outputMessage = "";
            if(bullsCount > 0) outputMessage += bullsCount + " bulls ";
            if(cowsCount > 0) outputMessage += cowsCount + " cows";
            writer.write(outputMessage);
        }
        System.out.println("Congratulations! You won!");
    }
}
