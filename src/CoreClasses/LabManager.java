package CoreClasses;

import java.util.Dictionary;
import java.util.Set;

public class LabManager {
    private static LabManager INSTANCE = null;
    private static final String labsPackageName = "Labs";
    private static Dictionary<String, Lab> labs;

    private LabManager() throws Exception {    
        INSTANCE = this;
        init();
    }
    private final void init() throws Exception {
        ClassAccessor.getClassesFromPackage(labsPackageName).forEach(cls -> {
            try {
                System.out.println(cls.getDeclaredConstructor().newInstance());
            } catch (Exception ex) {}
        });
    }

    public final static LabManager getInstance() throws Exception {
        return INSTANCE != null? INSTANCE : new LabManager();
    }

    public final void run(int lab) throws Exception {

    }
    public final void run(int lab, int task) throws Exception {

    }
}
