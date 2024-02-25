package Core.LabCore;

import java.util.Dictionary;
import java.util.Hashtable;

import Core.ClassManagement.ClassAccessor;

import static Helpers.ConsoleHelper.*;
import static Helpers.Logger.*;

public class LabManager {
    private static LabManager INSTANCE = null;
    private static final String labsPackageName = "Labs";
    private static Dictionary<Integer, Class<?>> labs = new Hashtable<>();

    private LabManager() throws Exception {    
        INSTANCE = this;
        init();
    }
    private final void init() throws Exception {
        ClassAccessor.getClassesFromPackage(labsPackageName).forEach(cls -> {
            labs.put(Integer.parseInt(cls.getName().replace("Labs.Lab", "")), cls);
        });
    }

    public final static LabManager getInstance() throws Exception {
        return INSTANCE != null? INSTANCE : new LabManager();
    }

    public final void run(int ilab) throws Exception {
        cls();
        try {
            Lab lab = (Lab)labs.get(ilab).getDeclaredConstructor().newInstance();
            lab.run();
        } catch (Exception ex) {
            error("Не найдено лабы с индексом " + Integer.toString(ilab));
        }
    }
    public final void run(int ilab, String[] args) throws Exception {
        cls();
        try {
            Lab lab = (Lab)labs.get(ilab).getDeclaredConstructor().newInstance();
            lab.run();
        } catch (Exception ex) {
            error("Не найдено лабы с индексом " + Integer.toString(ilab));
        }
    }
    public final void run(int ilab, int itask) throws Exception {
        cls();
        if (itask == 0) {
            run(ilab);
            return;
        }
        try {
            Lab lab = (Lab)labs.get(ilab).getDeclaredConstructor().newInstance();
            lab.run(itask);
        } catch (Exception ex) {
            error("Не найдено лабы с индексом " + Integer.toString(ilab));
        }
    }
    public final void run(int ilab, int itask, String[] args) throws Exception {
        cls();
        if (itask == 0) {
            run(ilab, args);
            return;
        }
        try {
            Lab lab = (Lab)labs.get(ilab).getDeclaredConstructor().newInstance();
            lab.run(itask);
        } catch (Exception ex) {
            error("Не найдено лабы с индексом " + Integer.toString(ilab));
        }
    }
}
