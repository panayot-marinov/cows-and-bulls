package entities;

import contracts.IGenerator;

import java.util.Random;

public class Computer implements IGenerator {

    @Override
    public Number generateNumber() {
        Random random = new Random();
        Number generatedNumber =
                new Number(random.nextInt((9999 - 1000) + 1) + 1000);

        return generatedNumber;
    }
}
