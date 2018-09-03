import Contracts.IGenerator;
import Contracts.IWriter;
import MainElements.Computer;
import MainElements.ConsoleWriter;

public class Main {
    public static void main(String[] args) {
        IWriter writer = new ConsoleWriter();
        IGenerator generator = new Computer();

        Engine engine = new Engine(writer, generator);
        engine.Run();
    }
}
