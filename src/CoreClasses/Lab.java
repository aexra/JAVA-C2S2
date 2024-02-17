package CoreClasses;

import static CoreClasses.Logger.*;

import java.awt.Desktop.Action;

public abstract class Lab {
    protected Action[] tasks;

    public final void run() {
        warning("Запущена нереализованная лаба!");
    }
    public final void run(int itask) {
        warning("Запущено задание нереализованной лабы!");
    }
}
