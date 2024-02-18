package Core.LabCore;

import static Helpers.Logger.*;

import Core.Interfaces.Invokable;

public abstract class Lab {
    protected Invokable[] tasks = new Invokable[]{};

    public final void run() {
        if (tasks.length == 0)
            warning("Запущена нереализованная лаба!");
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
