import static Helpers.ConsoleHelper.cls;
import static Helpers.LabExecutors.*;

public class Program {
    public static void main(String[] args) throws Exception {
        cls();
        if (args.length != 0) exec(args);
        else exec(3);
    }
}
