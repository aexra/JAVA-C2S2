package Labs;

import static Helpers.Logger.*;

import Core.LabCore.Lab;

public class Lab2 extends Lab {
    public static void t1() {
        log("Минимальные и максимальные значения численных типов:\n");
        log("Тип\t\tМинимальное значение\tМаксимальное значение");
        log("byte\t\t" + Byte.MIN_VALUE + "\t\t\t" + Byte.MAX_VALUE);
        log("short\t\t" + Short.MIN_VALUE + "\t\t\t" + Short.MAX_VALUE);
        log("int\t\t" + Integer.MIN_VALUE + "\t\t" + Integer.MAX_VALUE);
        log("long\t\t" + Long.MIN_VALUE + "\t" + Long.MAX_VALUE);
        log("float\t\t" + Float.MIN_VALUE + "\t\t\t" + Float.MAX_VALUE);
        log("double\t" + Double.MIN_VALUE + "\t\t" + Double.MAX_VALUE);
    }
}
