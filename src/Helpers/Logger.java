package Helpers;

public class Logger {
    public static final void log(String msg) {
        System.out.println("[debug\t] " + msg);
    }
    public static final void log(String msg, String prefix) {
        System.out.println(prefix + msg);
    }
    public static final void log(String msg, String prefix, boolean newLine) {
        if (newLine) System.out.println(prefix + msg);
        else System.out.print(prefix + msg);
    }
    public static final void log(Object obj) {
        System.out.println("[debug\t] " + obj.toString());
    }
    public static final void log(Object obj, String prefix) {
        System.out.println(prefix + obj.toString());
    }
    public static final void log(Object obj, String prefix, boolean newLine) {
        if (newLine) System.out.println(prefix + obj.toString());
        else System.out.print(prefix + obj.toString());
    }
    public static final void warning(String msg) {
        System.out.println("[warning] " + msg);
    }
    public static final void error(String msg) {
        System.out.println("[error\t] " + msg);
    }
    public static final void error(Exception ex) {
        System.out.println("[error\t] " + ex);
    }
}
