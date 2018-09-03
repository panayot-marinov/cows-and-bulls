package entities;

import contracts.IWriter;

public class ConsoleWriter implements IWriter {
    public void write(String message) {
        System.out.println(message);
    }
}
