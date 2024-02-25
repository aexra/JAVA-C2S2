import java.util.Arrays;

import Core.LabCore.LabManager;

public class Program {
    public static void main(String[] args) throws Exception {
        switch (args.length) {
            case 0:
                LabManager.getInstance().run(2);
                break;

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
