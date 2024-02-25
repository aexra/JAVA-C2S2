import static Helpers.ConsoleHelper.cls;

import java.util.Arrays;
import Core.LabCore.LabManager;

public class Program {
    public static void main(String[] args) throws Exception {
        cls();
        if (args.length != 0) exec(args);
        else exec(2, 7, new String[]{"500", "50", "10", "10", "133"});
    }

    private static void exec(int ilab) throws Exception {
        LabManager.getInstance().run(ilab);
    }
    private static void exec(int ilab, int itask) throws Exception {
        LabManager.getInstance().run(ilab, itask);
    }
    private static void exec(int ilab, int itask, String[] args) throws Exception {
        LabManager.getInstance().run(ilab, itask, args);
    }
    private static void exec(String[] args) throws Exception {
        switch (args.length) {
            case 1:
                LabManager.getInstance().run(
                    Integer.parseInt(args[0])
                );
                break;

            case 2:
                LabManager.getInstance().run(
                    Integer.parseInt(args[0]),
                    Integer.parseInt(args[1])
                );
                break;

            default:
                LabManager.getInstance().run(
                    Integer.parseInt(args[0]),
                    Integer.parseInt(args[1]),
                    Arrays.copyOfRange(args, 2, args.length)
                );
                break;
        }
    }
}
