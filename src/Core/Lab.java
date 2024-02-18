package Core;

import static Core.Logger.*;

public abstract class Lab {
    protected Invokable[] tasks;

    public final void run() {
        if (tasks.length == 0)
            warning("Запущено задание нереализованной лабы!");
        else {
            for (Invokable task : tasks) {
                task.Invoke();
            }
        }
    }
    public final void run(int itask) {
        if (tasks.length == 0)
            warning("Запущено задание нереализованной лабы!");
        else {
            tasks[itask-1].Invoke();
        }
    }
}
