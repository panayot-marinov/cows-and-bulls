package MainElements;

import Contracts.IGenerator;
import MainElements.Number;

import java.util.Random;

public class Computer implements IGenerator {

    @Override
    public Number GenerateNumber() {
        Random random = new Random();
        Number generatedNumber =
                new Number(random.nextInt((9999 - 1000) + 1) + 1000);

        return generatedNumber;
    }
}
