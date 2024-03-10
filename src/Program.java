import static Helpers.ConsoleHelper.cls;
import static Helpers.LabExecutors.*;

public class Program {
    public static void main(String[] args) throws Exception {
        cls();
        if (args.length != 0) exec(args);
        else exec(2, 0, new String[]{"500", "50", "10", "10", "133", "abcd"});
    }
}
