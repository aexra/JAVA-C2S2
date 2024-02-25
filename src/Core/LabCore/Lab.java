package Core.LabCore;

import static Helpers.Logger.*;

import java.util.TreeMap;
import java.lang.reflect.Method;

public abstract class Lab {
    protected static TreeMap<Integer, Method> tasks = new TreeMap<>();

    public Lab() {
        init();
    }

    public final void run() {
        if (tasks.size() == 0)
            warning("Запущена нереализованная лаба!");
        else {
            tasks.values().forEach((m) -> {
                try {
                    log("Задание №" + m.getName().substring(1) + '\n', "[INFO\t] ");
                    m.invoke(this);
                }
                catch (Exception ex) {
                    error("Method <" + m.getName() + "> cannot be invoked");
                }
                log("\n\n", "");
            });
        }
    }
    public final void run(int itask) {
        if (tasks.size() == 0)
            warning("Запущено задание нереализованной лабы!");
        else {
            try {
                tasks.get(itask).invoke(this);
            }
            catch (Exception ex) {
                error("Method <" + tasks.get(itask).getName() + "> cannot be invoked");
            }
        }
    }

    private final void init() {
        fillTasksArray();
    }
    private final void fillTasksArray() {
        for (Method m : this.getClass().getDeclaredMethods()) {
            if (m.getName().charAt(0) == 't') {
                int a;
                try {
                    a = Integer.parseUnsignedInt(m.getName().substring(1)); 
                }
                catch (NumberFormatException ex) {
                    continue;
                }
                tasks.put(a, m);
            }
        }
    }
}
