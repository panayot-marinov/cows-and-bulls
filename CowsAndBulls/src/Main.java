import contracts.IGenerator;
import contracts.IWriter;
import entities.Computer;
import entities.ConsoleWriter;

public class Main {
    public static void main(String[] args) {
        IWriter writer = new ConsoleWriter();
        IGenerator generator = new Computer();

        Engine engine = new Engine(writer, generator);
        engine.run();
    }
}
