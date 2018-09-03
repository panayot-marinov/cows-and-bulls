import Contracts.IAnimal;
import Contracts.IGenerator;
import Contracts.IWriter;
import MainElements.Number;
import Utils.PlayerUtils;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.ArrayList;
import java.util.Random;

public class Engine {
    private IWriter writer;
    private IGenerator generator;

    public Engine(IWriter writer, IGenerator generator) {
        this.writer = writer;
        this.generator = generator;
    }

    public void Run(){
        Number randomNumber =
                generator.GenerateNumber();

        System.out.println("The game has started!");
       //System.out.println(randomNumber);

        int bullsCount = 0;
        while(bullsCount < 4) {
            Number playerNumber = PlayerUtils.ReadNumber();
            ArrayList<IAnimal> animals = playerNumber.CompareWith(randomNumber);
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

            String outputMessage = "";
            if(bullsCount > 0) outputMessage += bullsCount + " bulls ";
            if(cowsCount > 0) outputMessage += cowsCount + " cows";
            writer.Write(outputMessage);
        }
        System.out.println("Congratulations! You won!");
    }
}
