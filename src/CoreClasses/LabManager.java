package CoreClasses;

import java.util.Dictionary;
import java.util.Set;

public class LabManager {
    private static LabManager INSTANCE = null;
    private static final String labsFolder = "src/Labs/";
    private static Dictionary<String, Lab> labs;

    private LabManager() throws Exception {    
        INSTANCE = this;
        init();
    }
    private final void init() throws Exception {
        ClassAccessor.findAllClassesUsingClassLoader("Labs").forEach(cls -> {
            System.out.println(cls);
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
