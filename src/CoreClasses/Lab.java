package CoreClasses;

import java.awt.Desktop.Action;

public abstract class Lab {
    protected Action[] tasks;

    public String register() {
        String name = this.getClass().getName();
        return "" + name.charAt(name.length() - 1);
    }
}
