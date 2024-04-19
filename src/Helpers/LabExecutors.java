package Helpers;

import java.util.Arrays;

import Core.LabManagement.LabManager;

public class LabExecutors {
    public static void exec(int ilab) throws Exception {
        LabManager.getInstance().run(ilab);
    }
    public static void exec(int ilab, int itask) throws Exception {
        LabManager.getInstance().run(ilab, itask);
    }
    public static void exec(int ilab, int itask, String[] args) throws Exception {
        LabManager.getInstance().run(ilab, itask, args);
    }
    public static void exec(String[] args) throws Exception {
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
