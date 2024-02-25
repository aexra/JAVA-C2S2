import java.util.Arrays;

import Core.LabCore.LabManager;

public class Program {
    public static void main(String[] args) throws Exception {
        if (args.length > 0) {
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

                case 3:
                    LabManager.getInstance().run(
                        Integer.parseInt(args[0]),
                        Integer.parseInt(args[1]),
                        Arrays.copyOfRange(args, 2, args.length)
                    );
                    break;

                default:
                    break;
            }
                
        }
        else {
            LabManager.getInstance().run(2);
        }
    }
}
