package MainElements;

import Contracts.IWriter;

public class ConsoleWriter implements IWriter {
    public void Write(String message) {
        System.out.println(message);
    }
}
